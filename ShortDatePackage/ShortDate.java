package ShortDatePackage;

public class ShortDate {
	private int day;
	private int month;
    ShortDate()	{
		this(1,1);
    }
    ShortDate(int day, int month) {
    	if ((month > 12 || month < 0) || (day > PosibleDay(month) || day < 1)) {
    		System.out.println("Error creating "+day+"."+month);
    	}
    	this.day = day;
    	this.month = month;
    }
    int getMonth() {
    	return month;    	
    }
    int getDay() {
    	return day;
    }
    boolean set(int day, int month){
    	if (month > 12 || month < 0) {
    		return false;
    	} else if ( day > PosibleDay(month)) {
    		return false;
    	}
    	this.day = day;
    	this.month = month;
    	return true;
    }
    @Override
	public String toString() {
    	return (day+"."+month);
    }
    boolean increment(){
    	if (month == 12 && day == 31) {
    		day = 1;
    		month = 1;
    		return false;
    	} else if (day < PosibleDay(month)){										//Масяня,я тебе люблю))
    		day++;
    		return true;
    	} else {
    		month++;
    		day=1;
    		return true;
    	}
    }
    private int PosibleDay(int month) {
    	int pd;
    	pd = 28+(month + (month/8))%2+2%month+2*(1/month);
    	return pd;
    }

}

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class AgeInHour {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		GregorianCalendar birth = new GregorianCalendar();
		Date now = new Date();
		int year,month,date;
		System.out.println("Введите год, месяц, день");
		year=Integer.parseInt(scr.nextLine());
		month=Integer.parseInt(scr.nextLine());
		date=Integer.parseInt(scr.nextLine());
		birth.set(year, month, date);
		System.out.println("Birth\t"+birth.getTimeInMillis());
		System.out.println("Now\t"+now.getTime());
		Long A = now.getTime();
		Long B = birth.getTimeInMillis();
		System.out.println((A-B)/(3600000));
		
	}

}

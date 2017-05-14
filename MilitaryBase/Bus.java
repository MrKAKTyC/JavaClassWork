package MilitaryBase;

public class Bus extends Vehicle implements IBus{
	int pasengers;
	int Max_pasengers;

    Bus(int people, int max_people, double petrol, double max_petrol)
    {
    	super(petrol,max_petrol);
    	Max_pasengers=max_people;
    	pasengers = people;
    }
    public int getPeopleCount()
    {
    	return pasengers;
    }
    public int getMaxPeople()
    {
    	return Max_pasengers;
    }
    public void arrive()
    {
    Base.people_on_base+=pasengers+1;
    this.pasengers=0;
    Base.vehicles_on_base++;
    }
    public boolean leave()
    {
    	if(Base.people_on_base < 1 || (Base.petrol_on_base < (this.tank_volume-this.petrol_amount)) || Base.vehicles_on_base<1)
    	{
    		return false;
    	} else {
    		if(Base.people_on_base>(Max_pasengers+1)){
    			Base.people_on_base-=(Max_pasengers+1);
    			this.pasengers=Max_pasengers;
    		} else {
    			this.pasengers = Base.people_on_base;
    			Base.people_on_base = 0;
    		}
    		Base.petrol_on_base-=(this.tank_volume-this.petrol_amount);
    		this.petrol_amount = this.tank_volume;
    		Base.vehicles_on_base--;
    		return true;
    	}    	
    }
	

}

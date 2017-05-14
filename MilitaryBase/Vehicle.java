package MilitaryBase;

public class Vehicle implements IVehicle{
	int Driver = 1;
	double tank_volume;
	double petrol_amount;
	
    Vehicle(double petrol_amount, double tank_volume)
    {
    	this.tank_volume = tank_volume;
    	this.petrol_amount=petrol_amount;
    }
    public double getTankVolume()
    {
    	return tank_volume;
    }
    public double getPetrolAmount() 
    {
    	return petrol_amount;
    }
    public void arrive() 
    {
    	Base.people_on_base++;
    	Base.vehicles_on_base++;
    }
    public boolean leave()
    {
    	if(Base.people_on_base <= 1 || (Base.petrol_on_base < (this.tank_volume-this.petrol_amount) || Base.vehicles_on_base<1))
    	{
    		return false;
    	} else {
    		Base.people_on_base--;
    		Base.petrol_on_base-=(this.tank_volume-this.petrol_amount);
    		this.petrol_amount=this.tank_volume;
    		Base.vehicles_on_base--;
    		return true;
    	}
    }
}

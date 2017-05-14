package MilitaryBase;

public class Truck extends Vehicle implements ITruck{
	double Cargo;
	double Max_Cargo;
    
	Truck(double load, double max_load, double petrol, double max_petrol)
	{
		super(petrol, max_petrol);
		Max_Cargo = max_load;
		Cargo = load;
	}
    public double getCurrentLoad()
    {
    	return Cargo;
    }
    public double getMaxLoad()
    {
    	return Max_Cargo;
    }
    public void arrive() 
    {
    	Base.people_on_base++;
    	Base.vehicles_on_base++;
    	Base.goods_on_base+=Cargo;
    	this.Cargo=0;
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
    		if(this.Max_Cargo>=Base.goods_on_base)
    		{
    			this.Cargo=Base.goods_on_base;
    			Base.goods_on_base=0;
    		} else {
    			this.Cargo = this.Max_Cargo;
    			Base.goods_on_base-=this.Cargo;
    		}
    		Base.vehicles_on_base--;
    		return true;
    	}
    }

}

package MilitaryBase;

public interface ITruck extends IVehicle{
	
	double getCurrentLoad();
	double getMaxLoad();
	void arrive();
	boolean leave();

}

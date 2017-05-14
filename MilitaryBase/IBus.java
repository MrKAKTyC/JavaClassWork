package MilitaryBase;

public interface IBus extends IVehicle{
	
	int getPeopleCount();
	int getMaxPeople();
	void arrive();
	boolean leave();

}

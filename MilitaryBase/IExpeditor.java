package MilitaryBase;

public interface IExpeditor extends IBus, ITruck{
	
	double getCurrentLoad();
	double getMaxLoad();
	int getPeopleCount();
	int getMaxPeople();
	void arrive();
	boolean leave();

}

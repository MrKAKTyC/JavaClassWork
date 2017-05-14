package MilitaryBase;

public class Expeditor extends Vehicle implements IExpeditor {
	int pasengers;
	int Max_pasengers;
	double Cargo;
	double Max_Cargo;

	Expeditor(int pasengers, int Max_pasengers,double Cargo, double Max_Cargo, double petrol_amount, double tank_volume) {
		super(petrol_amount, tank_volume);
		this.pasengers = pasengers;
		this.Max_pasengers = Max_pasengers;
		this.Cargo = Cargo;
		this.Max_Cargo = Max_Cargo;
	}

	@Override
	public double getMaxLoad() {
		// TODO Auto-generated method stub
		return this.Max_Cargo;
	}

	@Override
	public int getPeopleCount() {
		// TODO Auto-generated method stub
		return this.pasengers;
	}

	@Override
	public int getMaxPeople() {
		// TODO Auto-generated method stub
		return this.Max_pasengers;
	}

	@Override
	public double getCurrentLoad() {
		// TODO Auto-generated method stub
		return this.Cargo;
	}


}

package CowsAndBulls;

public class AtemptNumber extends Number {

	private int Cows;
	private int Bulls;

	public AtemptNumber(int Number, int Cows, int Bulls) {
		super(Number);
		this.Cows = Cows;
		this.Bulls = Bulls;
	}
	public int GetBulls() { return this.Bulls; }
	public int GetCows() { return this.Cows; }

	public void Print() {
		System.out.println("———————————");
		System.out.println(this.toString());
		System.out.println("———————————");
	}

	@Override
	public String toString() {
		return ("| " + Cows + "C | " + Bulls + "B |");
	}

}

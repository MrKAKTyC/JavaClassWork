package TractoristePackage;

public class TraktoristList {
	final String NAME = "Ivanov";
	final double AVG = 4.0;
	final int YEAR = 1;

	Traktorist[] Tl;
	int count = 0;

	public TraktoristList(int n) {
		Tl = new Traktorist[n];
	}

	public boolean add(String name, double avg, int year) {
		if ((year < 1 || year > 2) || (avg < 1.0 || avg > 5.0) || name.length()<1 || count>=Tl.length) {
			return false;
		} else {
			Tl[count] = new Traktorist(name, avg, year);
			count++;
			return true;
		}
	}

	public boolean add(String name) {
		return add(name, AVG, YEAR);
	}

	public boolean add(double avg) {
		return add(NAME, avg, YEAR);
	}

	public boolean add(int year) {
		return add(NAME, AVG, year);
	}

	public boolean add(String name, double avg) {
		return add(name, avg, YEAR);
	}

	public boolean add(String name, int year) {
		return add(name, AVG, year);
	}

	public boolean add(double avg, int year) {
		return add(NAME, avg, year);
	}
	public boolean add() {
		return add(NAME, AVG, YEAR);
	}

	public void print() {
		for (int i = 0; Tl[i]!=null;i++) {
			System.out.println(Tl[i]);
		}
	}
}

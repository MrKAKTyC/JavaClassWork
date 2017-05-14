package TractoristePackage;

public class Traktorist {
	private String name;
	private double avg;
	private int year;
	Traktorist(String name, double avg, int year) {
		this.name = name;
		this.avg = avg;
		this.year = year;
	}
	@Override
	public String toString() {
		return (name+' '+avg+' '+year);
	}
}
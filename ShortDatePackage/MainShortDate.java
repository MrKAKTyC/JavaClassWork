package ShortDatePackage;

public class MainShortDate {

	public static void main(String[] args) {
		ShortDate[] sd = new ShortDate[5];
		sd[0] = new ShortDate(8, 3);
		sd[1] = new ShortDate(16, 4);
		sd[2] = new ShortDate(1, 5);
		sd[3] = new ShortDate(9, 5);
		sd[4] = new ShortDate(5, 6);
		for (ShortDate s : sd) {
			System.out.println(s);
		}
		System.out.println("Now add 1 date");
		ShortDate[] sd2 = new ShortDate[6];
		System.arraycopy(sd, 0, sd2, 0, sd.length);
		
		sd2[5] = new ShortDate(28, 6);
		for (ShortDate s : sd2) {
			System.out.println(s);
		}
		System.out.println("now delet last date");
		sd2[5] = null;
		for (ShortDate s : sd2) {
			System.out.println(s);
		}
	}

}

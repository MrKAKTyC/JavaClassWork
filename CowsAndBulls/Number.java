package CowsAndBulls;

public class Number {

	char[] numer;

	public Number(int number) {
			this.numer = String.valueOf(number).toCharArray();
	}

	public Number() {
		char[] def = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		this.numer = new char[4];
		do{
		for (int x = 0; x < def.length; ++x) {
			int index1 = (int) (Math.random() * def.length), index2 = (int) (Math.random() * def.length);
			char a = def[index1];
			def[index1] = def[index2];
			def[index2] = a;
		}
		System.arraycopy(def, 0, this.numer, 0, 4);
		}while(numer[0]==0);
	}

	public static boolean hasMatch(int number) {
		char[] tmp = String.valueOf(number).toCharArray();
		boolean match = false;
		for (int i = 0; i < 3; i++)
			for (int j = i + 1; j < 3; j++) {
				if (tmp[i] == tmp[j]) {
					match = true;
					return match;
				}
			}
		return match;
	}

	public AtemptNumber Compare(int purpose) {
		AtemptNumber Anum = new AtemptNumber(purpose, this.findCows(purpose)-this.findBulls(purpose), this.findBulls(purpose));
		return Anum;
	}

	private int findBulls(int purpose) {
		int bulls = 0;
		char[] tmp = String.valueOf(purpose).toCharArray();
		for (int i = 0; i < 4; i++) {
			if (this.numer[i] == tmp[i])
				bulls++;
		}
		return bulls;
	}

	private int findCows(int purpose) {
		int cows = 0;
		char[] tmp = String.valueOf(purpose).toCharArray();
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (numer[i] == tmp[j]) {
					cows++;
					break;
				}
			}
		}
		return cows;
	}

	@Override
	public String toString() {
		return String.copyValueOf(this.numer);
	}

}

import java.util.Scanner;

public class Runners {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int NumberORuners = scr.nextInt();
		scr.nextLine();
		String[] ArrayOfRunersName = new String[NumberORuners];
		double[] ArrayOfRunersTime = new double[NumberORuners];
		for (int i = 0; i < NumberORuners; i++) {
			ArrayOfRunersName[i] = scr.nextLine();
			ArrayOfRunersTime[i] = Double
					.parseDouble(ArrayOfRunersName[i].substring(ArrayOfRunersName[i].indexOf(" "))); // записуємо
																										// час
		}
		sort(ArrayOfRunersName, ArrayOfRunersTime);
		print(ArrayOfRunersName);
	}

	public static void sort(String[] ArrayOfRunersName, double[] ArrayOfRunersTime) {
		{
			for (int min = 0; min < ArrayOfRunersTime.length - 1; min++) {
				int least = min;
				for (int j = min + 1; j < ArrayOfRunersTime.length; j++) {
					if (ArrayOfRunersTime[j] < ArrayOfRunersTime[least]) {
						least = j;
					}
				}
				double Dtmp = ArrayOfRunersTime[min]; // double swap
				ArrayOfRunersTime[min] = ArrayOfRunersTime[least];
				ArrayOfRunersTime[least] = Dtmp;
				String Stmp = ArrayOfRunersName[min]; // string swap
				ArrayOfRunersName[min] = ArrayOfRunersName[least];
				ArrayOfRunersName[least] = Stmp;
			}
		}
	}

	public static void print(String[] ArrayOfRunersName) {
		for (int i = 0; i < 3; i++) {
			System.out.println((i + 1) + " " + ArrayOfRunersName[i]);
		}
	}
}

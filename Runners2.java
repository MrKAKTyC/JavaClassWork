import java.util.Locale;
import java.util.Scanner;

public class Runners2 {

	static Scanner scr = new Scanner(System.in).useLocale(Locale.US);

	public static void main(String[] args) {
		int NumberORuners = Integer.parseInt(scr.nextLine());
		String[] ArrayOfRunersName = new String[NumberORuners];
		double[] ArrayOfRunersTime = new double[NumberORuners];

		for (int i = 0; i < NumberORuners; i++) // запис в масиви
		{
			// scr.nextLine();
			ArrayOfRunersName[i] = scr.nextLine();
			ArrayOfRunersTime[i] = Double
					.parseDouble(ArrayOfRunersName[i].substring(ArrayOfRunersName[i].indexOf(' ')));
			// ArrayOfRunersName[i]=scr.next();
			// ArrayOfRunersTime[i]=scr.nextDouble();
		}
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
		{
			int pos = 1;
			for (int i = 0; i < 3; i++) {
				System.out.println(pos + " " + ArrayOfRunersName[i]); // "
																		// "+ArrayOfRunersTime[i]
				pos++;
			}
		}
	}
}

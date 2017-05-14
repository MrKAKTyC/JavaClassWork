import java.util.Locale;
import java.util.Scanner;

public class Runners1 {

	
	public static void main(String[] args) {	
	Scanner scr = new Scanner(System.in).useLocale(Locale.US);
	int NumberORuners = scr.nextInt();
	String[] ArrayOfRunersName = new String[NumberORuners];
	double[] ArrayOfRunersTime = new double[NumberORuners];
	
	for(int i=0;i<NumberORuners;i++)	//запис в масиви
	{
		ArrayOfRunersName[i]=scr.next();
		ArrayOfRunersTime[i]=scr.nextDouble();
	}
	Sort(ArrayOfRunersName, ArrayOfRunersTime);
	Print(ArrayOfRunersName, ArrayOfRunersTime);

	}

	private static void Sort(String[] AORN, double[] AORT)
	{
		for (int min=0;min<AORT.length-1;min++) {
			int least = min;
			for (int j=min+1;j<AORT.length;j++) {
			    if(AORT[j] < AORT[least]) {
					least = j;
				}
			}
			
			double Dtmp = AORT[min];	//double swap
			AORT[min] = AORT[least];
			AORT[least] = Dtmp;
			String Stmp = AORN[min];	//string swap
			AORN[min] = AORN[least];
			AORN[least] = Stmp;
		}
	}
	private static void Print(String[] AORN, double[] AORT)
	{
		int pos = 1;
		for(int i=0;i<3;i++)
		{
			System.out.println(pos+" "+AORN[i]+" "+AORT[i]);
			pos++;
		}
	}

}

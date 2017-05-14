import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		//NameAndAge();
		//AgeAndName();
		DecToBin(10);
		DecToBin2(10);
		int a = 10;
		double b = 4.102384729;
		System.out.printf("int - %d%ndouble %f or %.3f%n",a,b,b);
		
		System.out.println("5/2 = " + (double)5/2);
		System.out.println("2/5 = " + (double)2/5);
		double f = 6.945;
		System.out.println((int)f);
		System.out.println(Math.round(f));
	}

	public static void NameAndAge() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введіть ваше ім’я");
		String name = sc.next();
		System.out.println("Введіть ваш вік");
		int age = sc.nextInt();
		System.out.printf("Hello, %s! Next year you'll be %d.%n", name, ++age);
	}

	public static void AgeAndName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введіть ваш вік");
		int age = sc.nextInt();
		System.out.println("Введіть ваше ім’я");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.printf("Hello, %s! Next year you'll be %d.%n", name, ++age);
	}
	public static int DecToBin(int dec)
	{
		int bin = -1;
		String sbin = "", tmpsbin = "";
		System.out.println(Integer.toBinaryString(dec));
		while(dec>0)
		{
			tmpsbin =tmpsbin + Integer.toString(dec%2);
			dec /= 2;
		}
		for(int i = tmpsbin.length()-1;i>=0;i--)
		{
			sbin=sbin+tmpsbin.charAt(i);
		}
		System.out.println(sbin);
		return bin;
	}
	public static int DecToBin2(int dec)
	{
		String sbin= "";
		int bin;
		while(dec >= 0){
			int tmp = 2, p=1;
			while(tmp <= dec){
				tmp = (int) Math.pow(tmp, p++);
			}
			dec = dec - tmp;
			sbin = sbin + Integer.toString(p);
		}
		System.out.println(sbin);
		return dec;
	}
	/*
	 1 Integer	 - 32 bit
	 2 Short	 - 16 bit
	 3 Long		 - 64 bit
	 4 Double	 - 64 bit
	 5 Float	 - 32 bit
	 6 char		 - 16 bit
	 7 byte		 - 8 bit
	 8 boolean	 - 8/32 bit
	 */
}

package CowsAndBulls;

import java.util.Scanner;

public abstract class TheGame {
	static int atempt = 0;
	static Scanner reader = new Scanner(System.in);

	public static void Run(int mod) {
		Number main = null;
		switch (mod) {
		case 1: {
			System.out.println("Загадайте число");
			do {
				int numb = Integer.parseInt(reader.nextLine());
				if (String.valueOf(numb).length() == 4 && !Number.hasMatch(numb) && !(numb<999))
					main = new Number(numb);
				else
					System.out.println("Число має бути 4 значним, не мати повторів і не починатися з 0. Спробуйте ще раз");
			} while (main == null);
		}
			break;
		case 2: {
			main = new Number();
			}
		}
		System.out.println("А тепер спробуйте його відгадати");
		do {
			int num = reader.nextInt();
			AtemptNumber Anum = main.Compare(num);
			Anum.Print();
			atempt++;
			if (Anum.GetBulls() == 4)
				break;
		} while (true);
		reader.close();
		System.out.println("Відгадано!\nЗа " + atempt + " спроб");
	}
}

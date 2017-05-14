package CowsAndBulls;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		System.out.println("Оберіть режим гри\n1:Загадати число самому\n2:Відгадати число комп’ютера");
		int choise;
		do {
			Scanner scr = new Scanner(System.in);
			choise = scr.nextInt();
		} while (choise < 1 || choise > 2);
		TheGame.Run(choise);
	}

}

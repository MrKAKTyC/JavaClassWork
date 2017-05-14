package network;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.sun.org.apache.xml.internal.resolver.Catalog;

public class Emulation {

	public static void main(String[] args) {

		// Router rt1 = new Router(1, "rt1");
		// Router rt2 = new Router(4, "rt2");
		// Computer cp1 = new Computer(0, "cp1");
		// Computer cp2 = new Computer(2, "cp2");
		// Computer cp3 = new Computer(3, "cp3");
		// rt2.ConnectTo(rt1);
		// rt1.ConnectTo(rt2);
		// cp1.ConnectTo(rt1);
		// cp2.ConnectTo(rt1);
		// cp3.ConnectTo(rt2);
		// rt1.getRouts().toPrint();

		Computer cmp1 = new Computer(0, "cmp1");
		Computer cmp2 = new Computer(1, "cmp2");

		Router rot1 = new Router(2, "A");
		Router rot2 = new Router(3, "B");
		Router rot3 = new Router(4, "C");
		Router rot4 = new Router(5, "D");
		Router rot5 = new Router(6, "E");
		Router rot6 = new Router(7, "F");

		cmp1.Pconect(rot1);
		cmp2.Pconect(rot6);

		rot1.Pconnect(rot2);
		rot1.Pconnect(rot3);

		rot4.Pconnect(rot2);
		rot4.Pconnect(rot3);
		rot4.Pconnect(rot5);

		rot5.Pconnect(rot3);
		rot5.Pconnect(rot6);

		// A
		rot1.HRouting(rot3, rot4, rot5, rot6, cmp2);
		// B
		rot2.HRouting(rot4, rot3, rot5, rot6, cmp2);
		rot2.HRouting(rot1, cmp1);
		// C
		rot3.HRouting(rot1, cmp1, rot2);
		rot3.HRouting(rot5, cmp2, rot6);
		// D
		rot4.HRouting(rot2, rot1, cmp1);
		rot4.HRouting(rot5, rot6, cmp2);
		// E
		rot5.HRouting(rot3, rot1, rot2, cmp1);
		rot5.HRouting(rot6, cmp2);
		// F
		rot6.HRouting(rot5, rot1, rot2, rot3, rot4, cmp1);

		while (true) {
			System.out.println("1. Таблиця маршрутизації\n2. Написати повідомлення");
			Scanner scr = new Scanner(System.in);
			int menu;
			try {
				menu = scr.nextInt();
				scr.nextLine();
			} catch (Exception e) {
				menu = 0;
			}
			switch (menu) {
			case 1:
				System.out.println("Введіть адрес або назву роутера");
				Router ToPrint = null;
				String param = scr.nextLine();
				ToPrint = Router.Find(param);
				if (ToPrint == null) {
					try {
						ToPrint = Router.Find(Integer.parseInt(param));
					} catch (NumberFormatException e) {
						System.out.println("Роутера з такою назвою не існує, а якщо це був порт, то ти щось наплутав");
						break;
					}
				}
				try {
					ToPrint.getRouts().toPrint();
				} catch (NullPointerException e) {
					System.out.println("Хм-м, схоже такого роутера немає в мережі. Ви впевнені що ввели вірні данні?");
				}

				break;
			case 2:
				Computer from, to = null;
				System.out.print("From ");
				param = scr.nextLine();
				from = Computer.Find(param);
				if (from == null) {
					try {
						from = Computer.Find(Integer.parseInt(param));
					} catch (NumberFormatException e) {
						System.out
								.println("Комп'ютера з такою назвою не існує, а якщо це був порт, то ти щось наплутав");
						break;
					}
				}
				System.out.print("To ");
				param = scr.nextLine();
				to = Computer.Find(param);
				if (to == null) {
					try {
						to = Computer.Find(Integer.parseInt(param));
					} catch (NumberFormatException e) {
						System.out
								.println("Комп'ютера з такою назвою не існує, а якщо це був порт, то ти щось наплутав");
						break;
					}
				}
				String text = scr.nextLine();
				Message msg = new Message(from, to, text);
				from.send(msg, from);
				break;
			default:
				break;
			}

		}

	}

}

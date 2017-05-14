package Colections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;

public class ColectionTest {

	public static void main(String[] args) {
		LinkedList<Object> LL = new LinkedList<>();
		ArrayList<Object> AL = new ArrayList<>();
		ArrayDeque<Object> AD = new ArrayDeque<>();
		long beg, end;
		// LinkedList
		System.out.println("\tLinkedList");
		beg = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			LL.addFirst(i);
		}
		end = System.currentTimeMillis();
		System.out.print("beg " + (end - beg));
		LL = new LinkedList<>();
		beg = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			LL.addLast(i);
		}
		end = System.currentTimeMillis();
		System.out.print("| end " + (end - beg));
		LL = new LinkedList<>();
		beg = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			LL.add((int) Math.random() * 1000, i);
		}
		end = System.currentTimeMillis();
		System.out.print("| rand " + (end - beg));

		beg = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			LL.set((int) Math.random() * 1000, i);
		}
		end = System.currentTimeMillis();
		System.out.println("| mode " + (end - beg));
		// ArrayList=====================================
		System.out.println("\tArrayList");
		beg = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			AL.add(0, i);
		}
		end = System.currentTimeMillis();
		System.out.print("beg " + (end - beg));
		AL = new ArrayList<>();
		
		beg = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			AL.add(i);
		}
		end = System.currentTimeMillis();
		System.out.print("| end " + (end - beg));
		AL = new ArrayList<>();
		
		beg = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			AL.add((int) Math.random() * 1000, i);
		}
		end = System.currentTimeMillis();
		System.out.print("| rand " + (end - beg));

		beg = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			AL.set((int) Math.random() * 1000, i);
		}
		end = System.currentTimeMillis();
		System.out.println("| mode " + (end - beg));
		// ArrayDeque=====================================
		System.out.println("\tArrayDeque");
		beg = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			AD.addFirst(i);
		}
		end = System.currentTimeMillis();
		System.out.print("beg " + (end - beg));
		AD = new ArrayDeque<>();
		
		beg = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			AD.add(i);
		}
		end = System.currentTimeMillis();
		System.out.print("| end " + (end - beg));

		beg = System.currentTimeMillis();
//		for (int i = 0; i < 100000; i++) {
//			AD.add((int) Math.random() * 1000, i);
//		}
		end = System.currentTimeMillis();
		System.out.print("| rand " + (end - beg));

		beg = System.currentTimeMillis();
//		for (int i = 0; i < 100000; i++) {
//			AD.set((int) Math.random() * 1000, i);
//		}
		end = System.currentTimeMillis();
		System.out.println("| mode " + (end - beg));

	}

}

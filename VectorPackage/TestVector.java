package VectorPackage;

import java.util.Vector;

public class TestVector {

	public static void main(String[] args) {
		final int M = 1024 * 1024 / 8; // 1 Mb
		// Vector ins = new V(32);
		Vector ins = new Vector(32);
		for (int i = 0; i < 60 * M; i++) {
			ins.insertElementAt(i + 8, i);
			System.out.println(i);
		}
		// Это не должно зависнуть :)
	}
}
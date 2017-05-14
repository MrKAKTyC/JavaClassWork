package MilitaryBase;

public class NewTest {

	public static void main(String[] args) {
		Base b = new Base();
		
		b.petrol_on_base = 1000;
		b.people_on_base = 10;
		b.goods_on_base  = 20.000;
		b.vehicles_on_base = 10;

		// polymorphism!
		IVehicle v = new Expeditor(3, 5, 3.0, 5.0, 200, 300);
		v.arrive();

		assert(b.people_on_base == 14);   // 10 + 3 + driver
		assert(b.goods_on_base == 23.0);  // 20 + 3
		assert(b.vehicles_on_base == 11); // 10 + 1

		v.leave();

		assert(b.people_on_base == 14 - 6);       // 5+driver left
		assert(b.goods_on_base == 23.0 - 5.0);    // 5 tons left
		assert(b.petrol_on_base == 900);          // minus (300-200)
		assert(b.vehicles_on_base == 10);

		System.out.println("OK");
	}

}

package VectorPackage;

public class Vector {
	protected double[] array;
	int size = 0;

	public Vector(double[] array) {
		this.array = array.clone();
		this.size = array.length;
	}

	public Vector(int capasity) {
		if (capasity == 0)
			throw new AssertionError();
		this.array = new double[capasity];
	}

	public Vector() {
		this(2);
	}

	public int getSize() {
		return size;
	}

	public double get(int pos) {
		if(pos<0 || pos >= array.length-1)
			throw new AssertionError();
		return array[pos];
	}

	public void set(double val, int pos) {
		if(pos<0 || pos >= array.length)
			throw new AssertionError();
		array[pos] = val;
	}

	public void insert(double val, int pos) {
		if(pos<0 || pos >= array.length)
			throw new AssertionError();
		if(pos+1>=array.length || size+1>=array.length)
		{
			double[] newarray = new double[array.length*2];
			System.arraycopy(array, 0, newarray, 0, array.length);
			this.array = newarray;
		}
		for (int i = array.length-1;i>pos;i--) {
			array[i]=array[i-1];
		}
		array[pos]=val;
		this.size++;
	}

	public void erase(int pos)throws AssertionError{
		if(pos<0 || pos >= array.length-1)
			throw new AssertionError();
		
		for (int i = pos; i<array.length-2; i++) {
			array[i]=array[i+1];
		}
		size--;
	}

	public void clear() {
		this.array = new double[2];
		size = 0;
	}

	public void print() {
		if (size == 0) {
			System.out.println("Empty");
		} else {
		for (double d : array) {
			if (d == 0.0)
				continue;
			System.out.print(d + " ");
		}
		System.out.println();
		}
	}
	@Override
	protected Object clone(){
		double[] clonearr = new double[this.array.length];
		System.arraycopy(array, 0, clonearr, 0, array.length);
		Vector clone = new Vector(clonearr);
	return clone;
	}
}

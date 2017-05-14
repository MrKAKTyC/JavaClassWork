package StackAndQueuePackage;

import VectorPackage.Vector;

class BadStack extends Vector{
	private int pos;
	
	public BadStack() {
		super(1);
		this.pos = 0;
	}
	public void push(double val) {
		insert(val, pos);
		pos++;
	}
	public double pop() {
		pos--;
		double tmp = get(pos);
		erase(pos);
		return tmp;
	}
	public int getSize() {
		return getSize();
	}
	public void clear() {
		clear();
		this.pos=0;
	}
}
class BadQueue extends Vector {
	private int enter;
	
	public BadQueue() {
		super(1);
		enter = 0;
	}
	public void enqueue(double val) {
		insert(val, enter);
		enter++;
	}
	public double dequeue() {
		double tmp = get(0);
		erase(0);
		enter--;
		return tmp;
	}
	public int getSize() {
		return getSize();
	}
	public void clear() {
		clear();
		enter=0;
	}
	
}
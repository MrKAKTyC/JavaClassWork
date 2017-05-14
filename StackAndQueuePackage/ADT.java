package StackAndQueuePackage;

import VectorPackage.Vector;

class Stack {
	private Vector array;
	private int pos;
	
	public Stack() {
		this.array = new Vector(1);
		this.pos = 0;
	}
	public void push(double val) {
		this.array.insert(val, pos);
		pos++;
	}
	public double pop() {
		this.pos--;
		double tmp = this.array.get(pos);
		this.array.erase(pos);
		return tmp;
	}
	public int getSize() {
		return this.array.getSize();
	}
	public void clear() {
		this.array.clear();
		this.pos=0;
	}
}
class Queue {
	private Vector array;
	private int enter;
	
	public Queue() {
		this.array = new Vector(1);
		enter = 0;
	}
	public void enqueue(double val) {
		this.array.insert(val, enter);
		enter++;
	}
	public double dequeue() {
		double tmp = this.array.get(0);
		this.array.erase(0);
		enter--;
		return tmp;
	}
	public int getSize() {
		return this.array.getSize();
	}
	public void clear() {
		this.array.clear();
	}
	
}
package network;

import java.util.ArrayList;

abstract class Node {
	private int address;
	private String name;

	Node(int addres, String name) {
		this.address = addres;
		this.name = name;
	}

	public void send(Message msg, Node sender) {
	}

	public void ConnectTo(Router target) {
	}

	public int getAddress() {
		return address;
	}

	public String getName() {
		return name;
	}

	public void reSpam(ArrayList<Node> visited, Router router, Computer comp) {
	}

	@Override
	public String toString() {
		return this.getName() + " " + this.getAddress();
	}

}

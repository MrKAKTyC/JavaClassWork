package network;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Computer extends Node {

	private static ArrayList<Computer> ListOfComputers = new ArrayList<>();
	private Router exit;

	Computer(int addres, String name) {
		super(addres, name);
		ListOfComputers.add(this);
	}

	Router getExit() {
		return exit;
	}
	static Computer Find(int addres){
		for (Iterator<Computer> iterator = ListOfComputers.iterator(); iterator.hasNext();) {
			Computer computer = (Computer) iterator.next();
			if(computer.getAddress() == addres)
				return computer;
		}
		return null;
	}
	static Computer Find(String name){
		for (Iterator<Computer> iterator = ListOfComputers.iterator(); iterator.hasNext();) {
			Computer computer = (Computer) iterator.next();
			if(computer.getName() == name)
				return computer;
		}
		return null;
	}

	/*
	 * public void spam() { ArrayList<Node> visited = new ArrayList<>();
	 * visited.add(exit); exit.reSpam(visited, this, this); }
	 */

	@Override
	public void ConnectTo(Router target) {
		this.exit = target;
		target.getCabels().add(this);
		this.Spam(new ArrayList<Node>(), exit);
	}

	@Override
	public void send(Message msg, Node sender) {
		if (sender == msg.getFrom()) {
			System.out.println(this.getAddress()+": Sending message to "+this.exit.getAddress());
			this.exit.send(msg, this);
		}
		if (this == msg.getTo()) {
			System.out.println(this.getAddress()+": Received message from "+msg.getFrom().getAddress()+": "+msg.getText()+".");
		}
	}

	// public void sendMessage(String text, Computer target) {
	// Message msg = new Message(this, target, text);
	// System.out.println("You message sended from " +
	// this.getClass().getSimpleName() + " " + this.getName() + " to "
	// + exit.getClass().getSimpleName() + " " + exit.getName());
	// this.exit.reSend(msg,this);
	// }

	public void Spam(ArrayList<Node> visited, Router prev) {
		Router temp;
		Node from = this;
		Queue<Router> nextVisited = new PriorityQueue<>();
		nextVisited.add(exit);
		while (visited.size() < Router.count) {
			boolean check = false;
			temp = nextVisited.poll();
			for (int j = 0; j < visited.size(); j++) {
				if (visited.get(j) == temp) {
					check = true;
				}
			}
			if (!check) {
				for (int i = 0; i < temp.getCabels().size(); i++) {
					if (from == temp.getCabels().get(i)) {
						temp.getRouts().newConnection(this, i);
						visited.add(temp);
						for (int k = 0; k != i && !Computer.class.equals(temp.getCabels().get(i).getClass())
								&& k < temp.getCabels().size(); k++) {
							nextVisited.add((Router) temp.getCabels().get(k));
						}
					}
				}
			}
		}
	}

	public void Pconect(Router destination) {
		exit = destination;
		destination.getRouts().newConnection(this, destination.getCabels().size());
		destination.getCabels().add(this);

	}
}


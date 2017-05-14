package network;

import java.util.ArrayList;
import java.util.Iterator;

public class Router extends Node {
	
	private static ArrayList<Router> ListOfRouters = new ArrayList<>();
	private ArrayList<Node> cabels;
	private Table Routs;
	static int count = 0;

	Router(int addres, String name) {
		super(addres, name);
		ListOfRouters.add(this);

		cabels = new ArrayList<Node>();
		Routs = new Table();
		count++;
	}

	public ArrayList<Node> getCabels() {
		return cabels;
	}

	public Table getRouts() {
		return Routs;
	}
	static Router Find(int addres){
		for (Iterator<Router> iterator = ListOfRouters.iterator(); iterator.hasNext();) {
			Router router = iterator.next();
			if(router.getAddress() == addres)
				return router;
		}
		return null;
	}
	static Router Find(String name){
		for (Iterator<Router> iterator = ListOfRouters.iterator(); iterator.hasNext();) {
			Router router = iterator.next();
			if(router.getName().equals(name))
				return router;
		}
		return null;
	}

	/*
	 * public void reSpam(ArrayList<Node> visited, Node prev, Computer comp) {
	 * for (int i = 0; i < cabels.size(); i++) { boolean find = false; for (int
	 * j = 0; j < visited.size(); j++) { if (cabels.get(i) == visited.get(j))
	 * find = true; } if (!find) { this.Routs.newConnection(comp,
	 * cabels.indexOf(prev)); cabels.get(i).reSpam(visited, this, comp); } } }
	 */

	@Override
	public void ConnectTo(Router target) {
		if (cabels.contains(target)) {
			return;
		} else {
			Routs.newConnection(target, cabels.size());
			cabels.add(target);
		}
		/*
		 * target.Routs.newConnection(this, target.cabels.size());
		 * target.cabels.add(this);
		 */
	}

	public void send(Message msg, Node sender) {
		System.out.println(this.getAddress() + ": Got message from " + sender.getAddress() + ", forwarding to "
				+ cabels.get(Routs.GetPortFor(msg.getTo())).getAddress() + ".");
		cabels.get(Routs.GetPortFor(msg.getTo())).send(msg, this);
	}

	public void Pconnect(Router destination) {
		this.Routs.newConnection(destination, cabels.size());
		this.cabels.add(destination);
		destination.Routs.newConnection(this, destination.cabels.size());
		destination.cabels.add(this);
	}

	public void HRouting(Node port, Node... nodes) {
		for (Node node : nodes) {
			this.Routs.newConnection(node, cabels.indexOf(port));
		}

	}

}

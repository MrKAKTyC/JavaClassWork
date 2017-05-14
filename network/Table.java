package network;

import java.util.ArrayList;
import java.util.Iterator;

public class Table {
	private ArrayList<cell> table;

	public Table() {
		this.table = new ArrayList<>();
	}

	public void newConnection(Node target, int PP) {
		table.add(new cell(target, PP));
	}
	public int GetPortFor(Node target) {
		for (int i = 0; i<=table.size();i++)
		{
			if (table.get(i).avaibleNode == target)
				return table.get(i).PhysicalPort;
		}
		return -1;
	}
	public void toPrint() {
		for (Iterator<cell> iterator = table.iterator(); iterator.hasNext();) {
			cell cell = (cell) iterator.next();
			System.out.println(cell.avaibleNode.getClass().getSimpleName()+" "+ cell.avaibleNode +" avaibel on port "+cell.PhysicalPort);
		}
	}
}

class cell {
	Node avaibleNode;
	int PhysicalPort;
	
	
	public cell(Node target, int PP) {
		avaibleNode = target;
		PhysicalPort = PP;
	}
}
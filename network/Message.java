package network;

public class Message {
	private Node from;
	private Node to;
	private String text;
	
	public Message(Computer From, Computer target, String text) {
		this.from = From;
		this.to = target;
		this.text = text;
	}

	public Node getFrom() {
		return from;
	}

	public void setFrom(Node from) {
		this.from = from;
	}

	public Node getTo() {
		return to;
	}

	public String getText() {
		return text;
	}
	
}

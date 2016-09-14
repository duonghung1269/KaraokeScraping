package model;

public class Page {
	private int from;
	private int to;
	private String relativeUrl;

	public Page(int from, int to, String relativeUrl) {
		super();
		this.from = from;
		this.to = to;
		this.relativeUrl = relativeUrl;
	}

	public int getFrom() {
		return from;
	}

	public void setFrom(int from) {
		this.from = from;
	}

	public int getTo() {
		return to;
	}

	public void setTo(int to) {
		this.to = to;
	}

	public String getRelativeUrl() {
		return relativeUrl;
	}

	public void setRelativeUrl(String relativeUrl) {
		this.relativeUrl = relativeUrl;
	}

}

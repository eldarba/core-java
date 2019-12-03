package g.generics;

public class StringContainer {

	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "StringContainer [content=" + content + "]";
	}

}

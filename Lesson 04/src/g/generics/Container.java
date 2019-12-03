package g.generics;

public class Container<T> { // T is a type parameter

	private T content;

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Container [content=" + content + "]";
	}

	public static void main(String[] args) {
		Container<String> stringContainer = new Container<>();
		Container<Integer> intContainer = new Container<>();

		stringContainer.setContent("aaa");
		intContainer.setContent(5);

		String str = stringContainer.getContent();
		int x = intContainer.getContent();

	}

}

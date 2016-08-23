package basic.genericType;

public class DemoService<T extends DemoType> {
	private T type;

	public DemoService(T type) {
		this.type = type;
	}

	public T getT() {
		return type;
	}

	public String getTypeName() {
		return type.getName();
	}
}

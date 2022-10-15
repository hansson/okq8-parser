
public enum Type {
	FOOD("m"), TAKEOUT("u"), FUEL("b"), NONE("");

	private final String representation;

	Type(String string) {
		this.representation = string;
	}

	@Override
	public String toString() {
		return this.representation;
	}
}

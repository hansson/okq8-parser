import java.math.BigDecimal;

public class PaymentRow implements Comparable<PaymentRow> {

	private final String place;
	private final BigDecimal amount;
	private final Type type;

	public PaymentRow(String place, String amount) {
		this.place = place.replace("=\"", "").replaceAll("[\",]", "").trim();
		this.amount = new BigDecimal(amount.replace(",", "."));
		this.type = resolveType();
	}

	private Type resolveType() {
		if (Food.contains(this.place)) {
			return Type.FOOD;
		} else if (Takeout.contains(this.place)) {
			return Type.TAKEOUT;
		} else if (Fuel.contains(this.place)) {
			return Type.FUEL;
		}
		return Type.NONE;
	}

	@Override
	public String toString() {
		return String.format("%s\t%s\t%s", place, amount.toString().replace(".", ","), type);
	}

	@Override
	public int compareTo(PaymentRow o) {
		return this.type.compareTo(o.type);
	}

}

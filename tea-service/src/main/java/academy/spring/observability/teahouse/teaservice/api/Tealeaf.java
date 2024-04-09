package academy.spring.observability.teahouse.teaservice.api;

public class Tealeaf {
	private final String name;
	private final String type;
	private final String amount;

	public Tealeaf(String name, String type, String amount) {
		this.name = name;
		this.type = type;
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public String getAmount() {
		return amount;
	}
}

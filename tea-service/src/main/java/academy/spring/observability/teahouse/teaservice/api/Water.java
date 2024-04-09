package academy.spring.observability.teahouse.teaservice.api;

public class Water {

	private final String amount;

	private final String temperature;

	public Water(String amount, String temperature) {
		this.amount = amount;
		this.temperature = temperature;
	}

	public String getAmount() {
		return amount;
	}

	public String getTemperature() {
		return temperature;
	}
}

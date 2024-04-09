package academy.spring.observability.teahouse.teaservice.api;

import java.util.UUID;

public class WaterModel {

	private final UUID id;
	private final String size;
	private final String amount;

	public WaterModel(UUID id, String size, String amount) {
		this.id = id;
		this.size = size;
		this.amount = amount;
	}

	public UUID getId() {
		return id;
	}

	public String getSize() {
		return size;
	}

	public String getAmount() {
		return amount;
	}
}

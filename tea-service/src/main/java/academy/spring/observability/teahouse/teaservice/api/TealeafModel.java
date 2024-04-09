package academy.spring.observability.teahouse.teaservice.api;

import java.util.UUID;

public class TealeafModel {

	private final UUID id;
	private final String name;
	private final String type;
	private final String suggestedAmount;
	private final String suggestedWaterTemperature;
	private final String suggestedSteepingTime;


	public TealeafModel(UUID id, String name, String type, String suggestedAmount, String suggestedWaterTemperature, String suggestedSteepingTime) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.suggestedAmount = suggestedAmount;
		this.suggestedWaterTemperature = suggestedWaterTemperature;
		this.suggestedSteepingTime = suggestedSteepingTime;
	}

	public UUID getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public String getSuggestedAmount() {
		return suggestedAmount;
	}

	public String getSuggestedWaterTemperature() {
		return suggestedWaterTemperature;
	}

	public String getSuggestedSteepingTime() {
		return suggestedSteepingTime;
	}
}
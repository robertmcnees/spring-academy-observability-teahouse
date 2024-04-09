package academy.spring.observability.teahouse.teaservice.api;

public class TeaResponse {

	private final Water water;

	private final Tealeaf tealeaf;

	public TeaResponse(Water water, Tealeaf tealeaf) {
		this.water = water;
		this.tealeaf = tealeaf;
	}

	public Water getWater() {
		return water;
	}

	public Tealeaf getTealeaf() {
		return tealeaf;
	}
}

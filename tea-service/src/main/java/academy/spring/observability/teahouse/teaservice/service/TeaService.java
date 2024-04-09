package academy.spring.observability.teahouse.teaservice.service;

import academy.spring.observability.teahouse.teaservice.api.TeaResponse;
import academy.spring.observability.teahouse.teaservice.api.Tealeaf;
import academy.spring.observability.teahouse.teaservice.api.TealeafModel;
import academy.spring.observability.teahouse.teaservice.api.Water;
import academy.spring.observability.teahouse.teaservice.api.WaterModel;

import org.springframework.http.client.JdkClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class TeaService {

	private final RestClient waterRestClient;
	private final RestClient tealeafRestClient;

	public TeaService(RestClient.Builder restClientBuilder) {
		waterRestClient = restClientBuilder
				.baseUrl("http://localhost:8091/waters")
				.requestFactory(new JdkClientHttpRequestFactory())
				.build();
		tealeafRestClient = restClientBuilder
				.baseUrl("http://localhost:8092/tealeaves")
				.requestFactory(new JdkClientHttpRequestFactory())
				.build();
	}

	public TeaResponse make(String name, String size) {

		WaterModel waterModel = waterRestClient
				.get()
				//.uri("/search/findBySize?size="+size)
				.uri(uriBuilder -> uriBuilder.path("/search/findBySize").queryParam("size", size).build())
				.retrieve()
				.body(WaterModel.class);

		TealeafModel tealeafModel = tealeafRestClient
				.get()
				.uri(uriBuilder -> uriBuilder.path("//search/findByName").queryParam("name", name).build())
				.retrieve()
				.body(TealeafModel.class);

		Water water = new Water(waterModel.getAmount(), tealeafModel.getSuggestedWaterTemperature());
		Tealeaf tealeaf = new Tealeaf(tealeafModel.getName(), tealeafModel.getType(), tealeafModel.getSuggestedAmount());

		return new TeaResponse(water, tealeaf);
	}
}

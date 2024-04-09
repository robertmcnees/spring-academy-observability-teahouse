package academy.spring.observability.teahouse.tealeafservice.controller;

import academy.spring.observability.teahouse.tealeafservice.api.TealeafModel;
import academy.spring.observability.teahouse.tealeafservice.repo.Tealeaf;
import academy.spring.observability.teahouse.tealeafservice.repo.TealeafRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tealeaves")
public class TealeafController {

	private final TealeafRepository tealeafRepository;

	public TealeafController(TealeafRepository tealeafRepository) {
		this.tealeafRepository = tealeafRepository;
	}

	@GetMapping("/search/findByName")
	public TealeafModel findByName(@RequestParam("name") String name) {
		Tealeaf tealeaf = tealeafRepository.findByName(name).get();
		return new TealeafModel(tealeaf.getId(),
				tealeaf.getName(),
				tealeaf.getType(),
				tealeaf.getSuggestedAmount(),
				tealeaf.getSuggestedWaterTemperature(),
				tealeaf.getSuggestedSteepingTime());
	}
}

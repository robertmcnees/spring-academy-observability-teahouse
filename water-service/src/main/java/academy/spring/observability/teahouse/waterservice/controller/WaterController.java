package academy.spring.observability.teahouse.waterservice.controller;

import academy.spring.observability.teahouse.waterservice.api.WaterModel;
import academy.spring.observability.teahouse.waterservice.repo.Water;
import academy.spring.observability.teahouse.waterservice.repo.WaterRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/waters")
public class WaterController {

	private final WaterRepository waterRepository;

	public WaterController(WaterRepository waterRepository) {
		this.waterRepository = waterRepository;
	}

	@GetMapping("/search/findBySize")
	public WaterModel findBySize(@RequestParam("size") String size) {
		Water water = waterRepository.findBySize(size).get();
		return new WaterModel(water.getId(), water.getSize(), water.getAmount());
	}

}

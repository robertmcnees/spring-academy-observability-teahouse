package academy.spring.observability.teahouse.teaservice.controller;

import academy.spring.observability.teahouse.teaservice.api.TeaResponse;
import academy.spring.observability.teahouse.teaservice.service.TeaService;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeaController {

	private final TeaService teaService;

	public TeaController(TeaService teaService) {
		this.teaService = teaService;
	}

	@GetMapping("/tea/{name}")
	public TeaResponse make(@PathVariable String name, @RequestParam("size") String size) {
		return teaService.make(name,size);

	}

}

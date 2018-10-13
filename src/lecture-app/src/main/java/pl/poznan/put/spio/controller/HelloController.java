package pl.poznan.put.spio.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pl.poznan.put.spio.controller.model.HelloResponse;

@RestController
@RequestMapping("/")
public class HelloController {

	private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

	@RequestMapping(value = "/hello", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public HelloResponse hello() {
		LOGGER.error("helloooo");
		HelloResponse response = new HelloResponse();
		response.setMessage("No elo");
		return response;
	}

}

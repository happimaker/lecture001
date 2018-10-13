package pl.poznan.put.spio.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pl.poznan.put.spio.calculator.Calculator;
import pl.poznan.put.spio.calculator.CalculatorImpl;
import pl.poznan.put.spio.controller.model.CalculatorResponse;

@RestController
@RequestMapping("/math")
public class CalculatorController {

	private static final Logger LOGGER = LoggerFactory.getLogger(CalculatorController.class);

	private Calculator calculator = new CalculatorImpl();

	@RequestMapping(value = "/add/{arg1}+{arg2}", method = RequestMethod.POST)
	public CalculatorResponse add(@PathVariable Long arg1, @PathVariable Long arg2) {
		LOGGER.info("arg1: {}, arg2: {}", arg1, arg2);
		CalculatorResponse response = new CalculatorResponse();
		response.setResult(new Double(calculator.add(arg1, arg2)));
		LOGGER.info("out: {}", response);
		return response;
	}

	@RequestMapping("/div/{arg1}/{arg2}")
	public CalculatorResponse divide(@PathVariable Long arg1, @PathVariable Long arg2) {
		LOGGER.info("arg1: {}, arg2: {}", arg1, arg2);
		CalculatorResponse response = new CalculatorResponse();
		response.setResult(calculator.div(new Double(arg1), new Double(arg2)));
		LOGGER.info("out: {}", response);
		return response;
	}

}

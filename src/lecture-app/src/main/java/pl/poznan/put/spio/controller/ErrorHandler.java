package pl.poznan.put.spio.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ErrorHandler {

	private static final Logger LOGGER = LoggerFactory.getLogger(ErrorHandler.class);

	@ExceptionHandler
	@ResponseStatus(HttpStatus.I_AM_A_TEAPOT)
	public ModelAndView handleError(final Exception exception) {
		LOGGER.error("Holy crap!", exception);
		final ModelAndView mav = new ModelAndView();
		mav.setViewName("skucha");
		mav.addObject("exceptionType", exception.getClass().getName());
		mav.addObject("exception", exception.getMessage());
		return mav;
	}

}

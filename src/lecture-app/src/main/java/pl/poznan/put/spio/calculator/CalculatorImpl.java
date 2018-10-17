package pl.poznan.put.spio.calculator;

import java.util.Arrays;

public class CalculatorImpl implements Calculator {

	@Override
	public Long add(Long... args) {
		Long sum = 0L;
		for (Long arg : args) {
			sum += arg;
		}
		return sum;
	}

	@Override
	public Long subtract(Long... args) {
		Long result = args[0];
		for (Long arg : Arrays.copyOfRange(args, 1, args.length)) {
			result -= arg;
		}
		return result;
	}

}

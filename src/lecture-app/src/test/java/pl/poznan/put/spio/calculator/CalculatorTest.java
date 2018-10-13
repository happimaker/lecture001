package pl.poznan.put.spio.calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.googlecode.zohhak.api.TestWith;
import com.googlecode.zohhak.api.runners.ZohhakRunner;

@RunWith(ZohhakRunner.class)
public class CalculatorTest {

	private Calculator calculator;

	@Before
	public void setUp() {
		calculator = new CalculatorImpl();
	}

	@TestWith({"10, 10, 20", "-10, 0, -10", "0, 0, 0"})
	public void shouldAdd(Long arg1, Long arg2, Long expected) {
		// given

		// when
		Long result = calculator.add(arg1, arg2);

		// then
		Assert.assertEquals(expected.longValue(), (long)result);
	}

	@Test
	public void shouldMultiply() {
		// given

		// when
		Long result = calculator.multiply(10L, 10L);

		// then
		Assert.assertEquals(100L, (long)result);
	}

	@Test(expected=NullPointerException.class)
	public void shouldThrowExceptionWhenNullArgument() {
		// when
		calculator.add(null);
	}

}

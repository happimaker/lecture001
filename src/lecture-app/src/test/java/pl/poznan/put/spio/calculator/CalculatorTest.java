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

    @Test
    public void shouldAdd() {
        // given

        // when

        // then
    }

    @Test(expected = NullPointerException.class)
    public void shouldThrowExceptionWhenNullArgument() {
        // when
        calculator.add(null);
    }

}

package pl.poznan.put.spio.controller;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import pl.poznan.put.spio.calculator.Calculator;
import pl.poznan.put.spio.controller.model.CalculatorResponse;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorControllerTest {

	@InjectMocks
	private CalculatorController controller = new CalculatorController();

	@Mock
	private Calculator calculator;

	@Before
	public void setUp() {
	}

	@Test
	public void shouldAdd() {
		// given
		Mockito.when(calculator.add(10L, 20L)).thenReturn(30L);

		// when
		CalculatorResponse response = controller.add(10L, 20L);

		// then
		Assertions.assertThat(response.getResult()).isEqualTo(30);
	}

	@Test
	public void shouldDivide() {
		// given
		Mockito.when(calculator.div(20.0, 20.0)).thenReturn(1.0);

		// when
		CalculatorResponse response = controller.divide(20L, 20L);

		// then
		Assertions.assertThat(response.getResult()).isEqualTo(1.0);
	}

	// Mockito.when(calculator.add(Matchers.any(), Matchers.any())).thenThrow(new RuntimeException());
}

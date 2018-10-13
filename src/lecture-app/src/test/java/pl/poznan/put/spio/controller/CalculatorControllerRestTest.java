package pl.poznan.put.spio.controller;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;
import static io.restassured.module.mockmvc.RestAssuredMockMvc.standaloneSetup;

import org.apache.http.HttpStatus;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

import io.restassured.module.mockmvc.response.MockMvcResponse;
import io.restassured.path.json.JsonPath;

public class CalculatorControllerRestTest {

	private CalculatorController controller = new CalculatorController();

	@Before
	public void setUp() {
		standaloneSetup(controller);
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void shouldAddNumbers() {
		// given

		// when
		MockMvcResponse response = given()
				.when()
				.post("/math/add/{arg1}+{arg2}", 20, 30)
				.then()
				.assertThat()
				.statusCode(HttpStatus.SC_OK)
				.extract()
				.response()
				;

		// then
		Assertions.assertThat(JsonPath.from(response.asString()).get("result").toString()).isEqualTo("50.0");
	}

}

package pl.poznan.put.spio.controller;

import org.junit.Before;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.standaloneSetup;

public class CalculatorControllerRestTest {

    private CalculatorController controller = new CalculatorController();

    @Before
    public void setUp() {
        standaloneSetup(controller);
    }

}

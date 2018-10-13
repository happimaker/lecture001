package pl.poznan.put.spio.controller.model;

public class CalculatorResponse {

	private Double result;

	public Double getResult() {
		return result;
	}

	public void setResult(Double result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "CalculatorResponse [result=" + result + "]";
	}
}

package pl.poznan.put.spio.calculator;

public interface Calculator {

	Long add(Long... args);

	Double div(Double arg1, Double arg2);

	Long multiply(long arg1, long arg2);

	Long subtract(Long... args);

}
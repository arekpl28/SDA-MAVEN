package sda.mvc.controller;



import fibonacciPacked.Fibonacci;
import fibonacciPacked.FibonacciEnum;
import fibonacciPacked.FibonacciFabric;
import sda.mvc.facade.Facade;
import sda.mvc.model.Model;

import java.util.List;

public class Controller {
    public int getFibonacci(int n) {
        Fibonacci fibonacci = FibonacciFabric.produce(FibonacciEnum.INTERATION);
        int val = (int) fibonacci.getN(n);
        Facade.addValueFacade(val);
        return val;
    }



    public double average() {
        double sum = 0;
        List<Long> values = Facade.getValuesFacade();
        for (long val : values) {
            sum += val;
        }
        return sum / values.size();
    }
}

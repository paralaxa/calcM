package sk.stopangin.calc.impl;

import sk.stopangin.calc.CalcService;

public class CalcServiceImpl_1 implements CalcService{

    public double add(double x, double y) {
        return x+y;
    }

    public double substract(double x, double y) {
        return x-y;
    }

    public double divide(double x, double y) {
        return x/y;
    }

    public double multiplicate(double x, double y) {
        return x*y;
    }

    public double log10(double x) {
        return Math.log10(x);
    }


    public static void main(String[] args) {
        CalcService calcService = new CalcServiceImplWithExceptionHandling();
        calcService.divide(1,2);

    }
}

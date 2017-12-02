package sk.stopangin.calc.impl;

import sk.stopangin.calc.BusinessException;
import sk.stopangin.calc.CalcService;

import static sk.stopangin.calc.BusinessException.ERR.DIVISION_BY_ZERO;

public class CalcServiceImplWithExceptionHandling implements CalcService {

    public double add(double x, double y) {
        return x + y;
    }

    public double substract(double x, double y) {
        return x - y;
    }

    public double divide(double x, double y) {
        if (y == 0.0) {
            throw new BusinessException(DIVISION_BY_ZERO);
        }
        return x / y;
    }

    public double multiplicate(double x, double y) {
        return x * y;
    }

    public double log10(double x) {
        return Math.log10(x);
    }
}

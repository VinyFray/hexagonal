package zup.com.hexagonal.domain.usercases.impl;

import zup.com.hexagonal.domain.models.Taxes;
import zup.com.hexagonal.domain.usercases.TaxCalculator;

public class TaxCalculatorImpl implements TaxCalculator {

    @Override
    public double performe(double valueForSimulation) {
        double result = valueForSimulation * Taxes.IOF.getCota();
        return result;
    }
}

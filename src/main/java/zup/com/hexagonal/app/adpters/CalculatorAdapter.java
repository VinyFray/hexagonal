package zup.com.hexagonal.app.adpters;

import org.springframework.stereotype.Service;
import zup.com.hexagonal.domain.usercases.TaxCalculator;

@Service
public class CalculatorAdapter {
    private TaxCalculator taxCalculator;

    public CalculatorAdapter(TaxCalculator taxCalculator) {
        this.taxCalculator = taxCalculator;
    }

    public double calculateTax(double valueToCalculate){
        return taxCalculator.performe(valueToCalculate);
    }
}

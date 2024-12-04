package zup.com.hexagonal.app.infra;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import zup.com.hexagonal.domain.usercases.TaxCalculator;
import zup.com.hexagonal.domain.usercases.impl.TaxCalculatorImpl;

@Component
public class InjectionAdapter {

    @Bean
    public TaxCalculator taxCalculator(){
        return new TaxCalculatorImpl();
    }
}

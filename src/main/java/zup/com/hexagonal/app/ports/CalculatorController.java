package zup.com.hexagonal.app.ports;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zup.com.hexagonal.app.adpters.CalculatorAdapter;
import zup.com.hexagonal.domain.dtos.TaxesRequestDto;

import java.util.Map;

@RestController
@RequestMapping("/imposto")
public class CalculatorController {

    @Autowired
    private CalculatorAdapter calculatorAdapter;

    public ResponseEntity<?> calculate(@RequestBody TaxesRequestDto requestDTO){
        double result = calculatorAdapter.calculateTax(requestDTO.getValue());
        return ResponseEntity.ok(Map.of("message", result));
    }
}

package zup.com.hexagonal.domain.dtos;

public class TaxesRequestDto {
    private double value;

    public TaxesRequestDto() {
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}

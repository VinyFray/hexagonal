package zup.com.hexagonal.domain.models;

public enum Taxes {
    IOF(0.38, "IOF", "Iposto sobre transição monetaria");

    private double cota;
    private String name;
    private String descricao;

    public double getCota() {
        return cota;
    }

    public String getName() {
        return name;
    }

    public String getDescricao() {
        return descricao;
    }

    Taxes(double cota, String name, String descricao) {
        this.cota = cota;
        this.name = name;
        this.descricao = descricao;
    }
}

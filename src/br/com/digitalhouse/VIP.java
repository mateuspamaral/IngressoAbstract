package br.com.digitalhouse;

public class VIP extends Ingresso {

    //Attributes
    private Float valorAdicional;

    //Constructor
    public VIP(Float valor, Float valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    //Getters & Setters
    public Float getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(Float valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    //Methods
    @Override
    public void imprimeValor() {
        System.out.println(super.getValor() + this.valorAdicional);
    }

    public Float getValorVIP(){
        return super.getValor()+this.valorAdicional;
    }

}

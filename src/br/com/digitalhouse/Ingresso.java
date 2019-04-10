package br.com.digitalhouse;

public abstract class Ingresso {

    //Attributes
    private Float valor;

    //Constructor
    public Ingresso(Float valor) {
        this.valor = valor;
    }

    //Getters & Setters
    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    //Methods
    public abstract void imprimeValor();
}

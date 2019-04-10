package br.com.digitalhouse;

public class Normal extends Ingresso {

    //Constructor
    public Normal(Float valor) {
        super(valor);
    }

    //Methods
    @Override
    public void imprimeValor() {
        System.out.println("Ingresso Normal");
    }
}

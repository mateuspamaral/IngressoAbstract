package br.com.digitalhouse;

public class CamaroteSuperior extends VIP {

    //Attributes
    private Float valorAdicional2;

    //Constructor
    public CamaroteSuperior(Float valor, Float valorAdicional, Float valorAdicional2) {
        super(valor, valorAdicional);
        this.valorAdicional2 = valorAdicional2;
    }

    //Methods
    public Float getValorCamaroteSuperior(){
        return super.getValorVIP()+this.valorAdicional2;
    }

    @Override
    public void imprimeValor() {
        System.out.println(this.getValorCamaroteSuperior());
    }

}

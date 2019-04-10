package br.com.digitalhouse;

public class CamaroteInferior extends VIP {

    //Attributes
    private String localizacao;

    //Constructor
    public CamaroteInferior(Float valor, Float valorAdicional, String localizacao) {
        super(valor, valorAdicional);
        this.localizacao = localizacao;
    }

    //Getters & Setters
    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    //Methods
    public void imprimirLocalizacao() {
        System.out.println(this.getLocalizacao());
    }

}

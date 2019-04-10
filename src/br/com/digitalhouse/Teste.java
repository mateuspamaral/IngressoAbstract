package br.com.digitalhouse;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        String option = "0";

        //Instanciando
        Normal ingressoNormal = new Normal(22.00f);
        VIP ingressoVIP = new VIP(22.00f, 10.00f);
        CamaroteInferior ingressoCI = new CamaroteInferior(22.00f, 10.00f, "D13");
        CamaroteSuperior ingressoCS = new CamaroteSuperior(22.00f, 10.00f, 10.00f);

        //User Interface
        System.out.println("Escolha uma opção abaixo: " +
                "\n 1 - Ingresso Nomrla" +
                "\n 2 - Ingresso VIP");

        Scanner scanner = new Scanner(System.in);

        option = scanner.nextLine();

        if (option.equals("1")) {
            System.out.println("Valor do ingresso: " + ingressoNormal.getValor());
        } else if (option.equals("2")){
            System.out.println("Escolha uma opção abaixo: " +
                    "\n 1 - Camarote Superior" +
                    "\n 2 - Camarote Inferior");
            option = scanner.nextLine();
            if (option.equals("1")){
                System.out.println("Valor do ingresso: " + ingressoCS.getValorCamaroteSuperior());
            } else if (option.equals("2")){
                System.out.println("Valor do ingresso: " + ingressoCI.getValorVIP() +
                                    "\nSua poltrona: " + ingressoCI.getLocalizacao());
            } else {
                System.out.println("Esta opção não existe");
            }
        } else {
            System.out.println("Esta opção não existe");
        }


    }
}

package br.com.fatec.engsoft.modelo;

import java.util.Scanner;

    public class Main {
        public static void main (String[] args){

            Scanner entrada = new Scanner(System.in);
            int opcao;

            do {
                System.out.println("(1) Formato de Calculo: Circunferencia.\n"
                        + "(2) Formato de Calculo: Retangulo.\n"
                        + "(3) Sair.\n"
                        +"Selecione uma opcao:");
                opcao = entrada.nextInt();

                switch(opcao) {
                    //caso circunferencia
                    case 1:
                        Circunferencia c = new Circunferencia();
                        System.out.println("\nCircunferencia");
                        System.out.println("Raio da Circunferencia: " + c.getRaio());
                        System.out.println("Area da Circunferencia: " + c.getArea());
                        System.out.println("Perimetro da Circunferencia: " + c.getPerimetro());
                        break;

                    //caso retangulo
                    case 2:
                        Retangulo r = new Retangulo();
                        System.out.println("\nRetangulo");
                        System.out.println("Lados do Retangulo: " + r.getLadoA() + " e " + r.getLadoB());
                        System.out.println("Area do Retangulo: " + r.getArea());
                        System.out.println("Perimetro do Retangulo: " + r.getPerimetro());
                        break;

                    case 3:
                        System.out.println("Opcao sair.");
                        break;
                }
            }while(opcao < 0 || opcao >3);
        }
    }



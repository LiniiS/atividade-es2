package br.com.fatec.engsoft.modelo;


import java.util.Scanner;

public class Retangulo {
    private float ladoA, ladoB, area, perimetro;

    public Retangulo(){
        Scanner entrada = new Scanner (System.in);

        System.out.print("Digite o comprimento do retangulo: ");
        this.ladoA=entrada.nextFloat();

        System.out.print("Digite a altura do retangulo: ");
        this.ladoB=entrada.nextFloat();

        CalcularArea();
        CalcularPerimetro();
    }

    public float getLadoA(){
        return ladoA;
    }

    public float getLadoB(){
        return ladoB;
    }

    public float getArea() {
        return area;
    }

    public float getPerimetro() {
        return perimetro;
    }

    public void setLados(float a, float b){
        this.ladoA=a;
        this.ladoB=b;
        CalcularArea();
        CalcularPerimetro();
    }

    private void CalcularArea(){
        area = ladoA * ladoB;
    }

    private void CalcularPerimetro(){
        perimetro = 2 * (ladoA + ladoB);
    }
}

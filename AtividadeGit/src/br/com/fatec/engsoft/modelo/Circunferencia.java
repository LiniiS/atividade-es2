package br.com.fatec.engsoft.modelo;

import java.util.Scanner;

public class Circunferencia {
    private float raio, area, perimetro;

    public Circunferencia(){
        Scanner entrada = new Scanner (System.in);
        System.out.print("Digite o raio da circunferencia: ");
        this.raio = entrada.nextFloat();
        CalcularArea();
        CalcularPerimetro();
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
        CalcularArea();
        CalcularPerimetro();
    }

    private void CalcularArea(){
        area = (float)(Math.PI * Math.pow(raio, 2));
    }

    private void CalcularPerimetro(){
        this.perimetro = (float)(2 * Math.PI * raio);
    }

    public float getArea() {
        return area;
    }

    public float getPerimetro() {
        return perimetro;
    }
}

package com.company;

import java.util.Scanner;

public class QuestãoD {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double raio,perimetro,area;
        System.out.println("Informe o raio do circulo:");
        raio=sc.nextDouble();
        area= Math.PI*Math.pow(raio,2);
        System.out.println("A area do circulo é:" + (int)area);
        perimetro=(Math.PI)*raio;
        System.out.println("O perimetro do circulo é "+ (int)perimetro);

    }
}

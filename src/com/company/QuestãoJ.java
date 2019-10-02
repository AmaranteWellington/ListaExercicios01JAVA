package com.company;

import java.util.Scanner;

public class QuestãoJ {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in) ;
        double real,dolar,conve;
        System.out.println("digite o valor em real:");
        real=sc.nextDouble();
        System.out.println("Digite o valor em dolar:");
        dolar=sc.nextDouble();
        conve= real/dolar;
        System.out.println(" O valor convertido de Real pra dolar : " + conve + "Dolares");
    }

}

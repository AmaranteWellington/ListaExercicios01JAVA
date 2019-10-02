package com.company;

import java.util.Scanner;

public class QuestãoF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        double produto,preço,totalPago;
        System.out.println("Quantos produtos você deseja:");
        produto=sc.nextDouble();
        System.out.println("informe o preço do produto:");
        preço=sc.nextDouble();
        totalPago=produto*preço;
        System.out.println("total a ser pago:" +(int)totalPago + "REAIS");
    }
}

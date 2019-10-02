package com.company;

import java.util.Scanner;

public class QuestãoG {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        double largura, comprimento, area;
        System.out.println("infome a largura em metros da sala:");
        largura=sc.nextDouble();
        System.out.println("inofme o comprimento em metros da sala");
        comprimento=sc.nextDouble();
        area=comprimento*largura;
        System.out.println("a area da sala é " + area + " metros quadrados");
    }
}

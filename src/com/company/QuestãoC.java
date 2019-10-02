package com.company;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class QuestãoC {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        double altura,area,base;
        System.out.println("Digite a altura do triangulo:");
        altura=sc.nextDouble();
        System.out.println("digite a base do triangulo");
        base=sc.nextDouble();
        area=(base*altura)/2;
        System.out.println("a area do triangulo é:" + area);


    }
}


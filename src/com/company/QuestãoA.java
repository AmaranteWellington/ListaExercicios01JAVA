package com.company;

import java.util.Scanner;

public class QuestãoA {

    public static void main(String[] args) {
	String nome,idade;

        Scanner sc= new Scanner(System.in);
        System.out.println("Digite seu nome:");
        nome=sc.next();
        System.out.println("Digite sua idade:");
        idade=sc.next();
        System.out.println("Seu nome é: "+nome+ "||e sua idade é:" +idade+ "anos");
    }
}

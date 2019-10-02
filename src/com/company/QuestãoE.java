package com.company;

import java.util.Scanner;

public class QuestãoE {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double venda,vendaT;
        System.out.println("Informe o total de vendas do vendedor:");
        venda=sc.nextDouble();
        vendaT= venda*0.1;
        System.out.println("Sua comissão  com base em suas vendas é de:" + (int)vendaT +"%");

    }
}

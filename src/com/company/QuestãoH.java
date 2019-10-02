package com.company;

import java.util.Scanner;

public class QuestãoH {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System. in);
        double salario, reajuste, percentual;
        boolean erro= false;
        System.out.println("informe o valor do salário:");
        salario=sc.nextDouble();
        System.out.println("infome o percentual de reajuste:");
        percentual=sc.nextDouble();
        while (percentual <0||percentual>1) {
            erro = false;
            System.out.println("Operação inválida!!!");
            System.out.println("informe um valor entre 0 e 1:");
            percentual = sc.nextDouble();
        }
        reajuste= (salario*percentual)+salario;
        System.out.println("o valor do seu salario com reajuste é:  "+ reajuste + "REAIS");


        }

    }


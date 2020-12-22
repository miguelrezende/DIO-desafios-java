package Introducao;

import java.util.Scanner;

public class FolhaPagamento {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();
        int horas = entrada.nextInt();
        double salarioHoras = entrada.nextDouble();
        double salarioTotal = horas*salarioHoras;
        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f", salarioTotal);
    }
}

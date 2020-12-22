package Introducao;

import java.util.Scanner;

public class Multiplicacao {
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int total = a*b; // Altere o valor da variável com o cálculo esperado
        System.out.println("PROD = " + total);
    }
}

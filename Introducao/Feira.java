package Introducao;

import java.util.Scanner;

public class Feira {
    public static void main(String[] args)
    {
        Scanner entrada= new Scanner(System.in);
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int total = a+b;
        System.out.println("X = " + total);
    }
}

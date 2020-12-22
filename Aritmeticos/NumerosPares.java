package Aritmeticos;
import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int valor = entrada.nextInt();
        for(int i = 2; i <= valor; i= i+2)
        {
            System.out.println(i);
        }

    }
}

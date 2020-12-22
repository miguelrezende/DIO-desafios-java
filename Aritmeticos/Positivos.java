package Aritmeticos;
import java.util.Scanner;

public class Positivos {
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int positivos = 0;
        int numeros[] = new int[6];
        for(int i= 0; i < 6; i++)
        {
            numeros[i] = entrada.nextInt();
            if(numeros[i] > 0)
            {
                positivos+= 1;
            }
        }

        System.out.print(positivos + " valores positivos");

    }
}

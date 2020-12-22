package Aritmeticos;
import java.util.Scanner;

public class AnaliseNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int positivos = 0;
        int impar = 0;
        int par = 0;
        int negativos = 0;
        int numeros[] = new int[6];
        for (int i = 0; i < 5; i++) {
            numeros[i] = entrada.nextInt();
            if (numeros[i] > 0) {
                positivos += 1;
            }
            if (numeros[i] < 0) {
                negativos += 1;
            }
            if (numeros[i] % 2 == 0) {
                par += 1;
            } else {
                impar += 1;
            }
        }

        System.out.println(par + " valor(es) par(es)");
        System.out.println(impar + " valor(es) impar(es)");
        System.out.println(positivos + " valor(es) positivo(s)");
        System.out.println(negativos + " valor(es) negativos(s)");
    }
}


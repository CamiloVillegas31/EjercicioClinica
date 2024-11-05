package invertirnumero;

import java.util.Scanner;

public class InvertirNumero {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero de mas de dos cifras: ");
        int num = teclado.nextInt();
        inv(num);

        //System.out.println("\nprueba" + (124 % 10));
    }

    static void inv(int num) {
        if (num < 10) {
            System.out.print(num);
        } else {
            System.out.print(num % 10);
           inv(num / 10);
        }
    }
}

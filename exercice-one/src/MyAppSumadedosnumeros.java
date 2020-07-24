import java.util.Scanner;

public class MyAppSumadedosnumeros {
    public static void main(String[] args) {
        System.out.println("Programa que suma 2 numeros");
        int firstNumuber;
        int secondNumuber;
        int result;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese el primer numero para el calculo: ");
        firstNumuber = keyboard.nextInt();
        System.out.print("Ingrese el segundo numero para el calculo: ");
        secondNumuber = keyboard.nextInt();

        result = firstNumuber + secondNumuber;

        System.out.println("El resultado es: " + result);

    }
}


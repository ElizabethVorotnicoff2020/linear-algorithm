package ar.com.ada.online.second.projectname;

import java.time.Year;
import java.util.Scanner;

/*El hotel “Cama Arena” requiere determinar lo que le debe cobrar a un huésped por su
estancia en una de sus habitaciones. Realice un diagrama de flujo y pseudocódigo que
representen el algoritmo para determinar ese cobro.*/
public class Main {

    public static void main(String[] args) {

        System.out.println("Calculo de la estadia");

        int numberOfNights;
        double roomPrice;
        double totalPayment;


        Scanner keyboard = new Scanner(System.in);

        System.out.println("enter the number Of Nights: ");
        numberOfNights = keyboard.nextInt();

        System.out.println("enter the room Price: ");
        roomPrice = keyboard.nextDouble();

        totalPayment = numberOfNights * roomPrice;

        System.out.println("el valor total es: $ " + totalPayment);

    }
}

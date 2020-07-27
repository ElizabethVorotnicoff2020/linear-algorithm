package ar.com.ada.online.second.projectname;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int valuePerSquareMeter = 160;
        double amountOfSquareMeters;
        double cost;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("ingrese Amount Of Square Meters : ");
        amountOfSquareMeters = keyboard.nextDouble();

        cost = valuePerSquareMeter * amountOfSquareMeters;

        System.out.println("El presupuesto es: " + cost);
    }
}

package ar.com.ada.online.second.projectname;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double dollarAmount;
	double amountOfMexicanPesos;
	double dollarPrice = 22.28;

	Scanner keyboard = new Scanner(System.in);

	System.out.println("ingrese la cantidad de pesos mexicanos: ");
	amountOfMexicanPesos = keyboard.nextDouble();

	dollarAmount = amountOfMexicanPesos / dollarPrice;

		System.out.println(dollarAmount);
    }
}

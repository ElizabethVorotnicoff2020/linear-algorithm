package ar.com.ada.online.second.projectname;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double valuePerLitre = 3.785;
	int  numberOfLitres;
	double result;

	Scanner keyboard = new Scanner(System.in);

	System.out.println("ingrese number of litres : ");
	numberOfLitres = keyboard.nextInt();

	result = valuePerLitre * numberOfLitres;

        System.out.println("El productor gano: " + result);
    }
}

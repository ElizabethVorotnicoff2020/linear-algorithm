package ar.com.ada.online.second.projectname;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double redneckA;
	double redneckB;
	double hypotenuse;

	System.out.println("Calcular el valor de la Hipotenusa");

	Scanner keyboard = new Scanner(System.in);

	System.out.println("enter the measurement of the redneckA: ");
	redneckA = keyboard.nextDouble();

	System.out.println("enter the measurement of the redneckB: ");
	redneckB = keyboard.nextDouble();

	hypotenuse = Math.sqrt((redneckA * redneckA) + (redneckB * redneckB));

	System.out.println("The result of the hypotenuse is: "+hypotenuse);

    }
}

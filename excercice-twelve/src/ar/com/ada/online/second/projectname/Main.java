package ar.com.ada.online.second.projectname;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double articlePrice, discountedPrice, finalPrice;
	double discount;
	double iva;

	System.out.println("Precio de un articulo");

	Scanner keyboard = new Scanner(System.in);

	System.out.println("enter the price of the article: ");
	articlePrice = keyboard.nextDouble();

	discount = articlePrice * 0.20;
	discountedPrice = articlePrice - discount;


	System.out.println(discountedPrice);

	iva = discountedPrice * 0.15;
    finalPrice = discountedPrice + iva;

    System.out.println("the final price is: " + finalPrice);

    }
}

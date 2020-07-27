package ar.com.ada.online.second.projectname;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int timeValue = 100;
	int numberOfHours;
	int cost;

	Scanner keyboard = new Scanner(System.in);

	System.out.print("enter the numberOfHours: ");
	numberOfHours = keyboard.nextInt();
	cost = timeValue * numberOfHours;



        System.out.println("El costo es: " + cost);
    }
}
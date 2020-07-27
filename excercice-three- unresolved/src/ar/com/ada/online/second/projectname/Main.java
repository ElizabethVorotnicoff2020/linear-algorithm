package ar.com.ada.online.second.projectname;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int yearOfBirth;
	int presentYear = 2020;
	int age;

	Scanner keyboard = new Scanner(System.in);

	System.out.println("enter your yearOfBirth: ");
	yearOfBirth = keyboard.nextInt();

	age = presentYear - yearOfBirth;

        System.out.println("the age of job applicants is: "+ age);


    }
}

package ar.com.ada.online.second.projectname;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double radioDeUnTerreno;
        final double pi =3.14;
        double area;

        Scanner keyboard = new Scanner(System.in);


        System.out.println("ingrese el radio de un terreno: ");
        radioDeUnTerreno = keyboard.nextDouble();

        area = (radioDeUnTerreno * 2) * pi;

        System.out.println(area);

    }
}

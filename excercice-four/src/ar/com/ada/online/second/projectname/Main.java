package ar.com.ada.online.second.projectname;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double radioDeLaCircunsferencia;
        final double pi =3.14;
        double area;

        Scanner keyboard = new Scanner(System.in);


        System.out.println("ingrese el radio de la circunsferencia: ");
        radioDeLaCircunsferencia = keyboard.nextDouble();

        area = (radioDeLaCircunsferencia * 2) * pi;

        System.out.println(area);

    }
}

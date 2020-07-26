package ar.com.ada.online.second.projectname;

import javax.crypto.spec.PSource;
import java.awt.geom.Area;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    private static Object area;

    public static void main(String[] args){
        int height;
        int base;
        int area;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("ingrese_la_altura: ");
        height = keyboard.nextInt();

        System.out.println("ingrese_la_base: ");
        base = keyboard.nextInt();

        area = height * base;

        System.out.println("El area del rectangulo es: "+area);
  }
}





package com.cice.ejercicios;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Introduce un número para que pueda decirte si es par o impar...");

        Scanner teclado=new Scanner(System.in);
        int num;
        num=teclado.nextInt();

        if(num%2==0){
            System.out.println("El número "+num+" es par.");
        }
        else{
            System.out.println("El número "+num+" es impar.");
        }
    }
}

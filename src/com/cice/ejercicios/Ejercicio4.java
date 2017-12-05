package com.cice.ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        long x, result=1;
        Scanner teclado=new Scanner(System.in);

        System.out.print("Escribe un valor: ");
        x=teclado.nextInt();

        for(int i=1;i<=x;i++){
            result*=i;
            System.out.print(i);
        }

        System.out.println("El resultado de factorial es "+ result);
    }
}

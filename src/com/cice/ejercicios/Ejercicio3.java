package com.cice.ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner teclado=new Scanner(System.in);
        int hora;
        String salir;

        do{
            System.out.print("¿Qué hora es?: ");
            hora=teclado.nextInt();
            if(hora<=24){
                if(hora>=6 && hora<12){
                    System.out.println("Buenos días");
                }
                else if(hora>=12 && hora<=20){
                    System.out.println("Buenas tardes");
                }
                else{
                    System.out.println("Buenas noches");
                }
            }
            else{
                System.out.println("Este número no existe en el horario.");
            }

            System.out.print("¿Quieres repetir?S/N: ");
            salir=teclado.next();
        }while(salir.equals("S") || salir.equals("s"));


    }
}

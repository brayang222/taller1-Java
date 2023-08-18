package com.brayanvargas.app;
import java.util.Scanner;
import com.brayanvargas.domain.Dispensador;

public class App {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Dispensador dispensador = new Dispensador();

        dispensador.marca = "sony";
        dispensador.temp = 23;
        dispensador.cantMax = 1000;
        dispensador.cantAct = 900;

        int opcion = 0;


        System.out.printf("la marca es " + dispensador.marca + " la temperatura " + dispensador.caliente()
        + " la cantidad máxima es " + dispensador.cantMax + " y la cantidad actual es " + dispensador.cantAct);

        System.out.println("¿Qué características quieres ver del dispensador?");
        System.out.println("opción 1: marca");
        System.out.println("opción 2: cantidad máxima");
        System.out.println("opción 3: cantidad actual");
        System.out.println("opción 4: temperatura");
        System.out.println("¿Qué acción quieres ver del dispensador?");
        System.out.println("opción 5: Servir 1 litro");
        System.out.println("opción 6: llenar");
        System.out.println("opción 7: vaciar");
        System.out.println("opción 8: calentar");
        System.out.println("opción 9: enfriar");
        System.out.println("opción 10: mostrar nivel");
        opcion = scanner.nextInt();
        switch (opcion){
            case 1:
                System.out.println("la marca es: " + dispensador.marca);
                break;
            case 2:
                System.out.println("la cantidad máxima es: " + dispensador.cantMax);
                break;
            case 3:
                System.out.println("la cantidad cantidad actual es: " + dispensador.cantAct);
                break;
            case 4:
                System.out.println("la temperatura es: " + dispensador.temp);
                break;
            case 5:
                dispensador.servir(1);
                break;
            case 6:
                dispensador.llenar(1000);
                break;
            case 7:
                dispensador.vaciar();
                break;
            case 8:
                dispensador.caliente();
                break;
            case 9:
                dispensador.frio();
                break;
            case 10:
                dispensador.mostrarNivel();
                break;
        }
    }
}

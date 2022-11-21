package com.sofka;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {

        int opcion;

        do {
            System.out.println("\n1- Registrar usuario" +
                    "\n2- Ver usuarios registrados" +
                    "\n3- Resultados de las pruebas" +
                    "\n4- Salir");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    regCliente();
                    break;
                case 2:
                    verClientes();
                    break;
                case 3:
                    verResultados();
                    break;
                default:
                    break;
            }
        } while (opcion != 4);
    }

    static ArrayList<String> cliente = new ArrayList<>();
    static ArrayList<String> resultado = new ArrayList<>();
    static Scanner entrada = new Scanner(System.in);

    static void regCliente() {
        if (cliente.size() < 8) {

            System.out.println("\nIngrese nombre de usuario: ");
            cliente.add(entrada.next());

            System.out.println("Aprobado?\n 1- Si\n 2- No");

            int respuesta = entrada.nextInt();

            if (respuesta == 1) {
                resultado.add("Aprobado");
            } else {
                resultado.add("No Aprobado");
            }
        } else {
            System.out.println("Maximo de usuarios 8!");
        }
    }

    static void verClientes() {
        for (int i = 0; i < cliente.size(); i++) {
            System.out.println((i + 1) + " - " + cliente.get(i));
        }
    }

    static void verResultados() {
        for (int i = 0; i < resultado.size(); i++) {
            System.out.println((i + 1) + " - " + cliente.get(i) + " - " + resultado.get(i));
        }
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

 /*
* un menú para una calculadora de 2 numeros que permita a través del uso de
funcines: SUMa, RESTA, MUTIPLICACCION, DIVISION, MODULO. finalmente obtener el resultado
 */
package com.amaisov.calculadora;

import java.util.Scanner;

/**
 *
 * @author amairani
 */
public class Calculadora {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 0, num2 = 0, operacion;

        operacion = 0;
        do {
            System.out.println(" CALCULADORA ");

            System.out.println(" 1 suma ");
            System.out.println(" 2 resta ");
            System.out.println(" 3 producto ");
            System.out.println(" 4 divicion ");
            System.out.println(" 5 modulo ");
            System.out.println(" 6 salir ");

            System.out.print(" ¿Que opercción deseas realizar? ");
            operacion = Integer.parseInt(input.nextLine());

            if (operacion < 6) {
                System.out.print(" ingresa el primer numero : ");//Imprime en consola
                num1 = Integer.parseInt(input.nextLine());//Lee lo que el usuario escribio

                System.out.print(" ingresa el segundo numero : ");//print es un metodo
                num2 = Integer.parseInt(input.nextLine());//nextLine y parseInt son metodos! 
            }

            switch (operacion) {
                case 1:
                    suma(num1, num2);
                    System.out.println(" Has seleccionado operacion 1 ");
                    break;
                case 2:
                    resta(num1, num2);
                    System.out.println(" Has seleccionado operacion 2 ");
                    break;
                case 3:
                    producto(num1, num2);
                    System.out.println(" Has seleccionado operacion 3 ");
                    break;
                case 4:
                    division(num1, num2);
                    System.out.println(" Has seleccionado operacion 4");
                    break;
                case 5:
                    modulo(num1, num2);
                    System.out.println(" Has seleccionado operaccion 5 ");
                    break;
                case 6:
                    System.out.println(" Has seleccionado Salir ");
                    return;
                default:
                    System.out.println(" tu opercion a sido erronia vuelve a seleccionar ");
            }

        } while (operacion != 6);
        System.out.println("fin de  la opercion");

    } 

    static void suma(int a, int b) {
        int suma = a + b;
        System.out.println(" la suma de a+b es: " + suma);
    }

    static void resta(int x, int y) {
        int resta = x - y;
        System.out.println("el resultado de x-y es: " + resta);
    }

    static void producto(int p, int q) {
        int producto = p * q;
        System.out.println("la multiplicacion de p*q es:" + producto);
    }

    static void division(int m, int n) {
        int division = m / n;
        System.out.println(" el conciente entre m y n es:" + division);
    }

    static void modulo(int r, int s) {
        int modulo = r % s;
        System.out.println("el modulo de r dividido por s es:" + modulo);
    }

}

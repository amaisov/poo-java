/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.amaisov.metodos;

/**
 *
 * @author amairani
 */
public class Metodos {

    public static void main(String[] args) {
        String correo1 = "tics666kofioril@gmail.com";
        String correo2 = "demonslayer@hotmail.com";

        System.out.println("es un correo de gmail?" + ValidacionCorreo.esGmail(correo1));
        System.out.println("es un correo de gmail?" + ValidacionCorreo.esGmail(correo2));
        //prueba Area

        double radio = 20;
        System.out.println("El area del circul es " + CalculoArea.calcularAreaCirculo(radio));
        System.out.println("Vocales en Hola Mundo " + ContadorVocales.contarValores("Hola Mundo"));

        System.out.println(" 7 es un numero primo " + NumeroPrimo.esPrimo(7));
        System.out.println("10 es un numero primo "+NumeroPrimo.esPrimo(10));
        
        System.out.println("125 munutos son: " +ConversorTiempo.ConvertirMinutos(125));
    }

    public class ValidacionCorreo {

        public static boolean esGmail(String correo) {
            return correo.toLowerCase().endsWith("@gmail.com");

        }
    }

    public class CalculoArea {

        public static double calcularAreaCirculo(double radio) {

            return Math.PI * Math.pow(radio, 2);
        }

    }

    public class ContadorVocales {

        public static int contarValores(String palabra) {
            int contador = 0;
            palabra = palabra.toLowerCase();
            for (char c : palabra.toCharArray()) {
                if ("aeiou".indexOf(c) != -1) {
                    contador++;
                }
            }
            return contador;
        }

    }

    public class NumeroPrimo {

        public static boolean esPrimo(int numero) {
            if (numero < 2) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public class ConversorTiempo {

        public static String ConvertirMinutos(int minutos) {
            int horas = minutos / 60;
            int minutosRestantes = minutos % 60;
            return horas + "horas," + minutosRestantes + " minutos ";
        }
    }
}

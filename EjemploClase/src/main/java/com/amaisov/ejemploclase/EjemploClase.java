/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.amaisov.ejemploclase;

/**
 *
 * @author amairani
 */
public class EjemploClase {
 
        //atributos variables de intancia
       
        private String nombre;
        private int edad;
        
        //costructor
        public EjemploClase(String nombre,int edad){
            this.nombre=nombre;
            this.edad=edad;
            
        }
        public void mostrarInformacion(){
            System.out.println("nombre:"+nombre +"edad:"+edad);
        }
        //modificador private:acecible dentro de la clase
        private void metodoPrivado(){
            System.out.println(" este metodo es privado ");
        }
        // protected: accesible dentro del mismo paqute y por clases herederas
        private void metodoProtegido(){
            System.out.println(" este es un metodo protegido ");
        }
        //default (sin especificar): solo accesible dentro del mismo paquete
        void metodoPorDefecto(){
            System.out.println(" este es un metodo por defecto ");
        }
        
       /*
        ambito referente a una clase
        variables locales dentro de un metodo (solo esxisten dentro del metodo
        */
        public void calcularDoble(){
            int resultado=edad*2; //variable local
               System.out.println(" el resultado es "+resultado);
        }
       
        
        /*
        metodos estaticos(pertenecen a la clase y no  alos objetos)
        */
        public static void metodoEstatico(){
            System.out.println(" este es un metodo estatico ");
        }
        
        
        //clase principal
        public static void main(String[] args){
            //crear un objeto de ejemploclase
            
            EjemploClase persona = new EjemploClase(" kevin " ,18);
            
            //usar los metodos publicos
             persona.mostrarInformacion();
             persona.calcularDoble();
             
             //llamar al metodoestatico sin nesecidad de crear un objeto
             EjemploClase.metodoEstatico();
                         
        }
}

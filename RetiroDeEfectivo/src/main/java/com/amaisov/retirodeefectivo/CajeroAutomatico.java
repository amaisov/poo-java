/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.amaisov.retirodeefectivo;

/**
 *
 * @author amairani
 */
public class CajeroAutomatico {
    public void consultarSaldo(Usuario usuario){
        System.out.println(" saldo actual de "+ usuario.getNombre()+":S"+usuario.getCuenta().getsaldo());
    }
    
    public void depositar(Usuario usuario, double cantidad){
        usuario.getCuenta().depositar(cantidad);
    }
    
    public void retirar(Usuario usuario, double cantidad){
        usuario.getCuenta().retirar(cantidad);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.amaisov.retirodeefectivo;

/**
 *
 * @author amairani
 */
public class Banco {

    public static void main(String[] args) {
       Usuario usuario= new Usuario("Alfonso Miguel", 500000);
       CajeroAutomatico cajero= new CajeroAutomatico();
       cajero.consultarSaldo(usuario);
       cajero.depositar(usuario, 500);
       cajero.retirar(usuario, 300);
       cajero.retirar(usuario, 100000);
       cajero.consultarSaldo(usuario);
    }
}

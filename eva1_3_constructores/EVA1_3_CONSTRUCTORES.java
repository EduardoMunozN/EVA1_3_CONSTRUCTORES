/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva1_3_constructores;

/**
 *
 * @author eduar
 */
public class EVA1_3_CONSTRUCTORES {

    public static void main(String[] args) {
        CuentaBancaria cliente1 = new CuentaBancaria("2", 40000, "Carlos Slim");
        //cliente1.setCliente("Carlos Slim");
        //cliente1.setNumeroCuenta("1");
        //cliente1.setSaldo(400000000);
        //cliente1.imprimirDatos();
        
        System.out.println("DATOS DEL CLIENTE");
        String nombre = cliente1.getCliente();
        System.out.println(nombre);
        System.out.println(cliente1.getNumeroCuenta());
        System.out.println(cliente1.getSaldo());
        //---------
        CuentaBancaria cliente2 = new CuentaBancaria("2", 11500, "Eduardo Muñoz");
        
        System.out.println(cliente2.getCliente());
        System.out.println(cliente2.getNumeroCuenta());
        System.out.println(cliente2.getSaldo());
    }
}

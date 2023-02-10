/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_3_constructores;

/**
 *
 * @author eduar
 */
public class CuentaBancaria {
    private String cliente;
    private String numerocuenta;
    private double saldo;
    
    //constructores
    //default y con atributos
    
    public CuentaBancaria(){//constructor default
        numerocuenta = "---";
        saldo = 0;
        cliente ="---";
    }
    
    public  CuentaBancaria(String nCuenta, double sald, String ncliente){
        numerocuenta = nCuenta;
        saldo = sald;
        cliente = ncliente;
    }
    
    public String getCliente (){
        return cliente;
    }
    public void setCliente (String valor){
        cliente = valor;
    }
    public String getNumeroCuenta (){
        return numerocuenta;
    }
    public void setNumeroCuenta (String valor){
        numerocuenta = valor;
    }
    public double getSaldo (){
        return saldo;
    }
    public void setSaldo (double valor){
        saldo = valor;
    }
    public void imprimirDatos (){
        System.out.println("Datos del cliente");
        System.out.println("El titular de la cuenta es: " + cliente);
        System.out.println("Su número de cuenta es: " + numerocuenta);
        System.out.println("El saldo de su cuenta es de: " +saldo);
    }
}

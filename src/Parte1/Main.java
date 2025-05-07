/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Parte1;
/**
 *
 * @author Alumno Tarde
 */
public class Main {
    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        // Depuración. Se detiene siempre
        CCuenta miCuenta = new CCuenta(2000);
        System.out.println("Saldo Inicial: " + miCuenta.dSaldo + " euros");

        // Depuración. Provoca parada por ingreso con cantidad menor de 0
        miCuenta.ingresar(-100);
        System.out.println("Saldo Inicial: " + miCuenta.dSaldo + " euros");

        miCuenta.ingresar(100);
        System.out.println("Saldo tras ingreso: " + miCuenta.dSaldo + " euros");

        miCuenta.ingresar(200);
        System.out.println("Saldo tras ingreso: " + miCuenta.dSaldo + " euros");

        // Depuración. Provoca parada con condición de tercer ingreso
        miCuenta.ingresar(300);
        System.out.println("Saldo tras ingreso: " + miCuenta.dSaldo + " euros");

        miCuenta.retirar(50);
        System.out.println("Saldo tras retirada: " + miCuenta.dSaldo + " euros");
    }

}

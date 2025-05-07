/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte1;

/**
 *
 * @author Alumno Tarde
 */
public class CCuenta {

    protected double dSaldo;
    protected int cont = 0;

    public CCuenta(double dSaldo) {
        this.dSaldo = dSaldo;
    }

    public int ingresar(double cantidad) {
        int iCodErr;
        if (cantidad < 0) {
            System.out.println("No se puede ingresar una cantidad negativa");
            iCodErr = 1;
        } else if (cantidad == -3) {
            System.out.println("Error detectable en pruebas de caja blanca");
            iCodErr = 2;
        } else {
            // Depuración. Punto de parada. Solo en el 3 ingreso
            dSaldo = dSaldo + cantidad;
            cont++;
            iCodErr = 0;
        }
        // Depuración. Punto de parada cuando la cantidad es menor de 0
        return iCodErr;
    }

    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("No se puede retirar una cantidad negativa");
        } else if (dSaldo < cantidad) {
            System.out.println("No hay suficiente saldo");
        } else {
            dSaldo -= cantidad;
            System.out.println("Saldo Restante: " + dSaldo);
        }

    }

    public void lblblb() {
        System.out.println("blablabla blebleble blublublu");
    }
}

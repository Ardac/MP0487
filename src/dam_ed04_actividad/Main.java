/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @author Miguel Tuimil
 * @version ED04
 */
package dam_ed04_actividad;


public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;
        float cantidad = 0;
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        operativa_cuenta(cuenta1,saldoActual,cantidad);
    }
    private static void operativa_cuenta(CCuenta cuenta1, double saldoActual, float cantidad){
        System.out.println("El saldo actual es"+ saldoActual );
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}

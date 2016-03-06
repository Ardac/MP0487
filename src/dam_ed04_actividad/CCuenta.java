/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dam_ed04_actividad;

/**
 *
 * @author miguel
 */
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     *
     */
    public CCuenta()
    {
    }
    /**
     * Constructor de la clase CCuenta 
     * @param nom String con el nombre
     * @param cue String con la cuenta
     * @param sal Double con el saldo
     * @param tipo Double con el tipo de interes
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    /**
     * Metodo que llama al setter del atributo nombre
     * @param nom String para el nombre
     */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }
/**
 * Metodo que llama al getter de nombre
 * @return String nombre
 */
    public String obtenerNombre()
    {
        return getNombre();
    }

/**
 * Metodo que llama al getter de saldo
 * @return String saldo
 */
    public double estado()
    {
        return getSaldo();
    }

/**
 * Metodo para sumar saldo
 * @param cantidad Double
 * @throws Exception cuando cantidad es menor a 0
 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
/**
 * Metodo para substraer de saldo
 * @param cantidad
 * @throws Exception cuando cantidad es menor o igual a 0 y saldo es menor a cantidad
 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
/**
 * Metodo que llama al getter de cuenta
 * @return String cuenta
 */

    public String obtenerCuenta()
    {
        return getCuenta();
    }
/**
 * Getter de nombre
 * @return String nombre
 */

    public String getNombre() {
        return nombre;
    }
/**
 * Setter de nombre
 * @param nombre String
 */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/**
 * Getter de tipointeres
 * @return Double tipoInteres
 */

    public double getTipoInterés() {
        return tipoInterés;
    }
/**
 * Setter de tipoInteres
 * @param tipoInterés Double
 */

    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * Getter de cuenta
     * @return String cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Setter de cuenta
     * @param cuenta String
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Getter de salgo
     * @return Double saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Setter de saldo
     * @param saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

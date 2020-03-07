package contabanco;

/**
 * Contabanco
 */

public abstract class Contabanco {

    protected  int numconta;
    protected double saldo;
    
    public abstract void sacar(double sacar);
    public abstract void depositar(double depositar);
}
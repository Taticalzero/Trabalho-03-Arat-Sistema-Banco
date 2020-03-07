package poupancaconta;
import contabanco.Contabanco;

/**
 * poupancaconta
 */

public class Poupancaconta extends Contabanco {

    //aplicando as operações bancarias
    @Override
    public void sacar(double sacar) {
        saldo = saldo - sacar;
    }

    @Override
    public void depositar(double depositar) {
        saldo = saldo + depositar;
    }

    public int getnumconta() {
        return numconta;
    }

    public void setnumconta(int numconta) {
        this.numconta = numconta;
    }

    // print das operações bancarias 
    public String toString() {
        return "Número: "
               + getnumconta()
               + "\nSaldo: "
               + saldo
               + "\n";
    }
}
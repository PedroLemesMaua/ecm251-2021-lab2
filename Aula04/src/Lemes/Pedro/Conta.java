package Lemes.Pedro;

public class Conta {
    //Atributos
    private Cliente cliente;
    private int numero;
    private double saldo;

    //Métodos da classe
    public void visualizarSaldo() {
        double saldo = 50;
        System.out.println("Valor do saldo: R$" + this.saldo);
        saldo = this.saldo;
        //while(saldo > 0) {
        //    System.out.println("Saldo:"+saldo);
         //   saldo = saldo - 10;
        //}
        //System.out.println("Valor do saldo: R$" + this.saldo);
    }

    public boolean sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public void depositar(double valor) {
        //this.saldo = this.saldo + valor;
        this.saldo +=valor;
    }

    public boolean transferirDinheiro(Conta destino, double valor) {
        if(this.sacar(valor)){
            destino.depositar(valor);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "cliente=" + cliente.toString() +
                ", numero=" + numero +
                ", saldo=" + saldo +
                '}';
    }
}

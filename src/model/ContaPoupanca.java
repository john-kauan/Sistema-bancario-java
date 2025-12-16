package model;

public class ContaPoupanca extends Conta {


    public ContaPoupanca(int numero, Cliente cliente) {
        super(numero, cliente);
    }

    @Override
    public String tipo(){
        return "Conta Poupança";
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo = saldo - valor;
        } else {
            System.out.println("Impossível sacar, saldo insuficiente");
        }
    }

}

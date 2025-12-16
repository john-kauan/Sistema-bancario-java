package model;

public class ContaCorrente extends Conta{

    private double taxa;


    public ContaCorrente(int numero, Cliente cliente) {
        super(numero, cliente);
        this.taxa = 0.3;

    }

    @Override
    public String tipo(){
        return "Conta Corrente";
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo = saldo - (valor * taxa);
        } else {
            System.out.println("Impossível sacar, saldo insuficiente");
        }
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

}

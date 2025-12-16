package model;

public class Conta {

    protected int numero;
    protected double saldo;
    protected Cliente cliente;


    public Conta(int numero, Cliente cliente){
        this.numero = numero;
        this.saldo = 0;
        this.cliente = cliente;

    }

    public String tipo(){
        return null;
    };

    public void sacar(double valor){};

    public void depositar(double valor){
        if(valor > 0){
            saldo = valor + saldo;
        }else{
            System.out.println("Impossível depositar valor negativo!");
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    }


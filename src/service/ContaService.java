package service;

import model.Cliente;
import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;
import java.util.ArrayList;
import java.util.List;

public class ContaService {

    private List<Conta> contas = new ArrayList<>();
    private int numeroConta = 1000;

    public void criarContaCorrente(Cliente cliente) {
        Conta conta = new ContaCorrente(numeroConta++, cliente);
        contas.add(conta);
        System.out.println("Conta Corrente criada! Nº: " + conta.getNumero());
    }

    public void criarContaPoupanca(Cliente cliente) {
        Conta conta = new ContaPoupanca(numeroConta++, cliente);
        contas.add(conta);
        System.out.println("Conta Poupança criada! Nº: " + conta.getNumero());
    }

    public Conta buscarPorNumero(int numero) {
        for (int i = 0; i < contas.size(); i++) {
            if (contas.get(i).getNumero() == numero) {
                return contas.get(i);
            }
        }
        return null;
    }

    public void depositar(int numero, double valor) {
        Conta conta = buscarPorNumero(numero);

        if (conta != null) {
            conta.depositar(valor);
            System.out.println("Depósito realizado!");
        } else {
            System.out.println("Conta não encontrada!");
        }
    }

    public void sacar(int numero, double valor) {
        Conta conta = buscarPorNumero(numero);

        if (conta != null) {
            conta.sacar(valor);
            System.out.println("Saque realizado!!");
        } else {
            System.out.println("Conta não encontrada!");
        }
    }

    public void transferir(int origem, int destino, double valor) {
        Conta contaOrigem = buscarPorNumero(origem);
        Conta contaDestino = buscarPorNumero(destino);

        if (contaOrigem != null && contaDestino != null) {
            if (contaOrigem.getSaldo() >= valor) {
                contaOrigem.sacar(valor);
                contaDestino.depositar(valor);
                System.out.println("Transferência realizada!");
            } else {
                System.out.println("Saldo insuficiente!");
            }
        } else {
            System.out.println("Conta origem ou destino não encontrada!");
        }
    }

    public void listarContas() {
        for (Conta c : contas) {
            System.out.println(
                    "Conta: " + c.getNumero() +
                            " | Cliente: " + c.getCliente().getNome() +
                            " | Saldo: " + c.getSaldo() +
                            " | Tipo de conta: " + c.tipo()
            );
        }
    }

    public void consultarSaldo(int numeroConta) {
        Conta conta = buscarPorNumero(numeroConta);

        if (conta != null) {
            System.out.println("Saldo atual: R$ " + conta.getSaldo());
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

}


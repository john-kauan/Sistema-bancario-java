package util;

import model.Cliente;
import service.ClienteService;
import service.ContaService;

import java.util.Scanner;

public class Menu {

    // ========== MENU PRINCIPAL =====================
    public static void menuPrincipal() {
            System.out.println("\n=== SISTEMA BANCÁRIO ===");
            System.out.println("1 - Clientes");
            System.out.println("2 - Contas");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
    }

    // ================= MENU CLIENTES =================
    public static void menuClientes() {
            System.out.println("\n--- MENU CLIENTES ---");
            System.out.println("1 - Cadastrar cliente");
            System.out.println("2 - Listar clientes");
            System.out.println("3 - Remover cliente");
            System.out.println("0 - Voltar");
            System.out.print("Opção: ");
    }

    public static void menuClientes(Scanner sc, ClienteService clienteService) {

        int opcao;

        do {
            Menu.menuClientes();
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {

                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("CPF (XXX.XXX.XXX-XX): ");
                    String cpf = sc.nextLine();
                    System.out.println("Data de Nascimento (DD/MM/AAAA): ");
                    String dataNascimento = sc.nextLine();
                    clienteService.cadastrar(nome, cpf, dataNascimento);
                    break;

                case 2:
                    for (int i = 0; i < clienteService.listar().size(); i++) {
                        Cliente c = clienteService.listar().get(i);
                        System.out.println(c.getId() + " - " + c.getNome());
                    }
                    break;

                case 3:
                    System.out.print("ID do cliente: ");
                    int id = sc.nextInt();
                    clienteService.remover(id);
                    break;
            }

        } while (opcao != 0);
    }


    // ================= MENU CONTAS =================
    public static void menuContas() {
            System.out.println("\n--- MENU CONTAS ---");
            System.out.println("1 - Criar conta corrente");
            System.out.println("2 - Criar conta poupança");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sacar");
            System.out.println("5 - Transferir");
            System.out.println("6 - Listar contas");
            System.out.println("7 - Consultar saldo");
            System.out.println("0 - Voltar");
            System.out.print("Opção: ");
    }

    // ================= MENU CONTAS =================
    public static void menuContas(
            Scanner sc,
            ClienteService clienteService,
            ContaService contaService
    ) {

        int opcao;

        do {
            Menu.menuContas();
            opcao = sc.nextInt();

            switch (opcao) {

                case 1: // criar conta corrente
                    System.out.print("ID do cliente: ");
                    int idCC = sc.nextInt();
                    Cliente clienteCC = clienteService.buscarPorId(idCC);

                    if (clienteCC != null) {
                        contaService.criarContaCorrente(clienteCC);
                    } else {
                        System.out.println("Cliente não encontrado!");
                    }
                    break;

                case 2: // criar conta poupança
                    System.out.print("ID do cliente: ");
                    int idCP = sc.nextInt();
                    Cliente clienteCP = clienteService.buscarPorId(idCP);

                    if (clienteCP != null) {
                        contaService.criarContaPoupanca(clienteCP);
                    } else {
                        System.out.println("Cliente não encontrado!");
                    }
                    break;

                case 3: // depositar
                    System.out.print("Número da conta: ");
                    int numDep = sc.nextInt();
                    System.out.print("Valor: ");
                    double valorDep = sc.nextDouble();
                    contaService.depositar(numDep, valorDep);
                    break;

                case 4: // sacar
                    System.out.print("Número da conta: ");
                    int numSaq = sc.nextInt();
                    System.out.print("Valor: ");
                    double valorSaq = sc.nextDouble();
                    contaService.sacar(numSaq, valorSaq);
                    break;

                case 5: // transferir
                    System.out.print("Conta origem: ");
                    int origem = sc.nextInt();
                    System.out.print("Conta destino: ");
                    int destino = sc.nextInt();
                    System.out.print("Valor: ");
                    double valor = sc.nextDouble();
                    contaService.transferir(origem, destino, valor);
                    break;

                case 6:
                    contaService.listarContas();
                    break;

                case 7:
                    System.out.print("Número da conta: ");
                    int numero = sc.nextInt();
                    contaService.consultarSaldo(numero);
                    break;
            }

        } while (opcao != 0);
    }

}

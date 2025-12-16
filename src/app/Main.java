package app;

import java.util.Scanner;

import model.Cliente;
import service.ClienteService;
import service.ContaService;
import util.Menu;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ClienteService clienteService = new ClienteService();
        ContaService contaService = new ContaService();

        int opcaoPrincipal;

        do {
            Menu.menuPrincipal();
            opcaoPrincipal = scanner.nextInt();

            switch (opcaoPrincipal) {

                case 1:
                    Menu.menuClientes(scanner, clienteService);
                    break;

                case 2:
                    Menu.menuContas(scanner, clienteService, contaService);
                    break;

                case 0:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcaoPrincipal != 0);

        scanner.close();
    }



}

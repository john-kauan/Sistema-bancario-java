package service;

import model.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ClienteService {

    private List<Cliente> clientes = new ArrayList<>();
    private int contadorId = 1;

    public void cadastrar(String nome, String cpf, String dataNascimento){
        clientes.add(new Cliente(contadorId++, nome, cpf, dataNascimento ));
    }

    public List<Cliente> listar(){
        return clientes;
    }

    public Cliente buscarPorId(int id){
        for (int i = 0; i < clientes.size(); i++){
            Cliente c = clientes.get(i);
            if (c.getId() == id){
                return c;
            }
        }
        return null;
    }

    public void remover(int id) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getId() == id) {
                clientes.remove(i);
                System.out.println("Cliente removido com sucesso!");
                return;
            }
        }
        System.out.println("Cliente não encontrado!");
    }
}

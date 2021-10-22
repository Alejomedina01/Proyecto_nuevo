package models;

import java.util.ArrayList;

public class Manager {

    private ArrayList<Cliente> clientes;

    public Manager(){
        clientes = new ArrayList<>();
    }

    public void addClient(int id, String name, long cellphone, String career, String birthday){
        clientes.add(new Cliente(id, name, cellphone, career, birthday));
    }

    public Cliente getClient(int id){
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                return cliente;
            }
        }
        return null;
    }
}

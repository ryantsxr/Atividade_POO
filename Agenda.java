package atividades;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato(contato novoContato) {
        contatos.add(novoContato);
        System.out.println("Contato adicionado com sucesso!");
    }

    public void removerContato(String nome) {
        contatos.removeIf(c -> c.getNome().equalsIgnoreCase(nome));
        System.out.println("Contato removido com sucesso!");
    }

    public contato buscarContato(String nome) {
        for (contato c : contatos) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                return c;
            }
        }
        return null;
    }

    public void listarContatos() {
        if (contatos.isEmpty()) {
            System.out.println("Agenda vazia!");
            return;
        }
        
        System.out.println("=== Lista de Contatos ===");
        for (contato c : contatos) {
            System.out.println("\n" + c.toString());
            System.out.println("------------------------");
        }
    }

    public void editarContato(String nome, String novoTelefone, String novoEmail, String novoEndereco) {
        contato c = buscarContato(nome);
        if (c != null) {
            c.setTelefone(novoTelefone);
            c.setEmail(novoEmail);
            c.setEndereco(novoEndereco);
            System.out.println("Contato atualizado com sucesso!");
        } else {
            System.out.println("Contato não encontrado!");
        }
    }

    public int getQuantidadeContatos() {
        return contatos.size();
    }
}

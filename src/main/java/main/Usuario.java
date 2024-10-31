package main;

import java.util.ArrayList;
import java.util.List;

public class Usuario implements Observador {
    private String nome;
    private String email;
    private List<String> mensagens;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.mensagens = new ArrayList<>();
    }

    @Override
    public void atualizar(String mensagem) {
        mensagens.add(mensagem);
        System.out.println("Nova mensagem para " + nome + ": " + mensagem);
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}

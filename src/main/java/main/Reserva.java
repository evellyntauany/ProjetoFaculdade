package main;

import java.util.ArrayList;
import java.util.List;

public class Reserva {
    private Usuario usuario;
    private Quarto quarto;
    private List<Observador> observadores;

    public Reserva(Usuario usuario, Quarto quarto) {
        this.usuario = usuario;
        this.quarto = quarto;
        notificar();
    }

    public void notificar() {
        String mensagem = "Sua reserva foi confirmada!";
        usuario.atualizar(mensagem);
    }

    public void exibirDetalhes() {
        System.out.println("Detalhes da Reserva:");
        System.out.println("Nome do Usuário: " + usuario.getNome());
        System.out.println("E-mail: " + usuario.getEmail());
        System.out.println("Tipo: " + quarto.getTipo());
        System.out.println("Capacidade: " + quarto.getCapacidade());
        System.out.println("Com tv: " + quarto.getcomTv());
        System.out.println("Preço: R$ " + quarto.getPreco());

    }
}

package main;

// Main.java
public class Main {
    public static void main(String[] args) {
        Pousada pousada1 = Pousada.getInstance();

        Usuario usuario = new Usuario("João", "joao@example.com");
        Quarto quarto = new Quarto.Builder()
                .setTipo("5 estrelas")
                .setCapacidade(2)
                .setPreco(200)
                .comTv()
                .build();

        Reserva reserva = pousada1.reservarQuarto(usuario, quarto);
        reserva.exibirDetalhes();
    }
}


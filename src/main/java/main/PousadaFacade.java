package main;

public class PousadaFacade {
    public void fazerReserva(String nome, String email, String tipoQuarto, int capacidade, double preco, boolean tv) {
        Usuario usuario = new Usuario(nome, email);

        Quarto quarto = new Quarto.Builder()
                .setTipo(tipoQuarto)
                .setCapacidade(capacidade)
                .setPreco(preco)
                .comTv(tv)
                .build();

        Pousada pousada = Pousada.getInstance();
        Reserva reserva = pousada.reservarQuarto(usuario, quarto);

        reserva.adicionarObservador(new Observador() {
            @Override
            public void atualizar(String mensagem) {
                Notificacao.sendEmail(email, mensagem);
            }
        });

        reserva.exibirDetalhes();
    }
}

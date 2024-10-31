package main;

public class SistemaPousada {
    private Pousada pousada;

    public SistemaPousada() {
        pousada = Pousada.getInstance();
    }

    public void realizarReserva(Usuario usuario, Quarto quarto) {
        Reserva reserva = pousada.reservarQuarto(usuario, quarto);
        reserva.notificar();
        reserva.exibirDetalhes();
    }
}

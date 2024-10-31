package main;

import java.util.ArrayList;
import java.util.List;

public class Pousada {
    private static Pousada instance;
    private List<Reserva> reservas;


    private Pousada() {
        reservas = new ArrayList<>();
    }

    public static Pousada getInstance() {
        if (instance == null) {
            instance = new Pousada();
        }
        return instance;
    }

    public Reserva reservarQuarto(Usuario usuario, Quarto quarto) {
        Reserva novaReserva = new Reserva(usuario, quarto);
        reservas.add(novaReserva);
        return novaReserva;
    }
}


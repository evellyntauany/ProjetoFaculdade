package main;

public class Quarto {
    private String tipo;
    private int capacidade;
    private double preco;
    private boolean comTv;

    private Quarto(Builder builder) {
        this.tipo = builder.tipo;
        this.capacidade = builder.capacidade;
        this.preco = builder.preco;
        this.comTv = builder.comTv;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public double getPreco() {
        return preco;
    }

    public boolean getcomTv() {
        return comTv;
    }

    public static class Builder {
        private String tipo;
        private int capacidade;
        private double preco;
        private boolean comTv;

        public Builder setTipo(String tipo) {
            this.tipo = tipo;
            return this;
        }

        public Builder setCapacidade(int capacidade) {
            this.capacidade = capacidade;
            return this;
        }

        public Builder setPreco(int preco) {
            this.preco = preco;
            return this;
        }

        public Builder comTv() {
            this.comTv = true; // Define que o quarto terá TV
            return this;
        }

        public Quarto build() {
            return new Quarto(this);
        }
    }


}


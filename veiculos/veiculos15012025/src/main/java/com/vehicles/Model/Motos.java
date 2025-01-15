package com.vehicles.Model;

public class Motos extends Veiculo{

    private int cilindrada;

    public Motos() {
    }

    public Motos(String nome, int ano, int modelo, String cor, String placa, boolean unico_dono, int cilindrada) {
        super(nome, ano, modelo, cor, placa, unico_dono);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}

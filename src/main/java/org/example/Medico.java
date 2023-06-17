package org.example;

public class Medico extends Plantonista {
    public Medico (float hora) {
        super(hora);
    }

    public float calcularPlantao() {
        return this.hora + this.plantao.horasPlantao();
    }
}

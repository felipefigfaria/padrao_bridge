package org.example;

public class Enfermeiro extends Plantonista {
    public Enfermeiro (float hora) {
        super(hora);
    }

    public float calcularPlantao() {
        return this.hora + this.plantao.horasPlantao();
    }
}

package org.example;

public abstract class Plantonista {

    public  float hora;
    protected Plantao plantao;


    public Plantonista(float hora) {
        this.hora = hora;
    }

    public void setPlantao(Plantao tipoDesconto) {
        this.plantao = tipoDesconto;
    }
    public abstract float calcularPlantao();

}

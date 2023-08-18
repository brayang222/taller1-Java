package com.brayanvargas.domain;

public class Dispensador {
    public int serial;
    public String marca;
    public int cantMax;
    public int cantAct;
    public int temp;

    public int servir(int litroServido){
        this.cantAct -= litroServido;
        return cantAct;
    }

    public int llenar(int cantidadRellenar){
        this.cantAct += cantidadRellenar;
        return cantAct;
    }

    public int vaciar(){ return this.cantAct = 0; }

    public String caliente() {
        return "está caliente";
    }


    public String frio() {
        return "está frio";
    }

    public int mostrarNivel(){ return this.cantAct; }
}

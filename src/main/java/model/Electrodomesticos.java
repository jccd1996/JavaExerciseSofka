package model;

class Electrodomesticos {
    Double precioBase = 100.0;
    String color ="blanco";
    Double peso =5.0;
    char consumoEnergetico = 'F';

    public Electrodomesticos() {
    }

    public Electrodomesticos(Double precioBase, Double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Electrodomesticos(Double precioBase, String color, Double peso, char consumoEnergetico) {
        this.precioBase = precioBase;
        this.color = color;
        this.peso = peso;
        this.consumoEnergetico = consumoEnergetico;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public Double getPeso() {
        return peso;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }
}

package model;

import exercise.AccionesPersonas;

public class Persona implements AccionesPersonas {

    String nombre = "";
    Integer edad = 0;
    Integer dni = 0;
    char sexo = 'm';
    Integer peso = 0;
    Double altura = 0.0;

    public Persona() {
        this.dni = generarDNI();
    }

    public Persona(String nombre, Integer edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.dni = generarDNI();
    }

    public Persona(String nombre, Integer edad, Integer dni, char sexo, Integer peso, Double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = generarDNI();
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public Integer calcularIMC() {
        Double imc = (this.peso / (altura * altura));

        if (imc < 20) {
            return -1;
        }
        if (imc >= 20 && imc <= 25) {
            return 0;
        }
        return 1;
    }

    @Override
    public Boolean esMayorDeEdad() {
        return this.edad>= 18;
    }

    @Override
    public String esMayorDeEdadConMensaje() {
        if (esMayorDeEdad()){
            return "Es mayor de edad";
        } else {
            return "Es menor de edad";
        }
    }

    @Override
    public void comprobarSexo(char sexo) {
        if(this.sexo == ('f') || this.sexo ==('m')){
            this.sexo = sexo;
        } else {
            this.sexo = 'h';
        }
    }

    @Override
    public Integer generarDNI() {
        this.dni = (int)(100000000 * Math.random());
        return null;
    }
}

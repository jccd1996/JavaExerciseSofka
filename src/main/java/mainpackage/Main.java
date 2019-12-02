package mainpackage;


import exercise.OneToTen;
import model.Persona;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private OneToTen ejercicios1a10 = new OneToTen();
    private Scanner lectura = new Scanner(System.in);
    private Logger logger = Logger.getLogger("Logger");


    public static void main(String[] args) {
        Main main = new Main();
//        main.exercise1();
//        main.exercise2();
//        main.exercise3();
//        main.exercise4();
//        main.exercise5Odd();
//        main.exercise5Pairs();
//        main.exercise6Odd();
//        main.exercise6Pairs();
//        main.exercise7();
//        main.exercise8();
//        main.exercise9();
//        main.exercise10();
//        main.exercise11();
//        main.exercise12();
//        main.exercise13();
        // main.exercise14();
//        main.ejemploWhile();
//        main.exercise16();


    }


    private void exercise1() {
        logger.log(Level.INFO, ejercicios1a10.isBiggerThan(4, 6));
    }

    private void exercise2() {
        logger.log(Level.INFO, "Ingrese el primer número: ");
        String primerNumero = lectura.nextLine();
        logger.log(Level.INFO, "Ingrese el segundo número: ");
        String segundoNumero = lectura.nextLine();
        logger.log(Level.INFO, ejercicios1a10.isBiggetThanWithInputInConsole(primerNumero, segundoNumero));
    }

    private void exercise3() {
        logger.log(Level.INFO, "Ingrese el radio del circulo: ");
        String radio = lectura.nextLine();
        logger.log(Level.INFO, () -> ejercicios1a10.calculateArea(radio));
    }

    private void exercise4() {
        logger.log(Level.INFO, "Ingrese el precio del producto: ");
        String productPrice = lectura.nextLine();
        logger.log(Level.INFO, () -> ejercicios1a10.calculateIVA(productPrice));
    }

    private void exercise5Pairs() {
        ejercicios1a10.printPairsNumbers();
    }

    private void exercise5Odd() {
        ejercicios1a10.printOddNumbers();
    }

    private void exercise6Pairs() {
        ejercicios1a10.printPairsNumbersWithFor();
    }

    private void exercise6Odd() {
        ejercicios1a10.printOddNumbersWithFor();
    }

    private void exercise7() {
        String message;
        do {
            logger.log(Level.INFO, "Ingrese un número: ");
            String number = lectura.nextLine();
            message = ejercicios1a10.printNumberBiggerThanZero(number);
            if (!message.equals("Error")) {
                logger.log(Level.INFO, message);
            } else {
                logger.log(Level.INFO, "Solo se debe ingresar números");
            }
        } while (message.equals("El número es menor que 0"));
    }

    private void exercise8() {
        logger.log(Level.INFO, "Ingrese el nombre de un día: ");
        String day = lectura.nextLine();
        logger.log(Level.INFO, () -> ejercicios1a10.isWorkDay(day));
    }

    private void exercise9() {
        logger.log(Level.INFO, "Ingrese una frase motivadora: ");
        String sentence = lectura.nextLine();
        logger.log(Level.INFO, () -> ejercicios1a10.printSentenceWithInputSentence(sentence));
    }

    private void exercise10() {
        logger.log(Level.INFO, "Ingrese una frase: ");
        String sentence = lectura.nextLine();
        logger.log(Level.INFO, () -> ejercicios1a10.printSentenceWithoutSpace(sentence));
    }


    private void exercise11() {
        logger.log(Level.INFO, "Ingrese una oración: ");
        String sentence = lectura.nextLine();
        logger.log(Level.INFO, () -> ejercicios1a10.printNumberOfVowels(sentence) + "");
    }


    private void exercise12() {
        logger.log(Level.INFO, "Ingrese la primera palabra: ");
        String firstWord = lectura.nextLine();
        logger.log(Level.INFO, "Ingrese la segunda palabra: ");
        String secondWord = lectura.nextLine();
        logger.log(Level.INFO, () -> ejercicios1a10.printDifferencesLetters(firstWord, secondWord));
    }

    private void exercise13() {
        logger.log(Level.INFO, ejercicios1a10.printCurrentDate());
    }

    private void exercise14() {
        logger.log(Level.INFO, "Ingrese un número: ");
        String inputNumber = lectura.nextLine();
        ArrayList<Integer> numbersList = ejercicios1a10.printInputNumberUntilOneHundred(inputNumber);
        numbersList.forEach(number -> logger.log(Level.INFO, number + ""));
    }

    private void exercise16() {
        ArrayList<Persona> personas = new ArrayList<>();

        Persona primerPersona = new Persona();
        logger.log(Level.INFO, "Ingrese un nombre: ");
        String nombre = lectura.nextLine();
        primerPersona.setNombre(nombre);

        logger.log(Level.INFO, "Ingrese un la edad: ");
        String edad = lectura.nextLine();
        primerPersona.setEdad(Integer.parseInt(edad));

        logger.log(Level.INFO, "Ingrese sexo (F) o (M): ");
        String sexo = lectura.nextLine().toLowerCase();
        primerPersona.setSexo(sexo.charAt(0));

        logger.log(Level.INFO, "Ingrese peso: ");
        String peso = lectura.nextLine().toLowerCase();
        primerPersona.setPeso(Integer.parseInt(peso));

        logger.log(Level.INFO, "Ingrese altura: ");
        String altura = lectura.nextLine().toLowerCase();
        primerPersona.setPeso(Integer.parseInt(altura));

        personas.add(primerPersona);

        Persona segundaPersona = new Persona();
        logger.log(Level.INFO, "Ingrese un nombre: ");
        String segundoNombre = lectura.nextLine();
        segundaPersona.setNombre(segundoNombre);

        logger.log(Level.INFO, "Ingrese un la edad: ");
        String segundaEdad = lectura.nextLine();
        segundaPersona.setEdad(Integer.parseInt(segundaEdad));

        logger.log(Level.INFO, "Ingrese sexo (F) o (M): ");
        String segundoSexo = lectura.nextLine().toLowerCase();
        segundaPersona.setSexo(segundoSexo.charAt(0));

        personas.add(segundaPersona);

        Persona terceraPersona = new Persona();
        personas.add(terceraPersona);


        personas.forEach(personaIterada -> {
            System.out.println("El peso ideal de " + personaIterada.getNombre() + " es " + personaIterada.calcularIMC());
            System.out.println(personaIterada.getNombre() + " " + personaIterada.esMayorDeEdadConMensaje());
        });


    }

    private void ejemploWhile() {
        int count = 0;
        while (count <= 10) {
            System.out.println(count);
            count = count + 1;
        }
        count = 0;

        System.out.println("Ejemplo con break");

        while (true) {
            System.out.println(count + "break");
            if (count == 10) {
                break;
            } else {
                count = count + 1;
            }
        }
    }
}

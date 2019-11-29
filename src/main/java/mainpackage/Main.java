package mainpackage;


import exercise.OneToTen;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private OneToTen ejercicios1a10 = new OneToTen();
    private Scanner lectura = new Scanner(System.in);
    private Logger logger = Logger.getLogger("Logger");


    public static void main(String[] args) {
        Main main = new Main();
        main.exercise1();
        main.exercise2();
        main.exercise3();
        main.exercise4();
        main.exercise5Odd();
        main.exercise5Pairs();
        main.exercise6Odd();
        main.exercise6Pairs();
        main.exercise7();
        main.exercise8();
        main.exercise9();
        main.exercise10();
        main.exercise11();
        main.exercise12();


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
        logger.log(Level.INFO, () -> ejercicios1a10.printDifferencesLetters(firstWord,secondWord));
    }
}

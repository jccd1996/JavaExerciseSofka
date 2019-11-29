package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OneToTen {
    private Logger logger = Logger.getLogger("Logger");
    private String onlyNumbers = "Solo se permiten ingresar números";
    private String numbers = "El número";
    private String errorLabel = "ERROR";


    public String isBiggerThan(Integer firstNumber, Integer secondNumber) {
        if (firstNumber.equals(secondNumber)) {
            return "Los números" + " " + "son iguales";
        }
        if (firstNumber > secondNumber) {
            return numbers + " " + firstNumber + " es mayor que " + secondNumber;
        } else {
            return numbers + " " + secondNumber + " es mayor que " + firstNumber;
        }
    }

    public String isBiggetThanWithInputInConsole(String primerNumero, String segundoNumero) {
        try {
            return isBiggerThan(Integer.parseInt(primerNumero), Integer.parseInt(segundoNumero));
        } catch (NumberFormatException e) {
            return onlyNumbers;
        }
    }

    public String calculateArea(String radio) {
        try {
            Double radioCalculate = Double.parseDouble(radio);
            double area = Math.PI * (radioCalculate * radioCalculate);
            return "El área del circulo es " + area;
        } catch (NumberFormatException e) {
            return onlyNumbers;
        }
    }

    public String calculateIVA(String productPrice) {
        try {
            double iva = Double.parseDouble(productPrice) * Constants.IVA;
            return (iva >= 0) ? ("El IVA del producto es " + iva) : ("El producto debe ser mayor a 0");
        } catch (NumberFormatException e) {
            return onlyNumbers;
        }
    }

    public void printPairsNumbers() {
        int x = 0;
        while (x < 100) {
            if (x % 2 == 0) {
                int finalX = x;
                logger.log(Level.INFO, () -> finalX + "");
            }
            x++;
        }
    }

    public void printOddNumbers() {
        int x = 0;
        while (x < 100) {
            if (x % 2 != 0) {
                int finalX = x;
                logger.log(Level.INFO, () -> finalX + "");
            }
            x++;
        }
    }

    public void printPairsNumbersWithFor() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                int finalI = i;
                logger.log(Level.INFO, () -> finalI + "");
            }
        }
    }

    public void printOddNumbersWithFor() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                int finalI = i;
                logger.log(Level.INFO, () -> finalI + "");
            }
        }
    }

    public String printNumberBiggerThanZero(String inputNumber) {
        try {
            int number = Integer.parseInt(inputNumber);
            if (number == 0) {
                return numbers + " es 0";
            } else if (number > 0) {
                return numbers + " " + number + " es mayor a 0";
            } else {
                return numbers + " es menor que 0";
            }
        } catch (NumberFormatException e) {
            return errorLabel;
        }
    }

    public String isWorkDay(String day) {
        try {
            switch (day.toLowerCase()) {
                case "lunes":
                case "martes":
                case "miércoles":
                case "miercoles":
                case "jueves":
                case "viernes":
                    return day + " " + "Es un día laboral";
                case "sábado":
                case "sabado":
                case "domingo":
                    return day + " " + "No es un día laboral";
                default:
                    return "Lo que escribiste no es un día de la semana";
            }
        } catch (NullPointerException e) {
            return errorLabel;
        }
    }

    public String printSentenceWithInputSentence(String mySentence) {
        String sentence = "La sonrisa sera la mejor arma contra la tristeza";
        String newSentence = sentence.replace("a", "e");
        if (mySentence != null) {
            return newSentence + " " + mySentence;
        } else {
            return newSentence;
        }
    }

    public String printSentenceWithoutSpace(String sentence) {
        try {
            return sentence.replace(" ", "");
        } catch (NullPointerException e) {
            throw new NullPointerException();
        }
    }

    public Integer printLengtSentence(String sentence) {
        return sentence.length();
    }

    public Map<String, Integer> printNumberOfVowels(String sentence) {

        sentence = sentence.toLowerCase();
        Map numbersOfVocals = new HashMap();
        Integer numberOfa = 0;
        Integer numberOfe = 0;
        Integer numberOfi = 0;
        Integer numberOfo = 0;
        Integer numberOfu = 0;
        for (int i = 0; i < sentence.length(); i++) {
            switch (sentence.charAt(i)) {
                case 'a':
                    numberOfa++;
                    break;
                case 'e':
                    numberOfe++;
                    break;
                case 'i':
                    numberOfi++;
                    break;
                case 'o':
                    numberOfo++;
                    break;
                case 'u':
                    numberOfu++;
                    break;
                default:
                    break;
            }
        }

        numbersOfVocals.put("a", numberOfa);
        numbersOfVocals.put("e", numberOfe);
        numbersOfVocals.put("i", numberOfi);
        numbersOfVocals.put("o", numberOfo);
        numbersOfVocals.put("u", numberOfu);
        numbersOfVocals.put("Tamaño", sentence.length());

        return numbersOfVocals;
    }

    public String printDifferencesLetters(String firstWord, String secondWord) {
        if (firstWord.equals(secondWord)) {
            return "Son iguales";
        } else {
            StringBuilder difference = new StringBuilder();
            if (firstWord.length() > secondWord.length()) {
                difference.append(appendBuilder(firstWord, secondWord));
            } else {
                difference.append(appendBuilder(secondWord, firstWord));
            }
            return "La diferencias son: " + difference.toString();
        }
    }

    private String appendBuilder(String biggerWord, String shorterWord) {
        StringBuilder difference = new StringBuilder();
        for (int i = 0; i < shorterWord.length(); i++) {
            if (biggerWord.charAt(i) != shorterWord.charAt(i)) {
                difference.append(biggerWord.charAt(i));
            }
            if (i == shorterWord.length() - 1) {
                int countA = i + 1;
                for (int j = countA; j < biggerWord.length(); j++) {
                    difference.append(biggerWord.charAt(j));
                }
            }
        }
        return difference.toString();
    }
}

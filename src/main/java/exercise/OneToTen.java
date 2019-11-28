package exercise;

import org.junit.Ignore;

public class OneToTen {

    public String isBiggerThan(Integer firstNumber, Integer secondNumber) {
        if (firstNumber.equals(secondNumber)) {
            return "Los números son iguales";
        }
        if (firstNumber > secondNumber) {
            return "El número " + firstNumber + " es mayor que " + secondNumber;
        } else {
            return "El número " + secondNumber + " es mayor que " + firstNumber;
        }
    }

    public String isBiggetThanWithInputInConsole(String primerNumero, String segundoNumero) {
        try {
            return isBiggerThan(Integer.parseInt(primerNumero), Integer.parseInt(segundoNumero));
        } catch (NumberFormatException e) {
            return "Solo se permiten ingresar números";
        }
    }

    public String calculateArea(String radio) {
        try {
            Double radioCalculate = Double.parseDouble(radio);
            double area = Math.PI * (radioCalculate * radioCalculate);
            return "El área del circulo es " + area;
        } catch (NumberFormatException e) {
            return "Solo se permiten ingresar números";
        }
    }

    public String calculateIVA(String productPrice) {
        try {
            double iva = Double.parseDouble(productPrice) * Constants.IVA;
            return (iva >= 0) ? ("El IVA del producto es " + iva) : ("El producto debe ser mayor a 0");
        } catch (NumberFormatException e) {
            return "Solo se permiten ingresar números";
        }
    }

    @Ignore
    public void printPairsNumbers() {
        int x = 0;
        while (x < 100) {
            if (x % 2 == 0) {
                System.out.println(x + "");
            }
            x++;
        }
    }

    public void printOddNumbers() {
        int x = 0;
        while (x < 100) {
            if (x % 2 != 0) {
                System.out.println(x + "");
            }
            x++;
        }
    }

    public void printPairsNumbersWithFor() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i + "");
                i++;
            }
        }
    }

    public void printOddNumbersWithFor() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i + "");
                i++;
            }
        }
    }

    public String printNumberBiggerThanZero(String inputNumber) {
        try {
            int number = Integer.parseInt(inputNumber);
            if(number == 0){
                return "El numero es 0";
            } else if (number > 0) {
                return "El número "+ number + " es mayor a 0";
            } else {
                return "El número es menor que 0";
            }
        } catch (NumberFormatException e) {
            return "Error";
        }
    }
}

import exercise.OneToTen;

import java.util.Scanner;

public class Main {
    private OneToTen ejercicios1a10 = new OneToTen();
    private Scanner lectura = new Scanner(System.in);


    public static void main(String[] args) {
        Main main = new Main();
       // main.exercise7();
    }

    private void exercise1() {
        System.out.println(ejercicios1a10.isBiggerThan(4, 6));
    }

    private void exercise2() {
        System.out.println("Ingrese el primer número: ");
        String primerNumero = lectura.nextLine();
        System.out.println("Ingrese el segundo número: ");
        String segundoNumero = lectura.nextLine();
        System.out.println(ejercicios1a10.isBiggetThanWithInputInConsole(primerNumero,segundoNumero));
    }

    private void exercise3() {
        System.out.println("Ingrese el radio del circulo: ");
        String radio = lectura.nextLine();
        System.out.println(ejercicios1a10.calculateArea(radio));
    }

    private void exercise4() {
        System.out.println("Ingrese el precio del producto: ");
        String productPrice = lectura.nextLine();
        System.out.println(ejercicios1a10.calculateIVA(productPrice));
    }

    private void exercise5Pairs(){
        ejercicios1a10.printPairsNumbers();
    }
    private void exercise5Odd(){
        ejercicios1a10.printOddNumbers();
    }
    private void exercise6Pairs(){
        ejercicios1a10.printPairsNumbersWithFor();
    }
    private void exercise6Odd(){
        ejercicios1a10.printOddNumbersWithFor();
    }
    private void exercise7(){
        String message;
        do{
            System.out.println("Ingrese un número: ");
            String number = lectura.nextLine();
            message = ejercicios1a10.printNumberBiggerThanZero(number);
            if (!message.equals("Error")){
                System.out.println(message);
            } else{
                System.out.println("Solo se debe ingresar números");
            }
        } while (message.equals("El número es menor que 0"));
    }
}

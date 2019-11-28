package exercise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import wrapper.IntegerAsker;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class OneToTenTest {

    private OneToTen oneToTen;

    @BeforeEach
    void setUp() {
        oneToTen = new OneToTen();
    }


    @Test
    void firstNumber_is_bigger_than_secondNumber() {
        Integer firstNumber = 6;
        Integer secondNumber = 5;
        String result = "El número " + firstNumber + " es mayor que " + secondNumber;

        assertEquals(result, oneToTen.isBiggerThan(firstNumber, secondNumber));
    }

    @Test
    void console_has_strings_but_not_numbers() throws NumberFormatException {
        IntegerAsker asker;
        asker = mock(IntegerAsker.class);
        when(asker.ask("anyString()")).thenReturn(5);
    }

    @Test
    void secondNumber_is_bigger_than_firstNumber() {
        Integer firstNumber = 5;
        Integer secondNumber = 6;
        String result = "El número " + secondNumber + " es mayor que " + firstNumber;

        assertEquals(result, oneToTen.isBiggerThan(firstNumber, secondNumber));
    }


    @Test
    void secondNumber_is_Equals_than_firstNumber() {
        Integer firstNumber = 6;
        Integer secondNumber = 6;
        String result = "Los números son iguales";

        assertEquals(result, oneToTen.isBiggerThan(firstNumber, secondNumber));
    }

    @Test
    void verifiy_null_values() {
        assertThrows(NullPointerException.class, () -> {
            oneToTen.isBiggerThan(null, null);
        });
    }

    @Test
    void calculate_area() {
        String result = "El área del circulo es 3.141592653589793";
        assertEquals(result, oneToTen.calculateArea("1"));
    }

    @Test
    void calculate_bigger_than_throw_with_character() {
        String result = "Solo se permiten ingresar números";
        assertEquals(result, oneToTen.isBiggetThanWithInputInConsole("numA", "numB"));
    }

    @Test
    void calculate_area_expected_throw_with_character() {
        String result = "Solo se permiten ingresar números";
        assertEquals(result, oneToTen.calculateArea("radio"));

    }

    @Test
    void calculate_iva_expected_throw_with_character() {
        String result = "Solo se permiten ingresar números";
        assertEquals(result, oneToTen.calculateIVA("iva"));
    }

    @Test
    void calculate_iva() {
        String result = "El IVA del producto es 0.21";
        assertEquals(result, oneToTen.calculateIVA("1"));
    }

    @Test
    void calculate_iva_with_negative_values() {
        String result = "El producto debe ser mayor a 0";
        assertEquals(result, oneToTen.calculateIVA("-8"));
    }

    @Test
    void print_number_bigger_than_zero() {
        String number = "5";
        String result = "El número " + number + " es mayor a 0";

        assertEquals(result, oneToTen.printNumberBiggerThanZero("5"));
    }

    @Test
    void print_number_less_than_zero() {
        String number = "-5";
        String result = "El número es menor que 0";

        assertEquals(result, oneToTen.printNumberBiggerThanZero(number));
    }

    @Test
    void print_number_equasl_zero() {
        String number = "0";
        String result = "El numero es 0";

        assertEquals(result, oneToTen.printNumberBiggerThanZero(number));
    }

    @Test
    void print_number_with_null_value() {
        String result = "Error";
        assertEquals(result, oneToTen.printNumberBiggerThanZero(null));
    }

}
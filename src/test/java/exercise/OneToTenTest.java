package exercise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import wrapper.IntegerAsker;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

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
    void console_has_strings_but_not_numbers() {
        IntegerAsker asker;
        asker = mock(IntegerAsker.class);
        assertEquals(0, asker.ask("afasd"));
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
        String result = "El número es 0";

        assertEquals(result, oneToTen.printNumberBiggerThanZero(number));
    }

    @Test
    void print_number_with_null_value() {
        String result = "ERROR";
        assertEquals(result, oneToTen.printNumberBiggerThanZero(null));
    }

    @Test
    void calculate_work_when_is_a_workday_by_day() {
        String day = "Martes";
        String result = day + " " + "Es un día laboral";
        assertEquals(result, oneToTen.isWorkDay(day));
    }

    @Test
    void calculate_work_when_is_not_a_workday_by_day() {
        String day = "sábado";
        String result = day + " " + "No es un día laboral";
        assertEquals(result, oneToTen.isWorkDay(day));
    }

    @Test
    void calculate_work_when_is_not_day() {
        String day = "sasda";
        String result = "Lo que escribiste no es un día de la semana";
        assertEquals(result, oneToTen.isWorkDay(day));
    }

    @Test
    void calculate_work_if_is_null_value() {
        String result = "ERROR";
        assertEquals(result, oneToTen.isWorkDay(null));
    }

    @Test
    void print_sentences_with_input_sentence() {
        String mySentence = "La vida es bella";
        String result = "Le sonrise sere le mejor erme contre le tristeze" + " " + mySentence;
        assertEquals(result, oneToTen.printSentenceWithInputSentence(mySentence));
    }

    @Test
    void print_sentences_with_null_value() {
        String result = "Le sonrise sere le mejor erme contre le tristeze";
        assertEquals(result, oneToTen.printSentenceWithInputSentence(null));
    }

    @Test
    void print_sentence_without_spaces() {
        String sentence = "La vida es bella";
        String result = "Lavidaesbella";
        assertEquals(result, oneToTen.printSentenceWithoutSpace(sentence));
    }

    @Test
    void print_sentence_without_spaces_with_value_null() {
        assertThrows(NullPointerException.class, () -> {
            oneToTen.printSentenceWithoutSpace(null);
        });
    }

    @Test
    void print_sentence_lenght() {
        Integer resultLenght = 15;
        String sentence = "Camilo Cubillos";
        assertEquals(resultLenght, oneToTen.printLengtSentence(sentence));
    }

    @Test
    void print_sentence_numbers_of_Vowels() {
        HashMap<String, Integer> numbersOfVowels = new HashMap<>();
        numbersOfVowels.put("a", 2);
        numbersOfVowels.put("e", 1);
        numbersOfVowels.put("i", 1);
        numbersOfVowels.put("o", 2);
        numbersOfVowels.put("u", 3);
        String sentence = "Tobias Pacheco uuu";
        numbersOfVowels.put("Tamaño", sentence.length());
        assertEquals(numbersOfVowels, oneToTen.printNumberOfVowels(sentence));
    }

    @Test
    void print_diference_beetwen_two_words_first_bigger_than_second() {
        String firstWord = "Casa";
        String secondWord = "CasaGrande";
        String result = "La diferencias son: Grande";
        assertEquals(result, oneToTen.printDifferencesLetters(firstWord, secondWord));

    }
    @Test
    void print_diference_beetwen_two_words_second_bigger_than_first() {
        String firstWord = "CasaGrande";
        String secondWord = "Casa";
        String result = "La diferencias son: Grande";
        assertEquals(result, oneToTen.printDifferencesLetters(firstWord, secondWord));
    }
}
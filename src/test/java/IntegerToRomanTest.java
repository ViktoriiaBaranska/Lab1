import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.example.IntegerToRoman;

// @author Viktoriia Baranska
// @project lect2JUnit4
// @class  Main
// @version  1.0.0
// @since 12.09.2024 - 00:01

class IntegerToRomanTest {

    @Test
    void testSmallNumbers() {
        IntegerToRoman converter = new IntegerToRoman();
        assertEquals("I", converter.intToRoman(1));  // найменше число
        assertEquals("II", converter.intToRoman(2));
        assertEquals("III", converter.intToRoman(3));
        assertEquals("IV", converter.intToRoman(4));
        assertEquals("V", converter.intToRoman(5));  // перший "V"
        assertEquals("VI", converter.intToRoman(6));
        assertEquals("VII", converter.intToRoman(7));
        assertEquals("VIII", converter.intToRoman(8));
        assertEquals("IX", converter.intToRoman(9));
        assertEquals("X", converter.intToRoman(10)); // перший "X"
    }

    @Test
    void testTeensAndTens() {
        IntegerToRoman converter = new IntegerToRoman();
        assertEquals("XI", converter.intToRoman(11));
        assertEquals("XII", converter.intToRoman(12));
        assertEquals("XIV", converter.intToRoman(14));
        assertEquals("XV", converter.intToRoman(15));
        assertEquals("XIX", converter.intToRoman(19));
        assertEquals("XX", converter.intToRoman(20));
        assertEquals("XXIX", converter.intToRoman(29)); // 29 – складне комбіноване число
        assertEquals("XL", converter.intToRoman(40));
        assertEquals("XLIV", converter.intToRoman(44)); // 44 – цікавий приклад з "IV"
        assertEquals("L", converter.intToRoman(50));  // перший "L"
        assertEquals("XC", converter.intToRoman(90)); // перший "XC"
    }

    @Test
    void testHundreds() {
        IntegerToRoman converter = new IntegerToRoman();
        assertEquals("C", converter.intToRoman(100)); // перший "C"
        assertEquals("CC", converter.intToRoman(200));
        assertEquals("CCC", converter.intToRoman(300));
        assertEquals("CD", converter.intToRoman(400));  // цікаве число з "CD"
        assertEquals("D", converter.intToRoman(500));  // перший "D"
        assertEquals("DC", converter.intToRoman(600));
        assertEquals("DCCC", converter.intToRoman(800));
        assertEquals("CM", converter.intToRoman(900));  // цікаве число з "CM"
        assertEquals("M", converter.intToRoman(1000));  // перший "M"
        assertEquals("MCM", converter.intToRoman(1900)); // складний приклад
    }

    @Test
    void testThousands() {
        IntegerToRoman converter = new IntegerToRoman();
        assertEquals("M", converter.intToRoman(1000)); // найменше тисячне
        assertEquals("MM", converter.intToRoman(2000));
        assertEquals("MMM", converter.intToRoman(3000)); // найбільше у римській системі
    }

    @Test
    void testVariousNumbers() {
        IntegerToRoman converter = new IntegerToRoman();
        assertEquals("XLIX", converter.intToRoman(49));  // 49 - цікава комбінація
        assertEquals("LXXXIX", converter.intToRoman(89));  // 89
        assertEquals("CCXLVI", converter.intToRoman(246)); // складна комбінація
        assertEquals("DCCCXC", converter.intToRoman(890)); // цікавий варіант з "DCCC" і "XC"
        assertEquals("MMCDXXI", converter.intToRoman(2421)); // комбінація тисяч, сотень, десятків і одиниць
        assertEquals("MMMCMXCIX", converter.intToRoman(3999)); // найбільше допустиме римське число
        assertEquals("MMXXIV", converter.intToRoman(2024)); // поточний рік
    }

    @Test
    void testEdgeCases() {
        IntegerToRoman converter = new IntegerToRoman();
        assertEquals("MCDXLIV", converter.intToRoman(1444)); // цікаве комбіноване число
        assertEquals("MCMXCIV", converter.intToRoman(1994)); // популярне число з цікавими символами
        assertEquals("CDXLIV", converter.intToRoman(444));   // ще одна складна комбінація
        assertEquals("CCCLXXIX", converter.intToRoman(379)); // комбінація сотень, десятків і одиниць
    }
}

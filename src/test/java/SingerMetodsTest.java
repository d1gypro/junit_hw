import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;

class SingerMetodsTest {

    private static Collection<Singer> singers = new ArrayList<>();

    @BeforeAll
    static void createSingers() {
        singers.add (new Singer("Ivan", "Skripkin", 21, 50_000, 58));
        singers.add (new Singer("Petr", "Fleytin", 15, 5_000, 244));
        singers.add (new Singer("Yana", "Trambonova", 44, 500_000, 35));
        singers.add (new Singer("Elena", "Kontrobasova", 66, 5_000_000, 4));
        singers.add (new Singer("Ludmila", "Gitara", 45, 2_250_000, 11));
        singers.add (new Singer("Sergey", "Dudkin", 16, 3_000, 199));
        singers.add (new Singer("Vadim", "Royalkin", 68, 150_000, 98));
        singers.add (new Singer("Aleksandr", "Molotov", 70, 1, 499));
        singers.add (new Singer("Yaroslav", "Barabanov", 21, 1_500_000, 16));
    }

    @Test
    void findMostPopularSingerPrice() {

        int actual = 5_000_000;
        int notactual = 2_250_000;
        int expected = SingerMetods.findMostPopularSingerPrice(singers);

        Assertions.assertEquals(expected,actual);
        Assertions.assertNotEquals(expected,notactual);
    }

    @Test
    void findYoungestSingerFamily() {
        String actual = "Fleytin";
        String expected = SingerMetods.findYoungestSingerFamily(singers);

        Assertions.assertEquals(actual, expected);
        Assertions.assertNotNull(actual, expected);
    }

    @Test
    void findTop3SingersFamily() {
        List<String> actual = Arrays.asList("Kontrobasova", "Gitara", "Barabanov");
        List<String> expected = SingerMetods.findTop3SingersFamily(singers);

        Assertions.assertLinesMatch(actual,expected);
    }

    @Test
    void checkClassProperty() {
        Singer singer = new Singer();

        assertThat(singer, Matchers.<Singer>hasProperty("age"));
    }

    @Test
    void checkSizeListTop3() {
        List<String> expected = SingerMetods.findTop3SingersFamily(singers);

        assertThat(expected, hasSize(3));
    }
}
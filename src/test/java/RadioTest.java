import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.Radio;

public class RadioTest {

    @Test
    public void shouldSetStation() {
        Radio rd = new Radio();


        rd.currentStation = 4;

        int expected = 4;
        int actual = rd.currentStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio rd = new Radio();


        rd.currentVolume = 4;

        int expected = 4;
        int actual = rd.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxVolume() {
        Radio rd = new Radio();

        rd.setMaxVolume();


        int expected = 100;
        int actual = rd.currentVolume;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldSetToMinVolume() {
        Radio rd = new Radio();

        rd.setMinVolume();


        int expected = 0;
        int actual = rd.currentVolume;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldNextStation() {
        Radio rd = new Radio();

        rd.currentStation = 2;

        int expected = 3;
        int actual = rd.nextStation();

        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void shouldPrevStation() {
        Radio rd = new Radio();

        rd.currentStation = 2;

        int expected = 1;
        int actual = rd.prevStation();

        Assertions.assertEquals(actual, expected);

    }


    @Test
    public void shouldIncreaseVolume() {
        Radio rd = new Radio();

        rd.currentVolume = 2;

        int expected = 3;
        int actual = rd.increaseVolume();

        Assertions.assertEquals(actual, expected);

    }


    @Test
    public void shouldTurnDownVolume() {
        Radio rd = new Radio();

        rd.currentVolume = 2;

        int expected = 1;
        int actual = rd.turnDownVolume();

        Assertions.assertEquals(actual, expected);

    }
}
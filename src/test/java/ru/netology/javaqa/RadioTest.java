package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetStation() {
        Radio rd = new Radio();


        rd.setCurrentStation(4);

        int expected = 4;
        int actual = rd.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio rd = new Radio();


        rd.setCurrentVolume(4);

        int expected = 4;
        int actual = rd.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxVolume() {
        Radio rd = new Radio();

        rd.setMaxVolume();


        int expected = 100;
        int actual = rd.getCurrentVolume();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldSetToMinVolume() {
        Radio rd = new Radio();

        rd.setMinVolume();


        int expected = 0;
        int actual = rd.getCurrentVolume();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldNextStation() {
        Radio rd = new Radio();

        rd.setCurrentStation(2);
        rd.nextStation();

        int expected = 3;
        int actual = rd.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldPrevStation() {
        Radio rd = new Radio();

        rd.setCurrentStation(2);

        int expected = 1;
        int actual = rd.prevStation();

        Assertions.assertEquals(actual, expected);

    }


    @Test
    public void shouldIncreaseVolume() {
        Radio rd = new Radio();

        rd.setCurrentVolume(2);

        rd.increaseVolume();

        int expected = 3;
        int actual = rd.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void shouldTurnDownVolume() {
        Radio rd = new Radio();

        rd.setCurrentVolume(2);

        int expected = 1;
        int actual = rd.turnDownVolume();

        Assertions.assertEquals(actual, expected);

    }
}
package ru.netology.javaqa;

public class Radio {
    public int currentStation;
    public int currentVolume;

    public void setMaxVolume(){
        currentVolume = 100;
    }

    public void setMinVolume(){
        currentVolume = 0;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int nextStation() {
        if (currentStation > 9) {
            currentStation = 0;
        } else {
            currentStation = currentStation + 1;
        }
        return currentStation;
    }

    public int prevStation() {
        if (currentStation <= 0) {
            currentStation = 9;
        } else {
            currentStation = currentStation - 1;
        }
        return currentStation;
    }


    public int increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
            return currentVolume;

    }

    public int turnDownVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        return currentVolume;
    }



}

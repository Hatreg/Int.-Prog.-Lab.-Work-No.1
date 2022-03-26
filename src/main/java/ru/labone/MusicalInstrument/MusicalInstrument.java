package ru.labone.MusicalInstrument;

import java.util.Random;

public abstract class MusicalInstrument {

    private String name;
    private String color;
    private int volume;
    private String custom;

    abstract public void Sound();

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getVolume() {
        return volume;
    }

    public String getCustom() {
        return custom;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor() {
        String[] randomColor = new String[]{"Зелёный", "Чёрный", "Белый", "Красный"};
        Random random = new Random();
        this.color = randomColor[random.nextInt(randomColor.length)];
        System.out.println("Случайным образом изменен цвет инструмента на: " + this.color);
    }

    public void setVolume(int volume) {

        if (this.volume < volume) {
            System.out.println("Громкость инструмента увеличина.");
        } else {
            System.out.println("Громкость инструмента уменьшена.");
        }

        this.volume = volume;
    }

    public void setCustom(String custom) {
        this.custom = custom;
        System.out.println("На инструмент нанесена наклейка: " + this.custom);
    }

}

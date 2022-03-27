package ru.labone.MusicalInstrument.Percussion;

import ru.labone.MusicalInstrument.Percussion.Percussion;

public final class Plate extends Percussion {

    public Plate(String custom) {
        setName("Тарелка");
        setColor();
        setCustom(custom);
    }

    @Override
    public void Sound(String sound) {
        System.out.println(sound);
    }

    @Override
    public void executeCommand (String command) {
        switch (command) {
            case "play":
                play();
                break;
            case "changeColor":
                changeColor();
                break;
            case "slapUp":
                slapUp();
                break;
        }
    }

    private void play() {
        System.out.println("[Команда]: Сыграть что-нибудь");
        this.Sound("Бац-бац");
    }

    private void changeColor() {
        System.out.println("[Команда]: Перекрасить инструмент в случайный цвет");
        this.setColor();
    }

    private void slapUp() {
        System.out.println("[Команда]: Ударить по тарелке со всей силы");
        System.out.println("Вы услышали короткий звон и с тех пор больше ничего не слышите.");
    }
}

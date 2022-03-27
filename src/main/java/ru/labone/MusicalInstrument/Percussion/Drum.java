package ru.labone.MusicalInstrument.Percussion;

public final class Drum extends Percussion {

    public Drum(String custom) {
        setName("Барабан");
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
        System.out.println("[Команда]: Ударить по барабану со всей силы");
        System.out.println("Прекрасно, идиот. Ты порвал барабан.");
    }
}

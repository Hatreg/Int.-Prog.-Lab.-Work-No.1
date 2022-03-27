package ru.labone.MusicalInstrument.Stringed;

public final class Cello extends Stringed {

    public Cello(String custom) {
        setName("Виолончель");
        setColor();
        setVolume(0);
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
            case "volumeUp":
                volumeUp();
                break;
            case "volumeDown":
                volumeDown();
                break;
            case "changeColor":
                changeColor();
        }
    }

    private void play() {
        System.out.println("[Команда]: Сыграть что-нибудь");
        if (this.getVolume() < 1) {
            this.Sound("Вииии-иии");
        } else {
            this.Sound("ВИИИИ-ИИИ");
        }
    }

    private void volumeUp() {
        System.out.println("[Команда]: Увеличить громкость");
        this.setVolume(2);
    }

    private void volumeDown() {
        System.out.println("[Команда]: Уменьшить громкость");
        this.setVolume(0);
    }

    private void changeColor() {
        System.out.println("[Команда]: Перекрасить инструмент в случайный цвет");
        this.setColor();
    }
}

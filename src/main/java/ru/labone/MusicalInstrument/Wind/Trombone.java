package ru.labone.MusicalInstrument.Wind;

public final class Trombone extends Wind {

    public Trombone(String custom) {
        setName("Тромбон");
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
            case "changeColor":
                changeColor();
        }
    }

    private void play() {
        System.out.println("[Команда]: Сыграть что-нибудь");
        this.Sound("Тууу-ту-ту-ту");
    }

    private void changeColor() {
        System.out.println("[Команда]: Перекрасить инструмент в случайный цвет");
        this.setColor();
    }
}

package ru.labone.MusicalInstrument.Keyboard;

public final class Piano extends Keyboard {

    public Piano(String custom) {
        setName("Пианино");
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
        if (this.getVolume() < 1) {
            this.Sound("тинь-тинь");
        } else {
            this.Sound("ТИНЬ-ТИНЬ");
        }
    }

    private void volumeUp() {
        this.setVolume(2);
    }

    private void volumeDown() {
        this.setVolume(0);
    }

    private void changeColor() {
        this.setColor();
    }
}

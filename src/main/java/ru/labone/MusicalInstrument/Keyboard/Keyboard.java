package ru.labone.MusicalInstrument.Keyboard;

import ru.labone.MusicalInstrument.MusicalInstrument;

public abstract class Keyboard extends MusicalInstrument {

    @Override
    public void Sound() {
        System.out.println("Тыннь-тыннь");
    }

    public abstract void Sound(String sound);

    public abstract void executeCommand(String command);

}

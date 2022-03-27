package ru.labone.MusicalInstrument.Keyboard;

import ru.labone.MusicalInstrument.MusicalInstrument;

public abstract class Keyboard extends MusicalInstrument {

    @Override
    public void Sound() {
    }

    public abstract void Sound(String sound);

    public abstract void executeCommand(String command);

}

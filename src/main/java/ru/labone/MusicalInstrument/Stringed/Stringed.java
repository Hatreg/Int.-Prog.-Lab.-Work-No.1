package ru.labone.MusicalInstrument.Stringed;

import ru.labone.MusicalInstrument.MusicalInstrument;

public abstract class Stringed extends MusicalInstrument {

    @Override
    public void Sound() {
        System.out.println("Трунь-трунь");
    }

    public abstract void Sound(String sound);

    public abstract void executeCommand(String command);
}

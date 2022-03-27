package ru.labone.MusicalInstrument.Percussion;

import ru.labone.MusicalInstrument.MusicalInstrument;

public abstract class Percussion extends MusicalInstrument {

    @Override
    public void Sound() {
        System.out.println("Пам-пам");
    }

    public abstract void Sound(String sound);

    public abstract void executeCommand(String command);
}

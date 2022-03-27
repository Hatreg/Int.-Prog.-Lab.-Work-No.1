package ru.labone.MusicalInstrument.Wind;

import ru.labone.MusicalInstrument.MusicalInstrument;

public abstract class Wind extends MusicalInstrument {

    @Override
    public void Sound() {
        System.out.println("Туу-туу");
    }

    public abstract void Sound(String sound);

    public abstract void executeCommand(String command);
}

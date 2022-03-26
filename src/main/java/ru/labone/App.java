package ru.labone;

import ru.labone.MusicalInstrument.Keyboard.Keyboard;
import ru.labone.MusicalInstrument.Keyboard.Piano;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Keyboard Piano = new Piano("Клуб любителей Ханса Циммера");
        Piano.Sound();
    }
}

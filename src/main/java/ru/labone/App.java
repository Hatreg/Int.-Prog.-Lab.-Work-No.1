package ru.labone;

import ru.labone.MusicalInstrument.Keyboard.*;
import ru.labone.MusicalInstrument.Percussion.*;
import ru.labone.MusicalInstrument.Stringed.*;
import ru.labone.MusicalInstrument.Wind.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Добро пожаловать в первое в мире приложение-ономатопея музыкальных инструментов.\n");
        Keyboard Piano = new Piano("Клуб любителей Ханса Циммера");
        Piano.executeCommand("play");
        System.out.println("\n");

        Keyboard Organ = new Organ("Клуб любителей Гюнтера Роста");
        Organ.executeCommand("play");
        Organ.executeCommand("volumeUp");
        Organ.executeCommand("play");
        System.out.println("\n");

        Keyboard Synt = new Synthesizer("Клуб разбитых синтезаторов");
        Synt.executeCommand("play");
        System.out.println("\n");

        Keyboard Accordion = new Accordion("Клуб аккордионистов");
        Accordion.executeCommand("play");
        System.out.println("\n");

        Keyboard Harmonic = new Harmonic("Играй гармонь");
        Harmonic.executeCommand("volumeUp");
        Harmonic.executeCommand("play");
        System.out.println("\n");

        Percussion Drum = new Drum("Ударная группа");
        Drum.executeCommand("play");
        Drum.executeCommand("changeColor");
        Drum.executeCommand("slapUp");
        System.out.println("\n");

        Percussion Plate = new Plate("Клуб свидетелей НЛО");
        Plate.executeCommand("play");
        Plate.executeCommand("changeColor");
        Plate.executeCommand("slapUp");
        System.out.println("\n");

        Stringed Balalaika = new Balalaika("Gold balalaika");
        Balalaika.executeCommand("play");
        Balalaika.executeCommand("changeColor");
        System.out.println("\n");

        Stringed Cello = new Cello("Gold balalaika");
        Cello.executeCommand("play");
        Cello.executeCommand("changeColor");
        System.out.println("\n");

        Stringed Guitar = new Guitar("Желтый улыбающийся смайлик");
        Guitar.executeCommand("play");
        Guitar.executeCommand("changeColor");
        System.out.println("\n");

        Stringed Harp = new Harp("Я играл у Цезаря");
        Harp.executeCommand("play");
        Harp.executeCommand("changeColor");
        System.out.println("\n");

        Stringed Violin = new Violin("Скрипач");
        Violin.executeCommand("play");
        Violin.executeCommand("changeColor");
        System.out.println("\n");

        Wind Dudka = new Dudka("Мистер дудец");
        Dudka.executeCommand("play");
        Dudka.executeCommand("changeColor");
        System.out.println("\n");

        Wind Flute = new Flute("Клуб флейтистов");
        Flute.executeCommand("play");
        Flute.executeCommand("changeColor");
        System.out.println("\n");

        Wind Pipe = new Pipe("Pipe Piper");
        Pipe.executeCommand("play");
        Pipe.executeCommand("changeColor");
        System.out.println("\n");

        Wind Trombone = new Trombone("Клуб грустных трамбонистов");
        Trombone.executeCommand("play");
        Trombone.executeCommand("changeColor");
        System.out.println("\n");
    }
}

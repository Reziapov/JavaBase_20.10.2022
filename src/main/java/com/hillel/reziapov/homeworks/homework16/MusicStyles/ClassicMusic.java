package com.hillel.reziapov.homeworks.homework16.MusicStyles;

public class ClassicMusic extends MusicStyles {

    public ClassicMusic(String name) {
        super(name);
    }

    @Override
    public void playMusic(MusicStyles musicStyles) {
        System.out.println("Classic Music group: " + getName());
    }
}

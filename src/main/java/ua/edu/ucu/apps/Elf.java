package ua.edu.ucu.apps;

import ua.edu.ucu.apps.strategy.ElfKickStrategy;

public class Elf extends Character{

    public Elf() {
        super(10, 10, new ElfKickStrategy());
    }
}

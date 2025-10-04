package ua.edu.ucu.apps;

import ua.edu.ucu.apps.strategy.HobbitKickStrategy;

public class Hobbit extends Character{
    public Hobbit() {
            super(0, 3, new HobbitKickStrategy());
        }
    
}

package Armys;

import Abstraction.TypeArmy;
import Abstraction.Types;
import Domain.Adapter;
import Domain.Hero;

import java.io.IOException;

public class Dwarves implements TypeArmy {
    private static Dwarves dwarves = null;
    private static String side;
    public static Dwarves getInstance() throws IOException {
        if (dwarves == null) {
            synchronized (Hero.class) {
                if (dwarves == null) {
                    dwarves = new Dwarves();
                    System.out.println("is from dwarves");
                }
            }
        }
        return dwarves;
    }

    @Override
    public Types add(String type) {
        Adapter adapter = new Adapter();
        switch (type){
            case "archer": adapter.add("archer");
            case "rider": adapter.add("rider");
            default: return null;
        }
    }
}
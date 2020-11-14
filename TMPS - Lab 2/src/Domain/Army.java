package Domain;

import Armys.Dwarves;
import Armys.Humans;
import Abstraction.TypeArmy;

import java.io.IOException;
public class Army {

    public static TypeArmy add_army(String army) throws IOException {
        switch (army){
            case "dwarves": return Dwarves.getInstance();
            case "humans": return Humans.getInstance();
            default: return null;
        }
    }
}
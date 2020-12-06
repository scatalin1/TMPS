package Domain;

import Armys.Dwarves;
import Armys.Humans;
import Abstraction.TypeArmy;

import java.io.IOException;
public class Army {
private TypeArmy typeArmy;

    public TypeArmy getTypeArmy() {
        return typeArmy;
    }

    public TypeArmy add_army(String army) throws IOException {
        switch (army){
            case "dwarves":{typeArmy = Dwarves.getInstance(); return Dwarves.getInstance();}
            case "humans": {typeArmy = Humans.getInstance(); return Humans.getInstance();}
            default: return null;
        }
    }
}
import java.io.IOException;
public final class Army {

    public static TypeArmy add_army(String army) throws IOException {
        switch (army){
            case "dwarves": return Dwarves.getInstance();
            case "humans": return Humans.getInstance();
            default: return null;
        }
    }
}
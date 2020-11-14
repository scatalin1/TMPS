package AllTypes;

import Abstraction.AdvancedTypesDwarves;
public class Archer implements AdvancedTypesDwarves {
    public Archer(){
        add_archer();
    }

    @Override
    public void add_archer() {
        System.out.println("is archer");
    }

    @Override
    public void add_rider() {

    }
}

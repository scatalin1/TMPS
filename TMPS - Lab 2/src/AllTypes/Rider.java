package AllTypes;

import Abstraction.AdvancedTypesDwarves;
public class Rider implements AdvancedTypesDwarves {
    public Rider(){
    }

    @Override
    public void add_archer() {

    }

    @Override
    public void add_rider() {
        System.out.println("is rider");
    }
}
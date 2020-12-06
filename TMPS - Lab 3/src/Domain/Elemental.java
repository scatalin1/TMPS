package Domain;

import java.util.ArrayList;
import java.util.List;

public class Elemental {
    private String name;
    private List<Elemental> concrete_elemental;

    public Elemental(String name) {
        this.name = name;
        System.out.println("has elemental " + this.name);
        concrete_elemental = new ArrayList<Elemental>();
    }

    public void add(Elemental e) {
        this.concrete_elemental.add(e);
    }

    public void remove(Elemental e) {
        concrete_elemental.remove(e);
    }

    public String getName() {
        return name;
    }

    public List<Elemental> getSubordinates(){
        return concrete_elemental;
    }

    public Elemental clone(String name){
        Elemental newElemental = new Elemental(name);
        return newElemental;
    }
}

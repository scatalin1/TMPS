

public class Elemental {
    private static String name;

    public Elemental(String name) {
        Elemental.name = name;
    }


    public Elemental clone(String name){
        Elemental newElemental = null;
            newElemental = new Elemental(name);
        return newElemental;
    }
}

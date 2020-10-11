import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Hero hero = new Hero();
        Hero hero1 = new Hero();
        Elemental elemental1 = new Elemental("earth");
        Elemental elemental2 = elemental1.clone("fire");
        hero.add_elemental(elemental1);
        hero.add_elemental(elemental2);
        Army army = new Army();
        army.add_army("dwarves").add("archer");
        hero.setArmy(army);
    }
}

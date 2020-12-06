package Client;

import Domain.*;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        String sides[] = {"defender", "attacker"};
        Hero hero = new Hero("Aragorn");
        hero.setHero(hero);
        Elemental elemental = new Elemental("earth");
        Elemental elemental1 = elemental.clone("aer");
        hero.add_elemental(elemental);
        hero.add_elemental(elemental1);
        Army army1 = new Army();
        army1.add_army("humans").add("knight");
        hero.setArmy(army1);
        Castle castle1 = (Castle) CastleFactory.getCastle("Gondor", sides[0]);
        castle1.create();
        hero.setCastle(castle1);

        System.out.println();

        Hero hero1 = new Hero("Gimli");
        hero1.setHero(hero1);
        Elemental elemental2 = new Elemental("fire");
        elemental2.add(elemental2.clone("lava"));
        elemental2.add(elemental2.clone("scorch"));
        hero1.add_elemental(elemental2);
        Army army2 = new Army();
        army2.add_army("dwarves").add("rider");
        hero1.setArmy(army2);
        Castle castle2 = (Castle) CastleFactory.getCastle("Erebor", sides[1]);
        castle2.create();
        hero1.setCastle(castle2);

        Interpreter interpreter = new Interpreter(hero, hero1);
        System.out.println("Statement: " + hero.getName() + "will win in fight with " + hero1.getName());
        System.out.println("Answer: " + interpreter.will_win());
    }
}

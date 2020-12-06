package Domain;

import Abstraction.PowerCalculator;

import java.util.ArrayList;
import java.util.List;

public class Interpreter {
    private static List<String> heroElementals = new ArrayList<>();
    private static List<String> compareHeroElementals = new ArrayList<>();
    private static String heroType;
    private static String compareHeroType;

    public Interpreter(Hero hero, Hero compare_to) {
        this.heroType = hero.getArmy().getTypeArmy().getType();
        this.compareHeroType = compare_to.getArmy().getTypeArmy().getType();
        for(Elemental elemental : hero.getElementals()){
            heroElementals.add(elemental.getName());
        }
        for(Elemental elemental : compare_to.getElementals()){
            compareHeroElementals.add(elemental.getName());
        }
    }

    private static PowerCalculator getHeroPower(){
        PowerCalculator heroElementalPower = new ElementalCalculator(heroElementals);
        PowerCalculator heroTypePower = new TypeCalculator(heroType);
        return new TerminalCalculator(heroElementalPower,heroTypePower);
    }

    private static PowerCalculator getCompareHeroPower(){
        PowerCalculator compareHeroElementalPower = new ElementalCalculator(compareHeroElementals);
        PowerCalculator compareHeroTypePower = new TypeCalculator(compareHeroType);
        return new TerminalCalculator(compareHeroElementalPower,compareHeroTypePower);
    }

    public static boolean will_win() {
        PowerCalculator heroPower = getHeroPower();
        PowerCalculator compareHeroPower = getCompareHeroPower();

        System.out.println("Hero power: " + heroPower.calculate());
        System.out.println("Compare hero power: " + compareHeroPower.calculate());
        if(heroPower.calculate() >= compareHeroPower.calculate())
            return true;
        else
            return false;
    }
}
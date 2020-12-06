package Domain;

import Abstraction.NewCastle;

import java.util.ArrayList;
import java.util.List;

public class Hero {
    private Hero hero;
    private String name;
    private List<Elemental> elementals = new ArrayList<>();
    private Army army;
    private NewCastle castle;

    public NewCastle getCastle() {
        return castle;
    }

    public void setCastle(NewCastle castle) {
        hero.castle = castle;
    }

    public String getName() {
        return name;
    }

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        hero.hero = hero;
    }

    public List<Elemental> getElementals() {
        return elementals;
    }

    public Army getArmy() {
        return army;
    }

    public void setArmy(Army army) {
        hero.army = army;
    }

    public Hero(String name) {
        this.name = name;
        System.out.println("New hero " + this.name + ":");
    }

    public void add_elemental(Elemental elemental){
        elementals.add(elemental);
    }


}
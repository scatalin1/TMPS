package Domain;

import Abstraction.NewCastle;

public class Hero {
    private static Hero hero;
    private static String name;
    private static Elemental[] elementals = new Elemental[5];
    private static int i = 0;
    private static Army army;
    private static NewCastle castle;

    public static NewCastle getCastle() {
        return castle;
    }

    public static void setCastle(NewCastle castle) {
        Hero.castle = castle;
    }

    public static Hero getHero() {
        return hero;
    }

    public static void setHero(Hero hero) {
        Hero.hero = hero;
    }

    public static Elemental[] getElementals() {
        return elementals;
    }

    public static int getI() {
        return i;
    }

    public static void setI(int i) {
        Hero.i = i;
    }

    public static Army getArmy() {
        return army;
    }

    public static void setArmy(Army army) {
        Hero.army = army;
    }

    public Hero(String name) {
        this.name = name;
        System.out.println("New hero " + this.name + ":");
    }

    public void add_elemental(Elemental elemental){
        elementals[i] = elemental;
        i++;
    }


}
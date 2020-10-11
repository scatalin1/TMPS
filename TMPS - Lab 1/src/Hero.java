

class Hero {
    private static Hero hero;
    private static Elemental[] elementals;
    private static int i = 0;
    private static Army army;

    public static Hero getHero() {
        return hero;
    }

    public static void setHero(Hero hero) {
        Hero.hero = hero;
    }

    public static Elemental[] getElementals() {
        return elementals;
    }

    public static void setElementals(Elemental[] elementals) {
        Hero.elementals = elementals;
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

    public Hero() {
    }

    public void add_elemental(Elemental elemental){
        this.elementals[i] = elemental;
        i++;
    }


}
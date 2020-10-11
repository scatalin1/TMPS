import java.io.IOException;

class Dwarves implements TypeArmy {
    private static Dwarves dwarves = null;
    public static Dwarves getInstance() throws IOException {
        if (dwarves == null) {
            synchronized (Hero.class) {
                if (dwarves == null) {
                    dwarves = new Dwarves();
                }
            }
        }
        return dwarves;
    }

    @Override
    public Types add(String type) {
        switch (type){
            case "archer": return new Archer();
            case "rider": return new Rider();
            default: return null;
        }
    }
}

class Humans implements TypeArmy {
    private static Humans humans = null;

    public static Humans getInstance(){
        if (humans == null) {
            synchronized (Hero.class) {
                if (humans == null) {
                    humans = new Humans();
                }
            }
        }
        return humans;
    }

    @Override
    public Types add(String type){
        switch (type){
            case "knight": return new Knight();
            case "scout": return new Scout();
            default: return null;
        }
    }
}

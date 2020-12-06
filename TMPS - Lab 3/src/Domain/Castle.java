package Domain;

import Abstraction.NewCastle;

public class Castle implements NewCastle {
    private static String castle;
    private static String side;

    public Castle(String castle, String side) {
        this.castle = castle;
        this.side = side;
    }

    @Override
    public void create() {
        System.out.println("is from " + castle + ", that is " + side);
    }
}

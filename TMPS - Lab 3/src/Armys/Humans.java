package Armys;


import Abstraction.TypeArmy;
import AllTypes.Knight;
import AllTypes.Scout;
import Domain.Hero;
import Abstraction.Types;

public class Humans implements TypeArmy {
    private static Humans humans = null;
    private String type;

    public static Humans getInstance(){
        if (humans == null) {
            synchronized (Hero.class) {
                if (humans == null) {
                    humans = new Humans();
                    System.out.println("is from humans");
                }
            }
        }
        return humans;
    }

    public String getType() {
        return type;
    }

    @Override
    public Types add(String type){
        switch (type){
            case "knight": {this.type = "knight"; return new Knight();}
            case "scout": {this.type = "scout"; return new Scout();}
            default: return null;
        }
    }
}
package Domain;

import Abstraction.PowerCalculator;

public class TypeCalculator implements PowerCalculator {

    private String type;

    public TypeCalculator(String type){
        this.type = type;
    }

    @Override
    public int calculate() {

        if (type.equals("archer")){
            return 25;
        }
        else if (type.equals("knight")){
            return 30;
        }
        else if (type.equals("rider")){
            return 20;
        }
        else if (type.equals("scout")){
            return 15;
        }
        else return 0;
    }
}
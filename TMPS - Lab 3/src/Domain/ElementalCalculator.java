package Domain;

import Abstraction.PowerCalculator;

import java.util.List;

public class ElementalCalculator implements PowerCalculator {

    private List<String> elementals;

    public ElementalCalculator(List<String> elementals){
        this.elementals = elementals;
    }

    @Override
    public int calculate() {
        int power = 0;
        for(String element : elementals){
            if(element.equals("earth")){
                power += 6;
            }
            else if(element.equals("water")){
                power += 8;
            }
            else if(element.equals("fire")){
                power += 10;
            }
            else if(element.equals("aer")){
                power += 4;
            }
        }
        return power;
    }
}
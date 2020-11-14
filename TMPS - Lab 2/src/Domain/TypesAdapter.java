package Domain;

import Abstraction.AdvancedTypesDwarves;
import Abstraction.Types;
import AllTypes.Archer;
import AllTypes.Rider;

public class TypesAdapter implements Types {

    AdvancedTypesDwarves advancedTypesDwarves;

    public TypesAdapter(String audioType){

        if(audioType.equalsIgnoreCase("rider") ){
            advancedTypesDwarves = new Rider();

        }else if (audioType.equalsIgnoreCase("archer")){
            advancedTypesDwarves = new Archer();
        }
    }

    @Override
    public void add(String type) {
        if(type.equalsIgnoreCase("rider")){
            advancedTypesDwarves.add_rider();
        }
        else if(type.equalsIgnoreCase("archer")){
            advancedTypesDwarves.add_archer();
        }
    }
}
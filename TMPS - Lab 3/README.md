#Behavioral Design Patterns
###Author: Schiopu Catalin

## Short Theory

For this laboratory work, I have researched the following Behavioral Design Patterns:

   * Chain of Responsibility
   * Command
   * Interpreter
   * Iterator
   * Mediator
   * Observer
   * Strategy

After analyzing each of them I decided to implement Interpreter in my project, because I thought that it will best suit the workflow of my lab. 

## Argument

I used Interpreter pattern for carrying out fights and deciding who won the fight.

## Implementation 

Interpreter is used in Abstraction (PowerCalculator) and Domain (ElementalCalculator, TypeCalculator, TerminalCalculator, Interpreter); 

There is a rule for calculation of power according to:

elementals

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

and type

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

each hero has.
Then the terminal calculation, the calculation of full hero power, goes according to a formula.

    public class TerminalCalculator implements PowerCalculator {
    
        private PowerCalculator elementalPower;
        private PowerCalculator typePower;
    
        public TerminalCalculator(PowerCalculator elementalPower, PowerCalculator typePower) {
            this.elementalPower = elementalPower;
            this.typePower = typePower;
        }
    
        @Override
        public int calculate() {
            return 5 * elementalPower.calculate() + typePower.calculate();
        }
    }    
    
The interpreter, which receive the information about hero and his opponent, calculates power of each hero and then returns will the hero win or lose.

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

##output of an example

    
New hero Aragorn:
has elemental earth
has elemental aer
is from humans
is knight
is from Gondor, that is defender

New hero Gimli:
has elemental fire
has elemental lava
has elemental scorch
is from dwarves
is rider
is from Erebor, that is attacker

Will Aragorn win in fight with Gimli? 
Hero power: 80
Compare hero power: 70
true

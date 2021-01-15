#Structural Design Patterns
###Author: Schiopu Catalin

## Short Theory

For this laboratory work, I have researched the following Structural Design Patterns:

   * Adapter
   * Bridge
   * Composite
   * Decorator
   * Facade
   * Flyweight
   * Proxy

After analyzing each of them I decided to implement the following Structural DP in my project, because I thought that they will best suit the workflow of my lab: 

## Implementation
 * Composite
 
Composite is used in Domain. It is used in Elemental class for the user to be able to create the specified elementals under the Elementals for a hero. So I have an elemental which devides into fire, water, earth and air. Then each of these elementals divide in maximal elements, where fire evolves in lava and scorch.  

    public class Elemental {
        private static String name;
        private List<Elemental> concrete_elemental;
    
        public Elemental(String name) {
            this.name = name;
            System.out.println("has elemental " + this.name);
            concrete_elemental = new ArrayList<Elemental>();
        }
    
        public void add(Elemental e) {
            this.concrete_elemental.add(e);
        }
    
        public void remove(Elemental e) {
            concrete_elemental.remove(e);
        }
    
        public List<Elemental> getSubordinates(){
            return concrete_elemental;
        }
    }
    
 * Flyweight
 
  Flyweight is used in Abstraction. NewCastle, Domain.Castle, Domain.CastleFactory classes are used for creation of the castle for heroes and their specification. A castle can be a defender or an attacker. For example I have a class Castle, which implements an interface of a NewCastle. Afterwards, I am given two parameters, the castle itself and its side. So each time I create a castle, I'm giving it the name, like HumanCastle and the side, for example attacker.
    
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
    
    
    public class CastleFactory {
        private static final HashMap castleMap = new HashMap();
    
        public static NewCastle getCastle(String name, String side){
            Castle castle = new Castle(name, side);
          if(castle == null){
              castle = new Castle(name, side);
              castleMap.put(side, castle);
              System.out.println("is from " + castle + ", that is " + side);
          }
          return castle;
        }
    }  
    
* Adapter

Adapter is used in Abstraction.AdvancedTypesDwarves, AllTypes.Archer, AllTypes.Rider, Armys.Dwarves, Domain.Adapter, Domain.TypesAdapter classes are used for an easier creation and usage of archer/rider types for a hero. So what happens here is that the hero is added to his type of dwarf or human its advanced type of archer or rider, for exampla. 
  
    public class Adapter implements Types{
        TypesAdapter typesAdapter;
        
        @Override
        public void add(String type) {
                typesAdapter = new TypesAdapter(type);
                typesAdapter.add(type);
        }
    }
    
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
    
##output

This is the new output after implementing the Structural DP
    
New hero Aragorn:
has elemental earth
has elemental thunder
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

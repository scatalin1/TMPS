#Creational Design Patterns
###Author: Schiopu Catalin

## Theory

I have researched the Creational Design Patterns:
   * singleton 
   * prototype
   * Factory Method
   * Abstract Factory
   * Builder
   * Object Pooling

## Implementation
 * Singleton 
 1.
 
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
2. 
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
* Prototype
  
        public class Elemental {
      private static String name;
  
      public Elemental(String name) {
          this.name = name;
      }
  
      public static String getName() {
          return name;
      }
  
      public Elemental clone(String name){
          Elemental newElemental = new Elemental(name);
          return newElemental;
      }

* Factory Method and Abstract Factory

        public final class Army {
    
        public static TypeArmy add_army(String army) throws IOException {
            switch (army){
                case "dwarves": return Dwarves.getInstance();
                case "humans": return Humans.getInstance();
                default: return null;
            }
        }
        }
    
.

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
    
.
        
        class Archer implements Types{
          public Archer() {
              System.out.println("archer created");
          }
        }
    
##output
    
 archer created   
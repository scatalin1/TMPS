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
  helps me create the instance of dwarves and humans. which means that they are created only once and I am working with them whenever I need.
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
* Prototype pattern I used for my elementals class. I have created the elemental class which has a method that gives it a name and every time I want to add a new elementa, I just clone the original elemental and I give him a new name.  
  
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
      for example if I want to create a dwarf army, I call type army and I am getting the singleton instances of dwarves that I have previously created and add them to the corresponding dwarf army. and same with the type of soldiers.
      
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

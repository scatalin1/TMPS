package Domain;

import Abstraction.NewCastle;

import java.util.HashMap;

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

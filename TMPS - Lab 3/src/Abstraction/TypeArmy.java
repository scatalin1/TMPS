package Abstraction;

import java.io.IOException;

public interface TypeArmy {
    Types add (String type) throws IOException;
    String getType();
}

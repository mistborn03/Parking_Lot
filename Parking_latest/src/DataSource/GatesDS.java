package DataSource;

import Gates.Gates;
import java.util.HashMap;

public class GatesDS {

    static HashMap<String, Gates> nameToGateMap;

   static {
        nameToGateMap = new HashMap<String, Gates>();
    }


    public HashMap<String, Gates> getNameToGateMap() {
        return nameToGateMap;
    }

    public void setNameToGateMap(HashMap<String, Gates> nameToGateMap) {
        this.nameToGateMap = nameToGateMap;
    }
}



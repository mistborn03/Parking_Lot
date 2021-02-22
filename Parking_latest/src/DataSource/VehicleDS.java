package DataSource;

import java.util.HashMap;
import Vehicle.Vehicle;

public class VehicleDS {

    static HashMap<String,Vehicle> nameToVehicleMap;

    static  {
        nameToVehicleMap = new HashMap<String, Vehicle>();
    }

    public HashMap<String, Vehicle> getNameToVehicleMap() {
        return nameToVehicleMap;
    }

    public void setNameToVehicleMap(HashMap<String, Vehicle> nameToVehicleMap) {
        this.nameToVehicleMap = nameToVehicleMap;
    }
}

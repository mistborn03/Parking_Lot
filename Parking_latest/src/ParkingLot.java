import Gates.Gates;
import Services.Services;
import Vehicle.Vehicle;

public class ParkingLot {

    String name;

    Vehicle [] vehicle;

    Gates [] entry_gates;

    Gates [] exit_gates;


    DataSource.GatesDS entry_gateDS;
    DataSource.GatesDS exit_gateDS;

    DataSource.VehicleDS vehicleDS;

    public ParkingLot(String name, String car, String bike, String bicycle, String entry, String exit , DataSource.GatesDS entry_gateDS,
                      DataSource.GatesDS exit_gateDS,DataSource.VehicleDS vehicleDS) {

        this.name = name;
        this.vehicleDS = vehicleDS;
        this.exit_gateDS = exit_gateDS;
        this.entry_gateDS = entry_gateDS;


        this.vehicle = new Vehicle[3] ;
        vehicle[0] = new Vehicle("Car",Integer.parseInt(car),0);
        vehicleDS.getNameToVehicleMap().put("Car",vehicle[0]);
        vehicle[1] = new Vehicle("Bike",Integer.parseInt(bike),0);
        vehicleDS.getNameToVehicleMap().put("Bike",vehicle[1]);
        vehicle[2] = new Vehicle("Bicycle",Integer.parseInt(bicycle),0);
        vehicleDS.getNameToVehicleMap().put("Bicycle",vehicle[2]);


        this.entry_gates = new Gates[Integer.parseInt(entry)];
        this.exit_gates = new Gates[Integer.parseInt(exit)];



        for(int i=0;i<entry_gates.length;i++) {
            entry_gates[i] = new Gates(Integer.toString(i + 1), 0, 0, 0);
            entry_gateDS.getNameToGateMap().put("Entry Gate " + Integer.toString(i + 1),entry_gates[i]);
        }

        for(int i=0;i<exit_gates.length;i++) {
            exit_gates[i] = new Gates(Integer.toString(i + 1), 0, 0, 0);
            exit_gateDS.getNameToGateMap().put("Exit Gate "+ Integer.toString(i + 1),exit_gates[i]);
        }


    }


    public void add_parking(){



    }


    public void remove_parking(){


    }






}

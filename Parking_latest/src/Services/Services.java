package Services;

import DataSource.GatesDS;
import DataSource.VehicleDS;

public class Services {

    VehicleDS vehicleDS ;
    GatesDS entry_gatesDS ;
    GatesDS exit_gatesDS ;

    public Services(VehicleDS vehicleDS, GatesDS entry_gatesDS,GatesDS exit_gatesDS) {
        this.vehicleDS = vehicleDS;
        this.entry_gatesDS = entry_gatesDS;
        this.exit_gatesDS = exit_gatesDS;
    }


    public boolean isAvailable(String vehicle_type){

        if(vehicleDS.getNameToVehicleMap().get(vehicle_type).getCurr_count() < vehicleDS.getNameToVehicleMap().get(vehicle_type).getMax_count()) {
//            System.out.println("true");
            return true;
        }

        else {
//            System.out.println("false");
            return false;
        }

    }

    public void parking(String vehicle_type,String gate){

        if(isAvailable(vehicle_type)){
            vehicleDS.getNameToVehicleMap().get(vehicle_type).setCurr_count(vehicleDS.getNameToVehicleMap().get(vehicle_type).getCurr_count()+1);

            switch(vehicle_type){

                case "Car" : entry_gatesDS.getNameToGateMap().get(gate).setCarCount(entry_gatesDS.getNameToGateMap().get(gate).getCarCount()+1);
                                break;
                case "Bicycle" :    entry_gatesDS.getNameToGateMap().get(gate).setBicycleCount(entry_gatesDS.getNameToGateMap().get(gate).getBicycleCount()+1);
                                    break;
                case "Bike" : entry_gatesDS.getNameToGateMap().get(gate).setBikeCount(entry_gatesDS.getNameToGateMap().get(gate).getBikeCount()+1);
                                break;
            }

            System.out.println("True");
        }


        else
            System.out.println("False");

    }


    public void unparking(String vehicle_type,String gate){

        if(vehicleDS.getNameToVehicleMap().get(vehicle_type).getCurr_count()==0)
            System.out.println("No vehicle to unpark");

        else{

            vehicleDS.getNameToVehicleMap().get(vehicle_type).setCurr_count(vehicleDS.getNameToVehicleMap().get(vehicle_type).getCurr_count()-1);


            switch(vehicle_type){

                case "Car" : exit_gatesDS.getNameToGateMap().get(gate).setCarCount(exit_gatesDS.getNameToGateMap().get(gate).getCarCount()+1);
                    break;
                case "Bicycle" :    exit_gatesDS.getNameToGateMap().get(gate).setBicycleCount(exit_gatesDS.getNameToGateMap().get(gate).getBicycleCount()+1);
                    break;
                case "Bike" : exit_gatesDS.getNameToGateMap().get(gate).setBikeCount(exit_gatesDS.getNameToGateMap().get(gate).getBikeCount()+1);
                    break;
            }
        }
    }


    public void all_available_slots(){

        int car = vehicleDS.getNameToVehicleMap().get("Car").getMax_count() - vehicleDS.getNameToVehicleMap().get("Car").getCurr_count() ;
        int bike = vehicleDS.getNameToVehicleMap().get("Bike").getMax_count() - vehicleDS.getNameToVehicleMap().get("Bike").getCurr_count() ;
        int bicycle = vehicleDS.getNameToVehicleMap().get("Bicycle").getMax_count() - vehicleDS.getNameToVehicleMap().get("Bicycle").getCurr_count() ;

        System.out.println("Total Available:" + (car+bicycle+bike));
        System.out.println("Car:" + car);
        System.out.println("Bike:"+ bike);
        System.out.println("Bicycle:"+bicycle);

    }

    public void total_in(String entry_gate){

        int car = entry_gatesDS.getNameToGateMap().get(entry_gate).getCarCount();
        int bike = entry_gatesDS.getNameToGateMap().get(entry_gate).getBikeCount();
        int bicycle = entry_gatesDS.getNameToGateMap().get(entry_gate).getBicycleCount();

        System.out.println("Car:" + car);
        System.out.println("Bike:"+ bike);
        System.out.println("Bicycle:"+bicycle);
    }

    public void total_out(String exit_gate){


        int car = exit_gatesDS.getNameToGateMap().get(exit_gate).getCarCount();
        int bike = exit_gatesDS.getNameToGateMap().get(exit_gate).getBikeCount();
        int bicycle = exit_gatesDS.getNameToGateMap().get(exit_gate).getBicycleCount();

        System.out.println("Car:" + car);
        System.out.println("Bike:"+ bike);
        System.out.println("Bicycle:"+bicycle);
    }

}

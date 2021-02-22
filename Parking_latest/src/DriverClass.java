import DataSource.GatesDS;
import DataSource.VehicleDS;
//import DisplayBoard.DisplayBoard;
import Services.Services;
import java.util.Scanner;

public class DriverClass {

    public static void main(String args[]){

        GatesDS entry_gatesDS = new GatesDS();
        GatesDS exit_gatesDS = new GatesDS();
        VehicleDS vehicleDS = new VehicleDS();

        Services sr = new Services(vehicleDS,entry_gatesDS,exit_gatesDS);

//        DisplayBoard db = new DisplayBoard(vehicleDS,entry_gatesDS,exit_gatesDS);

        Scanner sc = new Scanner(System.in);

        String inp = sc.nextLine();

        ParkingLot pk;


        while(!inp.equalsIgnoreCase("quit")){
            String [] i = inp.split(",");
            switch(i[0]){

                case "add_parking_lot" :  pk = new ParkingLot(i[1],i[2],i[3],i[4],i[5],i[6],entry_gatesDS,exit_gatesDS,vehicleDS);
                                          break;

                case "is_available":  if(sr.isAvailable(i[1]))
                                            System.out.println("True");
                                        else
                                            System.out.println("False");
                                        break;

                case "parking" : sr.parking(i[2],i[3]);
                                    break;

                case "unparking" : sr.unparking(i[2],i[3]);
                                    break;

                case "all_available_slots" : sr.all_available_slots();
                                                break;

                case "print_total_in" :  sr.total_in(i[2]);
                                            break;
                case "print_total_out" : sr.total_out(i[2]);
                                            break;
                default : System.out.println("wrong output");

            }

            inp = sc.nextLine();
        }

    }
}




//add_parking_lot , PVR KM , "Car", 10,"bike", 2 , "Bicycle", 3 ,"entry", 4 ,"Exit", 6
//add_parking_lot , PVR KM ,10,2, 3 , 4 , 6
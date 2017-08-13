/**
 * Created by Anthony on 8/6/2017.
 */

import java.util.Scanner;

public class Town {

    public Town(){

        System.out.println("Town being created");

        //13 is temp number
        townLocations = new Location[STAT_LOCATION_COUNT];

        this.CreateLocations();


        System.out.println("Town setting up connections");

        this.SetupConnections();

        System.out.println("Town creation finished");

        this.inputFeed = new Scanner (System.in);

        this.inputFeed.next();
        //use input to figure out where to go next

    }

    public final Location getLocationAtAddress(int _ad){

        return this.townLocations[_ad];

    }

    public final Location getLocationByName (String _ad){

        for (int i = 0; i < STAT_LOCATION_COUNT; ++i){

            if (this.townLocations[i].getName() == _ad){

                return this.townLocations[i];

            }

        }

        //error
        return this.townLocations[0];

    }

    private void CreateLocations(){

        //names for each location
        //should be done from text doc

        ///parent locations
        townLocations[0] = new Location("Your House");
        townLocations[1] = new Location("Town Square");
        townLocations[2] = new Location("Bus Stop");
        townLocations[3] = new Location("Apartment Building");
        townLocations[4] = new Location("Grocery Store");
        townLocations[5] = new Location("Arcade");
        townLocations[6] = new Location("Bar");
        townLocations[7] = new Location("Library");
        townLocations[8] = new Location("museum");

        //locations within town that are not buildings
        townLocations[9] = new Location("Shrine");
        townLocations[10] = new Location("North Park");
        townLocations[11] = new Location("South Park");
        townLocations[12] = new Location("Town Square");
        townLocations[13] = new Location("North Path");
        townLocations[14] = new Location("South Path");

        //TODO: IMPLEMENT CHILD LOCATIONS
        //rooms (Locations within buildings
        //your house
        /*townLocations[15] = new Location("Your Bedroom");
        townLocations[16] = new Location("Your Kitchen");
        townLocations[17] = new Location("Unnamed location");
        townLocations[18] = new Location("Unnamed location");
        townLocations[19] = new Location("Unnamed location");
        townLocations[20] = new Location("Unnamed location");
        townLocations[21] = new Location("Unnamed location");*/

    }

/*
 * creates mutual connections between locations within the town
 * */
    private void SetupConnections(){

       //your house <--> bus stop
       this.townLocations[0].CreateConnection(this.townLocations[2]);
        //your house <--> museum
       this.townLocations[0].CreateConnection(this.townLocations[8]);

       //town square <--> bar
       this.townLocations[1].CreateConnection(this.townLocations[6]);
       //town square <--> north path
       this.townLocations[1].CreateConnection(this.townLocations[13]);
       //town square <--> south path
       this.townLocations[1].CreateConnection(this.townLocations[14]);

       //bus stop <--> apartment building
       this.townLocations[2].CreateConnection(this.townLocations[3]);
       //bus stop <--> arcade
       this.townLocations[2].CreateConnection(this.townLocations[5]);
       //bus stop <--> library
       this.townLocations[2].CreateConnection(this.townLocations[7]);

    }

    /*
    * creates rooms with mutual locations to their parent locations
    * */
    private void SetupInnerLocations(){

        System.out.println("SetupInnerLocations is being called without affect");

    }

    //temp number
    public Location[] townLocations;
   //number of locations in town, including rooms
    private static final int STAT_LOCATION_COUNT = 22;
    //
    private Scanner inputFeed;

}

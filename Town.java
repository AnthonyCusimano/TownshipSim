/**
 * Created by Anthony on 8/6/2017.
 */
public class Town {

    public Town(){

        System.out.println("Town is created");

        //13 is temp number
        townLocations = new Location[25];

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

        //locations within town that are not buildings
        townLocations[8] = new Location("museum");
        townLocations[9] = new Location("Shrine");
        townLocations[10] = new Location("Unnamed nocation");
        townLocations[11] = new Location("Unnamed nocation");
        townLocations[12] = new Location("Unnamed nocation");

        //rooms (Locations within buildings
        townLocations[13] = new Location("Unnamed nocation");
        townLocations[14] = new Location("Unnamed nocation");
        townLocations[15] = new Location("Unnamed nocation");
        townLocations[16] = new Location("Unnamed nocation");
        townLocations[17] = new Location("Unnamed nocation");
        townLocations[18] = new Location("Unnamed nocation");
        townLocations[19] = new Location("Unnamed nocation");
        townLocations[20] = new Location("Unnamed nocation");
        townLocations[21] = new Location("Unnamed nocation");
        townLocations[22] = new Location("Unnamed nocation");
        townLocations[23] = new Location("Unnamed nocation");
        townLocations[24] = new Location("Unnamed nocation");


        this.SetupConnections();

    }

    final Location getLocationAtAddress(int _ad){

        return this.townLocations[_ad];

    }

   private void SetupConnections(){

        System.out.println("TODO: Impliment SetupConnections");

    }

    //temp number
    public Location[] townLocations;

}

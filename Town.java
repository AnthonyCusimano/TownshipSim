/**
 * Created by Anthony on 8/6/2017.
 */
public class Town {

    public Town(){

        System.out.println("Town is created");

        //13 is temp number
        townLocations = new Location[13];

        //names for each location
        //should be done from text doc
        townLocations[0] = new Location("Your House");
        townLocations[1] = new Location("Unnamed nocation");
        townLocations[2] = new Location("Unnamed nocation");
        townLocations[3] = new Location("Unnamed nocation");
        townLocations[4] = new Location("Unnamed nocation");
        townLocations[5] = new Location("Unnamed nocation");
        townLocations[6] = new Location("Unnamed nocation");
        townLocations[7] = new Location("Unnamed nocation");
        townLocations[8] = new Location("Unnamed nocation");
        townLocations[9] = new Location("Unnamed nocation");
        townLocations[10] = new Location("Unnamed nocation");
        townLocations[11] = new Location("Unnamed nocation");
        townLocations[12] = new Location("Unnamed nocation");



    }

    final Location getLocationAtAddress(int _ad){

        return this.townLocations[_ad];

    }

    //temp number
    public Location[] townLocations;

}

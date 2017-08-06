/**
 * Created by Anthony on 8/6/2017.
 */
import java.util.Vector;

public class Location {

    public Location (String _name){

        this.name = _name;

    }

    /******
     *  this method creates a connection between _AL and this Location
     * */
    public void CreateConnection(Location _AL){

        this.connections.add(_AL);
        _AL.connections.add(this);

    }

    /**
     *sets this Location's name to _name
     * */
    void setName(final String _name){

        this.name = _name;

    }

    /**
     * returns this Location's name
     * */
    final String getName(){

        return this.name;

    }

    /*********
     *
     * variables
     *
     */
    public Vector<Location> connections;
    public Vector<Location> Rooms;
    //need a vector for townsfolk at this location



    private String name;

}

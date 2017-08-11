/**
 * Created by Anthony on 8/6/2017.
 */
import java.util.Vector;

public class Location {

    public Location (String _name){

        this.name = _name;
        this.connections = new Vector<Location>(3, 1);
        this.Rooms = new Vector<Location> (1, 1);

        //this.connections.ensureCapacity();

    }

    public Location (String _name, Location _parent){

        this.name = _name;
        this.ParentLocation = _parent;

    }

    /******
     *  this method creates a connection between _AL and this Location
     *  calling this method once will connect both Locations to eachother
     *  not just one to the other
     * */
    public void CreateConnection(Location _AL){

        this.connections.addElement(_AL);
        this.connections.add(_AL);
        _AL.connections.addElement(this);

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
    public Location ParentLocation;
    //need a vector for townsfolk at this location



    private String name;

}

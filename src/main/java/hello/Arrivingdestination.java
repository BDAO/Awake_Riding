package hello;

public class Arrivingdestination {
    //private Date date;
    private final String coordinate;
    private String  destination= "-42.431,35.626";
    private boolean arriving;

    public Arrivingdestination(String coordinate){
        this.coordinate = coordinate;
        this.arriving = Arriving1(coordinate);
    }

    public boolean Arriving1(String coordinate){
        if(destination.equals(this.coordinate)){
            return true;
        }
        return false;
    }

    public boolean getArriving(){
        return this.arriving;
    }

}

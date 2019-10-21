package hello;

import java.util.Date;

public class Arrivingtime {

    private boolean status;
    private Date now = new Date();
    private long arrivingtime;

    public Arrivingtime(long arrivingtime){
        this.arrivingtime = arrivingtime;
        this.status = arrivingstatus(arrivingtime);
    }

    private boolean arrivingstatus(long arrivingtime){
        if(arrivingtime - now.getTime() <= 1000*60*3){
            return true;
        }
        return false;
    }

    public boolean getStatus(){
        return status;
    }

}

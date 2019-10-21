package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class Controller {

    private Date date = new Date();
    private long datetotest = date.getTime();


    @RequestMapping("/geoarriving")
    public Arrivingdestination Geoarriving(@RequestParam(value = "coordinate",defaultValue = "1,1")String coordinate){
        return new Arrivingdestination(coordinate);
    }

    @RequestMapping("/timearriving")
    public Arrivingtime Timearriving(@RequestParam(value = "date",defaultValue= "0")long arrivingtime){
        return new Arrivingtime(datetotest);
    }

}

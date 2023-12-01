import java.text.SimpleDateFormat;
import java.util.Date;

public class Driver {
    public static void main(String[] args) {
        Event genericEvent = new Event("Generic Event", new Date());
        Wedding weddingEvent = new Wedding("Wedding Event", new Date());
        Birthday birthdayEvent = new Birthday("Birthday Event", new Date());

        Event[] events = {genericEvent, weddingEvent, birthdayEvent};

        for (Event event : events){
            event.display();
            System.out.println();
        }
    }
}
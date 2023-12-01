import java.text.SimpleDateFormat;
import java.util.Date;
class Wedding extends Event
{
    public Wedding(String desc, Date date) {
        super(desc, date);

    }
    public void display(){
        super.display();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println("Wedding Event : " + getDesc());


    }

}
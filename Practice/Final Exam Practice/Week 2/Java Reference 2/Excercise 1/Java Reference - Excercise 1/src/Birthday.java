import java.text.SimpleDateFormat;
import java.util.Date;

public class Birthday extends Event
{

    public Birthday(String desc, Date date) {
        super(desc, date);
    }

    @Override
    public void display() {
        super.display();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM dd, yyyy");
        System.out.println("Birthday Event : " + getDesc());
        System.out.println("Date"+ dateFormat.format(getDate()));    }
}
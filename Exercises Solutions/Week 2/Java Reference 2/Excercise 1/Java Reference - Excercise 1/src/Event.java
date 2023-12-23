import java.util.Date;

public class Event{
    private String desc;
    private Date date;

    public Event( String desc, Date date){
        this.date = date;
        this.desc = desc;
    }

    public String getDesc(){
        return desc;
    }

    public Date getDate(){
        return date;
    }

    public void display(){
        System.out.println("Event : " + desc );
        System.out.println("Date : " + date );
    }
}
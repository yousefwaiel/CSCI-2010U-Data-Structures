public class Main {

    int day;
    int month;
    int year;

    public void setDate(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;

    }

    public String tostring()
    {
        return day + "-" + month + "-" + year ;
    }
}

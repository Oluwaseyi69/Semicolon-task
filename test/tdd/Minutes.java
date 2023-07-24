package tdd;

public class Minutes {
    private int minutes;
    private int seconds;
    private int hour;
    private int day;
    private int year;
    public void setMinutes(int minutes) {
        if(minutes > 0) year = minutes / 525600;
        hour = minutes / 60;
        day = minutes/ 1440;

    }
    public int getSeconds(){
        return seconds;
    }

    public int getYear(){
        return year;
    }

    public int getDay() {
        return day;
    }

}

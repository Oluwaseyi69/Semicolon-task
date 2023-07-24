package tdd;

public class DigitalClock {
    private int seconds;
    private int minutes;
    private int hour;

    public void setSeconds(int seconds){
        if (seconds < 60) this.seconds = seconds;
        if (seconds >= 60 && seconds < 3600){
            this.minutes = seconds / 60;
            this.seconds = seconds % 60;
        }
        if (seconds >= 3600) {
            this.hour = seconds;
            this.minutes = seconds / 3600;
            this.seconds = seconds % 3600;
        }
            if (seconds >=3600){
                this.hour = seconds/3600;
                this.seconds= seconds % 3600;
            }
        }


    public int getSeconds(){
        return seconds;
    }
    public int getMinutes(){
        return minutes;
    }
    public int getHour(){return hour; }



}
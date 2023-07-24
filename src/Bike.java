public class Bike {
    private boolean isOn = false;
    private boolean isOff = true;
    private int gear;
    private int speed;

    public boolean getIsOn() {

        return isOn;
    }
    public boolean getIsOff() {
        return isOff;
    }

    public void setIsOn() {
        isOn = true;
    }

    public void accelerate(int gear) {

        if (gear == 1 && speed >= 0 && speed <= 20) speed = speed + 1;
        if (gear == 2 && speed >= 21 && speed <= 30) speed = speed + 2;
        if (gear == 3 && speed >= 31 && speed <= 40) speed = speed + 3;
        if (gear == 4) speed = speed + 4;
        changeGear();
    }
    public void decelerate(int gear) {
        if (gear == 1 && speed >= 0 && speed <= 20) speed = speed - 1;
        if (gear == 2 && speed >= 21 && speed <= 30) speed = speed - 2;
        if (gear == 3 && speed >= 31 && speed <= 40) speed = speed - 3;
        if (gear == 4) speed = speed - 4;
    }

    public void changeGear(){
      if (speed <= 20) gear = 1;
      if (speed >= 21 && speed <= 30) gear = 2;
      if (speed >= 31 && speed <= 40) gear = 3;
      if (speed >= 41) gear = 4;

    }

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getGear() {
        return gear;
    }

   // public int getNewSpeed() {
    //    speed = speed + 2;
    //    return 24;

   // }

}

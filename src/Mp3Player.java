public class Mp3Player {
    private boolean isTurnOn;
    private boolean isNext = false;
    private boolean isPrevious = true;

    private boolean play = true;
    private boolean pause = true;
    private int volume;

    public void setTurnOn(boolean isOn) {
        this.isTurnOn = isOn;
    }

    public boolean getTurnOn() {
        return isTurnOn;
    }

    public boolean getPlay() {
        return play;
    }

    public boolean setPause() {
        return true;
    }


    public void setVolume(int volume) {
        this.volume = volume;

    }

    public void increaseVolume() {
        volume = volume + 1;
    }

    public int getVolume() {
        return volume;
    }

    public void decreaseVolume() {
        volume = volume - 1;
    }


    public boolean getNext() {
        return isNext;
    }

    public void setNext(boolean isNext) {
        this.isNext = isNext;
    }
    public boolean getPrevious(){
        return isPrevious;
    }
    public void  setPrevious(boolean isPrevious){
        this.isPrevious = isPrevious;
    }

}
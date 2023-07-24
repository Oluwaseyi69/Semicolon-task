public class Calculator {
    public int result;
    public boolean isOn;


    public void add (int firstNumber, int secondNumber) {

            result = firstNumber + secondNumber;
    }

    public void power() {
        isOn = !isOn;
    }
    public boolean isOn(){
        return isOn;
    }

    public int getAdd() {
        return result;
    }
}

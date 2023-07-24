package tdd;

public class Car {
    public boolean isOn;
    public String model;
    public String year;
    public double price;
    public void start() {
        isOn =!isOn;
    }

    public boolean isOn() {
        return isOn;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(String year){
        this.year = year;
    }
    public String getYear(){
        return year;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return price;
    }
    public void discount(double discount){
        price = price - ((discount/100) * price);
    }
}

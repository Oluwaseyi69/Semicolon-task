package tdd;

  public class AirConditioner {
      private boolean isOn;
      private String productName;
      private int temperature;

      public boolean isOn() {
          return isOn;
      }

      public boolean setOn(boolean isOn) {
          if (!isOn) {
              isOn = true;
          }
          return true;
      }

      public boolean getIsOn() {
          return false;
      }

  }
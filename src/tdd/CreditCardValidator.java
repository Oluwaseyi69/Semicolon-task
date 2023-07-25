package tdd;

public class CreditCardValidator{
    private String cardNumber;

    public String cardLength;
    public String validityStatus;
    public String cardType;

    public void setValidityStatus(String cardNumber){
        int sum1= 0, sum2 = 0;

        for (int index = cardNumber.length() - 1;  index >= 0 ; index--) {

            if(index % 2 == 0){
                int digit = Integer.parseInt(String.valueOf(cardNumber.charAt(index)));
                int newDigit = digit * 2;
                if((newDigit) >= 10){
                    sum1 += (newDigit % 10) + (newDigit / 10);
                }else {sum1 += newDigit;}

            }
            if(index % 2 != 0){
                int digit = Integer.parseInt(String.valueOf(cardNumber.charAt(index)));
                sum2+=digit;
            }

        }
        int totalOfSums = sum1 + sum2;
        if(totalOfSums % 10 == 0){
            validityStatus = "Valid";
        }
        else {
            validityStatus = "Invalid";
        }

    }
    public void setCardNumber(String cardNumber){
        this.cardNumber = cardNumber;
    }
    public void setCardLength(String cardNumber){
       if (cardNumber.length() >=13 && cardNumber.length() <= 16 ){
           cardLength = String.valueOf(cardNumber.length());
           this.cardLength = cardLength;
       }

       }
    public void setCardType(String cardNumber){
        if (cardNumber.startsWith("4")){
            cardType = "Visa Cards";
        }
        else if (cardNumber.startsWith("5")){
            cardType = "Master Card";
        }
        else if (cardNumber.startsWith("37")){
            cardType = "American Express Cards";
        }
        else if (cardNumber.startsWith("6")){
            cardType = "Discover cards";
        }
        else
            cardType = "Invalid card number";
        {

        }
    }


    public String getCardNumber(){
        return cardNumber;
    }
    public String getCardLength(){
        return cardLength;
    }

    public String getValidityStatus() {
        return validityStatus;
    }
    public String getCardType(){
        return cardType;
    }
}
package entities;

public class CurrencyConverter {
   public double dollarPrice;
   public double dollarsToBuy;

   public double convertMoney() {
      double calc = dollarPrice * dollarsToBuy;
      double percentageOfValue = 6.0 * calc / 100;
      return calc + percentageOfValue;
   }
}

import java.util.HashMap;
import java.util.Map;

public class Converter {

  private Map<String, Double> eurRates;
  private Map<String, Double> plnRates;
  private Map<String, Double> usdRates;

  public Converter() {
    eurRates = new HashMap<>();
    eurRates.put("USD", 2.5);
    eurRates.put("PLN", 3.5);

    plnRates = new HashMap<>();
    plnRates.put("USD", 1.5);
    plnRates.put("EUR", 0.5);

    usdRates = new HashMap<>();
    usdRates.put("EUR", 0.8);
    usdRates.put("PLN", 1.8);
  }

  public double getRate(String sourceCurrencyCode, String targetCurrencyCode) {
    // тут через иф и элс иф пропишем ретёрны типа того:
    if (sourceCurrencyCode.equals("EUR")) {
      return eurRates.get(targetCurrencyCode);
    } else if // и т. д.
  }

  public boolean isValidCurrency(String currencyName) {
    return true;
    // тут надо подумать, но можно просто через contains() проверку сделать
  }
}


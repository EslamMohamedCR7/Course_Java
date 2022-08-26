package math8_2;

public class project {

    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    project(String sy, String na) {
        symbol = sy;
        name = na;
    }

    String getSymbol() {
        return symbol;
    }

    String getName() {
        return name;
    }

    double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    double getCurrentPrice() {
        return currentPrice;
    }
    String setSymbol(String A){
        symbol = A;
        return symbol;
    }
    String setName(String B){
        name = B;
        return name;
    }

    double setPreviousClosingPrice(double C) {
        previousClosingPrice = C ;
        return previousClosingPrice;
    }

    double setCurrentPrice(double D) {
        currentPrice = D;
        return currentPrice;
    }

    double getChangePercent() {
        double ThePercentageChanged = ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
        return ThePercentageChanged;
    }
}

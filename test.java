package math8_2;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
        project c1 = new project("JAVA", "Sun Microsystems");
        c1.setSymbol("JAVA");
        c1.setName("Sun Microsystems");
//        System.out.print("Enter the previousClosingPrice : ");
//        int Q = input.nextInt();
        c1.setPreviousClosingPrice(4.50);
//        System.out.print("Enter the currentPrice : ");
//        int W = input.nextInt();
        c1.setCurrentPrice(4.35);
        System.out.println("the symbol is : " + c1.getSymbol()+ ".\n"
                         + "the name is : " + c1.getName() + ".\n"
                         + "the previousClosingPrice is : " + c1.getPreviousClosingPrice()  + ".\n"
                         + "the currentPrice is : " + c1.getCurrentPrice() + ".\n"
                         + "The Percentage Changed: " + c1.getChangePercent() + "%.\n");
    }

}

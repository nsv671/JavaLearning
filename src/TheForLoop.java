public class TheForLoop {
    public static void main(String[] args){
        for (int i=1; i<=5; i++){
            System.out.println(i);
        }

        for(int rate=2; rate<=5; rate++){
            double interestAmount = calculateInterest(10000.00, rate);
            System.out.println("10,000 at "+rate+"% interest = "+interestAmount);
        }

        for(double rate=7.5; rate<=10.0; rate+=0.25){
            double interestAmount = calculateInterest(100.00, rate);
            System.out.println("$100 at "+rate+"% interest = $"+interestAmount);
        }
    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount*(interestRate/100));
    }
}

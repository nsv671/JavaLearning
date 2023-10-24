public class ThePrimeNumberChallenge {
    public static void main(String[] args){
        System.out.println("0 is "+(isPrimeNumber(0)?"":" NOT")+" a Prime number");
        System.out.println("1 is "+(isPrimeNumber(1)?"":" NOT")+" a Prime number");
        System.out.println("2 is "+(isPrimeNumber(2)?"":" NOT")+" a Prime number");
        System.out.println("19 is "+(isPrimeNumber(19)?"":" NOT")+" a Prime number");
        System.out.println("8 is "+(isPrimeNumber(8)?"":" NOT")+" a Prime number");
        System.out.println("9 is "+(isPrimeNumber(9)?"":" NOT")+" a Prime number");

        int primeNumberCount =0;
        for(int i=100; i<=1000 && primeNumberCount<3; i++){
            if(isPrimeNumber(i)){
                System.out.println(i +" is a Prime Number");
                primeNumberCount++;
            }
        }
    }

    public static boolean isPrimeNumber(int wholeNumber){
        if(wholeNumber<2){
            return false;
        }

        if(wholeNumber==2){
            return true;
        }

        for(int divisor =2; divisor<wholeNumber/2; divisor++){
            if(wholeNumber%divisor==0){
                return false;
            }
        }

        return true;
    }
}

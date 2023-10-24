public class DigitSumChallenge {
    public static void main(String[] args){
       int sum = sumDigits(-789654123);
       System.out.println("sum of digits of the number is "+sum);
    }

    public static int sumDigits(int number){
        if(number<0){
            return -1;
        }
        int sum = 0;
        while(number>0){
            sum+=number%10;
            number/=10;
        }
        return sum;
    }
}

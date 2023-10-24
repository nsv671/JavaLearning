public class Sum3And5 {
    public static void main(String[] args){
        int sum=0, count=0;
        for(int i=1; i<=1000; i++){
            if(i%3==0 && i%5==0){
                sum+=i;
                count++;
                System.out.println("Found a match "+i);
                if(count==5){
                    System.out.println("Sum = "+sum);
                    break;
                }
            }
        }

        //it will stop once it overflow the integer limit
        /*for(int i = 10000; i>0;i+=1000000){
            System.out.println("Number = "+i);
        }*/
    }
}

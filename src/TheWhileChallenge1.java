public class TheWhileChallenge1 {
    public static void main(String[] args){
        int j=5;
        int evenNumberCunt=0, totalNumberCount=0;
        while(j<=20){
            if(isEvenNumber(j)){
                System.out.println("Even Number = "+j);
                evenNumberCunt++;
                if(evenNumberCunt==5){
                    break;
                }
            }
            totalNumberCount++;
            j++;
        }
        System.out.println("Even number count = "+evenNumberCunt);
        System.out.println("Total number count = "+totalNumberCount);
    }

    public static boolean isEvenNumber(int number){
        if(number%2==0){
            return true;
        }else {
            return false;
        }
//        return false;
    }
}

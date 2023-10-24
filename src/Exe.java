public class Exe {

    public  static  void main(String[] args){
        System.out.println(getBucketCount(3.4,2.1,1.5,2));
    }
    public static int getBucketCount (double width, double height, double areaPerBucket, int extraBuckets){

        if(width<=0 || height<=0 || areaPerBucket<=0 || extraBuckets<0){
            return -1;
        }
        System.out.println("area = "+(height*width)+" bucket count = "+Math.ceil((height*width)/areaPerBucket)+" Extra bucket = "+extraBuckets);
        return (int) Math.ceil((height*width)/areaPerBucket)+extraBuckets;
    }
}

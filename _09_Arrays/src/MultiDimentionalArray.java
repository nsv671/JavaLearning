import java.util.Arrays;

public class MultiDimentionalArray {
    public static void main(String[] args) {
        int[][] twoDimentionalArrayDeclarationExample1 = new int[4][5];
        int[] twoDimentionalArrayDeclarationExample2[] = new int[4][5];

        System.out.println(twoDimentionalArrayDeclarationExample1);
        System.out.println(twoDimentionalArrayDeclarationExample1.length);
        System.out.println(Arrays.toString(twoDimentionalArrayDeclarationExample1));
        System.out.println(Arrays.deepToString(twoDimentionalArrayDeclarationExample1));

//        for(int i=0; i<twoDimentionalArrayDeclarationExample1.length; i++){
//            for(int j=0; j<twoDimentionalArrayDeclarationExample1[i].length; j++){
//                twoDimentionalArrayDeclarationExample1[i][j] = (i*10)+(j+1);
//                System.out.print(twoDimentionalArrayDeclarationExample1[i][j]+" ");
//            }
//            System.out.println();
//        }
//        System.out.println(Arrays.deepToString(twoDimentionalArrayDeclarationExample1));

        for(int i=0; i<twoDimentionalArrayDeclarationExample2.length; i++){
            var innerArray = twoDimentionalArrayDeclarationExample2[i];
            for(int j=0; j<innerArray.length; j++){
                twoDimentionalArrayDeclarationExample2[i][j] = (i*10)+(j+1);
            }
        }

        for(var array : twoDimentionalArrayDeclarationExample2){
            for (var element : array){
                System.out.print(element+" ");
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(twoDimentionalArrayDeclarationExample2));
    }
}

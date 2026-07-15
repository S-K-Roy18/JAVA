//    *
//   **
//  ***
// ****


public class P05{
    public static void main(String[] a){
        for(int i=1; i<=4; i++){
            for(int j=1; j<=4; j++){
               if(i+j>4){
                 System.out.print("*");
               }
               else{
                 System.out.print(" ");
               }
            }
            System.out.println();
        }
    }
}
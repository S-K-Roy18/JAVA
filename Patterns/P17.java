// *        *
// **      **
// ***    ***
// ****  ****
// **********
// ****  ****
// ***    ***
// **      **
// *        *



public class P17{
    public static void main(String[] a){
        int n=5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j<=i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int j=1; j<=n; j++){
                if(j<=(n-i)){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for(int i=n-1; i>=1; i--){
            for(int j=1; j<=n; j++){
                if(j<=i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int j=1; j<=n; j++){
                if(j<=(n-i)){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
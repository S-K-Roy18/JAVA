// A
// AB
// ABC
// ABCD
// ABCDE


public class P10{
    public static void main(String[] a){
        for(int i=1; i<=5; i++){
            char ch= 'A';
            for(int j=1; j<=i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
// 1
// 01
// 101
// 0101
// 10101

public class P12{
    public static void main(String[] a){
        int num=1;
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num%2);
                num++;
            }
            System.out.println();
        }
    }
}
//Find the average of array elements.


public class Q03average{
    public static void main(String[] a){
        double arr[]= {1, 2, 3, 4, 5};
        double sum=0;
        double count= 0;
        for(int i=0; i<arr.length; i++){
            sum= sum+arr[i];
            count++;
        }
        double avrg= sum/count;
        System.out.println("Average of the array elements is: "+avrg);
    }
}
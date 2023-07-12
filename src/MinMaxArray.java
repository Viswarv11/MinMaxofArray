import java.util.Scanner;

public class MinMaxArray {
    public static int minMax(int[]array,int size){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            if(array[i]>max){
                max=array[i];
            }
            if(array[i]<min){
                min=array[i];
            }

        }
        return min+max;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=scanner.nextInt();
        int [] array=new int[size];
        System.out.println("Enter the array elements");
        for(int iterator=0;iterator<size;iterator++){
            array[iterator]=scanner.nextInt();
        }
        System.out.println("The sum of Minimum and Maximum :"+minMax(array,size));

    }
}

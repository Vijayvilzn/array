import java.util.Scanner;

public class ArrayMaxMin{
    public static void main(String[] args) {
      int arr[]={85,41,3,72,10};
      int max=arr[0];
      int min=arr[0];
      for(int i=0; i<arr.length; i++){
          if(arr[i]>max){
              max=arr[i];
          }
          if(arr[i]<min){
              min=arr[i];
          }
      }
      System.out.println(max);
      System.out.println(min);
    }
}

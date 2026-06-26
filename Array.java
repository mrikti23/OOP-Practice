import java.util.*;

public class Array {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of element: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i = 0; i<n ; i++){
            array[i] = sc.nextInt() ;
        }
        int largest = array[0];
        for(int i = 0; i<n ; i++){
                if(array[i]>largest){
                    largest = array[i];
                }
            }
         System.out.println("Largest element = " + largest);
        }
        
    }


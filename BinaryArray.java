/**
 * The purpose of this project is to sort a binary array with linear time
 * complexity and constant space complexity; the reason this solution is linear
 * is because it starts with checking the first and last element in the array;
 * working its way to a 'midpoint', it swaps a 1 and 0 so that no number is 
 * missed; since we go through the array only once, time complexity is linear
 * and it is linear in the average case, best case, as well as worst case since
 * going through all the elements is necessary.
 * 
 *
 * 
 * 
 */
package binaryarray;
import java.util.*;
/**
 *
 * @author Can
 */
public class BinaryArray {
    /**
     * 
     * @param arr1: array to be searched 
     */
    public static void sort(int arr1[]){
        int i = 0;                 //start from index 0
        int j = arr1.length - 1;   //start traversal from the last element
        int tmp = 0;               //used for swapping elements
        
        while(i < j){
            if(arr1[i] == 0){    //if 0, 'skip' it(no need to change place)
                i++;
                continue;
            }
            if(arr1[j] == 1){    //if 1, 'skip' it(no need to change place)
                j--;
                continue;
            }
            
            tmp = arr1[i];       //swap current indeces to sort them
            arr1[i] = arr1[j];
            arr1[j] = tmp;
            i++;
            j--;
            
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a[] = {1,0,1,0,0,0,1,0,1,0,0,1}; //initialize array
        System.out.println("Original array:\n"+Arrays.toString(a)); //print array presorted
        sort(a);  //perform sort
        System.out.println("After sorting:\n"+Arrays.toString(a)); //print array

    }
    
}

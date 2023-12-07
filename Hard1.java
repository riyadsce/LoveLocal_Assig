//HArd1 
//Return the max sliding window.

//to import  java libraries
import java.util.*;

public class Hard1 {
    public static void main(String[] args) {
        
        // making an object to take input
        Scanner sc=new Scanner(System.in);
        //to enter the size of array 
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        //making an array
        int[] arr=new int[n];
        //to enter the array elements
        System.out.println("enter the array elements ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        } 
        //to get the value of
        System.out.println("enter k");
        int k=sc.nextInt();

        // to get the answer of max num stored in the new array ans
        int[] ans = findMaxArray(arr, k);

        //prinout the ans array
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]+" ");
        }

        
    }

    public static int[] findMaxArray(int[] arr, int k) {

        //if the array if null or its length is 0
        //then the return array is of size 0
        if (arr == null || arr.length == 0) {
            return new int[0];
        }

        int n = arr.length;

        //makind a new array of size n-k+1 to store the answer
        int[] ans = new int[n - k + 1];

        //curr index
        int idx = 0;

        // Deque to store the elements so that we can remove elements from both ends
        //its more efficient
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < arr.length; i++) {
            // Removing the elements that are not in the curr window
            while (!deque.isEmpty() && deque.peek() < i - k + 1) {
                deque.poll();
            }

            // removing the smaller elements in the curr window 
            // because they are of no use to find max element
            while (!deque.isEmpty() && arr[deque.peekLast()] < arr[i]) {
                deque.pollLast();
            }
            // Adding the current index in the deque
            deque.offer(i);
            //if the window is fully formed adding the maxing element in the result
            if (i >= k - 1) {
                ans[idx++] = arr[deque.peek()];
            }
        }
        //returning our result array
        return ans;
    }
}

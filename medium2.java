//Medium 2 

//Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

//to import  java libraries
import java.util.*;
public class medium2 {
    public static void main(String[] args){

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

        //creating linked hashmap to store elements as key and count their occurence as values
        HashMap<Integer,Integer> countOcc=new HashMap<>();

        //for counting the elements
        for(int i=0;i<arr.length;i++){

            //if the element repeat again then it will increase it occu by 1
            if(countOcc.containsKey(arr[i])){
                countOcc.put(arr[i],countOcc.get(arr[i])+1);
            }
            //otherwise it will store it as a new eelement in Map
            else{
                countOcc.put(arr[i], 1);
            }
        }

        //to loop in Map
        Set<Integer> loopp=countOcc.keySet();

        //creating an Arraylist to stpre answer
        ArrayList<Integer> ans=new ArrayList<>();

        for(int temp:loopp){

            // if the occ of element is more then its size/3 then it will get store in answer
            if(countOcc.get(temp)>n/3){
                ans.add(temp);
            }
        }

        //to print out the answer
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }


    }
    
}

//LinearSearch
/*Algorithm for Linear Search
1. Start 
2. Declare an array and search element as key.
3. Traverse the array until the number is found.
4. If the key element is found, return the index position of the array element
5. If the key element is not found, return -1
Stop.*/
import java.util.Arrays;
class LinearSearch{
    public static void main(String args[])
    {
        int[] arr ={10,20,30,40,50};
        int key = 40;
        int result = LinearSearch(arr,key);
        if (result == -1)
        {
            System.out.println("Element not found ");
        }
        else{
            System.out.println("Element found at index: " + result);
        }
    }
    public static int LinearSearch(int[] arr , int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key )
            {
            return i;
        }
    }
    
           return -1;   
        }
    }
//output: 3

// array  initialization, declaration, availbility, counting frequencies of array elements
package Array;
import java.util.Scanner;
public class userinput 
{
    public static void main(String args[]) 
    {
        System.out.print("Enter the size of the array: ");

        Scanner n = new Scanner(System.in);
        int arr [] = new int[n.nextInt()];
        int i ;
        System.out.print("Enter the elements of the array : ");
        
        for(i=0;i<arr.length;i++)
        {
            arr[i]= n.nextInt();
        }

        for(i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
            if(i<arr.length-1)
            {
                System.out.print(",");
            }
            
        }
        System.out.println();
        System.out.print("Enter the number to be search: ");
        Scanner n1 = new Scanner(System.in);
        int k = n1.nextInt();
        int count=0;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]==k)
            {
                count++;
            }
            
        }
        if(count>0)
        {
            System.out.println("Elment is available");
            System.out.println("Frequency of the Elment " + k + " = " + count);
        }
        else
        {
            System.out.println("Elment is not available");
        }

    }
}



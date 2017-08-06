package array;

/**
 * Created by SATYENDRA_GUPTA on 06-08-2017.
 */
public class FindMinInArray {

    static void min(int arr[]){
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
            if (max < arr[i])
                max = arr[i];


        System.out.println(max);
    }

    public static void main(String args[]){

        int a[]={33,4,5,3, 67, 66, 99, 900, -66, 77, 999};
        min(a);

    }
}

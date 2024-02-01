/*  You are given an integer array nums of size n and a positive integer k.
    Divide the array into one or more arrays of size 3 satisfying the following conditions:
    Each element of nums should be in exactly one array.
    The difference between any two elements in one array is less than or equal to k.
    Return a 2D array containing all the arrays.
    If it is impossible to satisfy the conditions, return an empty array. 
    And if there are multiple answers, return any of them.
 */

import java.util.Arrays;
public class Day1 {
    public static void main(String[] args) {
        int nums[]={1,3,4,8,7,9,3,5,1};
        int k=2;
        int n=nums.length;
        int ans[][]=new int[n/3][3];

        Arrays.sort(nums);

        for(int i=0;i<n-2;i+=3){
            if(Math.abs(nums[i]-nums[i+2])>k)
                System.out.println("Not Possible");
        }
        int indx=0;
        for(int i=0;i<n/3;i++){
            for(int j=0;j<3;j++){
                ans[i][j]=nums[indx++];
            }
        }

        System.out.println("Possible");
    }
}

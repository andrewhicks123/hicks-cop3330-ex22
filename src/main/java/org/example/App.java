/*
 *  UCF COP3330 Fall 2021 Assignment 22 Solution
 *  Copyright 2021 Andrew Hicks
 */

package org.example;
import java.util.*;

import static java.lang.System.exit;

public class App 
{
    public static void main( String[] args )
    {
        Scanner s = new Scanner(System.in);
        int[] nums = new int[3];
        int count = 0;
        int max = 0;
        int dup = 0;
        System.out.print("Enter the first number: ");
        nums[0] = s.nextInt();
        max = nums[0];
        System.out.print("Enter the second number: ");
        nums[1] = s.nextInt();
        System.out.print("Enter the third number: ");
        nums[2] = s.nextInt();
        for(int i = 0; i < nums.length; i++){
            for(int j = i +1; j < nums.length; j++){
                if(nums[i] == nums[j]) {
                    exit(0);
                }
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        System.out.println("The largest number is " + max);
    }

}

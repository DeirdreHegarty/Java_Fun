/********************************
*QUESTION:
*********************************
*The Utopian Tree goes through 2 cycles of growth every year. 
*Each spring, it doubles in height. Each summer, its height increases by 1 meter.
*Laura plants a Utopian Tree sapling with a height of 1 meter at the onset of spring. 
*How tall will her tree be after N growth cycles?
*Input Format
*The first line contains an integer, T, the number of test cases. 
*T subsequent lines each contain an integer, N, denoting the number of cycles for that test case.
*Output Format
*For each test case, print the height of the Utopian Tree after N cycles. 
*Each height must be printed on a new line.
*/


import java.io.*;
import java.util.*;


class Solution
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int test = sc.nextInt();
    int ans=1;
    for(int j=0;j<test;j++)
    {
        ans=1;
        int input=sc.nextInt();
        if(input==0){
            System.out.println(input+ans);
        }
        if(input!=0){
            for(int i=1;i<=input;i++){
                if(i%2!=0){
                    ans=ans*2;
                }
                if(i%2==0){
                    ans=ans+1;
                }
                }
                System.out.println(ans);
            }
        }
    }
}

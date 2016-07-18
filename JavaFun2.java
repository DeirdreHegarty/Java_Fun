/**
* Question:
***********************
*
*Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, awarding points on a scale from 1 to 100 for three categories: *problem clarity, originality, and difficulty.
*
*We define the rating for Alice's challenge to be the triplet A=(a0,a1,a2), and the rating for Bob's challenge to be the triplet B=(b0,b1,b2).
*
*Your task is to find their comparison scores by comparing  a0 with b0,  a1 with b1 , and a2 with b2.
*
*If ai is greater than bi , then Alice is awarded  point.
*If ai is less than bi, then Bob is awarded  point.
*If ai == bi , then neither person receives a point.
*Given  and , can you compare the two challenges and print their respective comparison points?
*
*Input Format:
*
*The first line contains 3 space-separated integers, a0 , a1 , and a2 , describing the respective values in triplet A. 
*The second line contains 3 space-separated integers, b0 , b1, and b2, describing the respective values in triplet B.
*
*
*Output Format:
*
*Print two space-separated integers denoting the respective comparison scores earned by Alice and Bob.
*/



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] a = new int [3];
        int [] b = new int [3];
        int alice =0;
        int bob =0;
        //read in values
        for(int i=0; i<3; i++){
            a[i] = in.nextInt();
        }
        for(int j=0; j<3; j++){
            b[j] = in.nextInt();
        }
        //compare the values for alice against bob's values
        for(int i=0; i<3;i++){
            if(a[i]>b[i]){
                alice++;
            }
            if(a[i]<b[i]){
                bob++;
            }
        }
        System.out.println(alice + " " + bob);
    }
}
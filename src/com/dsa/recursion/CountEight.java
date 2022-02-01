/*
* Count8
* Given a non-negative int n, compute recursively (no loops) the count of the
* occurrences of 8 as a digit, except that an 8 with another 8 immediately to
* its left counts double, so 8818 yields 4. Note that mod (%) by 10 yields the
* rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost
* digit (126 / 10 is 12).
* https://codingbat.com/prob/p192383
* */
package com.dsa.recursion;

public class CountEight {
    public int count8(int n) {
        if(n==0||n==1) return 0;
        if(n==8) return 1;
        if(n%10==8 && (n/10)%10 == 8) return 2+count8(n/10);
        if(n%10==8) return 1+count8(n/10);
        return count8(n/10);
    }
    public static void main(String[] args) {
        CountEight ce = new CountEight();
        int[] test = {8088,8234,123,81238,88788,2348,23884,0,1818188,8818181,1080,188,88888,9898,78,8,818,8818};
        for (int i = 0; i < test.length; i++) {
            System.out.println("count8("+test[i]+") -> "+ce.count8(test[i]));
        }
    }
}

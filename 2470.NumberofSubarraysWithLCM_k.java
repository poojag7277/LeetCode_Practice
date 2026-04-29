// 2470
// Given an integer array nums and an integer k, return the number of subarrays of nums where the least common multiple of the subarray's elements is k.
// A subarray is a contiguous non-empty sequence of elements within an array.
// The least common multiple of an array is the smallest positive integer that is divisible by all the array elements.
// Example 1:

// Input: nums = [3,6,2,7,1], k = 6
// Output: 4
// Explanation: The subarrays of nums where 6 is the least common multiple of all the subarray's elements are:
// - [3,6,2,7,1]
// - [3,6,2,7,1]
// - [3,6,2,7,1]
// - [3,6,2,7,1]
  
class Solution {
    long lcm(long a,long b){
        return a*b/gcd(a,b);
    }

    long gcd(long a, long b){
        while(b!=0){
            long temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }


    public int subarrayLCM(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            long lcm=1;
            for(int j=i;j<nums.length;j++){
                if(k%nums[j]!=0)break;
                lcm=lcm(lcm,nums[j]);//lcm(1,3)
                if(lcm>k)break;
                else if(lcm==k) count++;
            }
        }
        return count;
    }
}

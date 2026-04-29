// Given an input string s, reverse the order of the words.

// A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

// Return a string of the words in reverse order concatenated by a single space.

// Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

 

// Example 1:

// Input: s = "the sky is blue"
// Output: "blue is sky the"
// Example 2:

// Input: s = "  hello world  "
// Output: "world hello"
// Explanation: Your reversed string should not contain leading or trailing spaces.


class Solution {
    public String reverseWords(String s) {
       s=s.trim();
       String []arr=s.split("\s+");
       StringBuilder ans=new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
            ans.append(arr[i]);
            if(i!=0){
                ans.append(" ");
            }
        }
        return ans.toString();
    }
}
//  String[] str=s.trim().split("\\s+");
//         String out="";
//         for(int i=str.length-1;i>0;i--){
//             out+=str[i]+" ";
//         }
//         return out+str[0];

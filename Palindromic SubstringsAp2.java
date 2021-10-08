class Solution {

    public int countSubstrings(String s) {
        if (s.length() == 0) return 0;
        int n = s.length();
        int res = 0;
        char[] c = s.toCharArray();
        for (int i = 0; i < n; i++) {
            res = res + isPalindrome(i, i, c);
            res = res + isPalindrome(i, i + 1, c);
        }
        return res;
    }
    public int isPalindrome(int j, int k, char[] c ){
        int count = 0;
        while(j>=0 && k<c.length && c[j] == c[k]){
            count++;
            j--;
            k++;    
        }
        return count;            
    }
}

class Solution {
    
    public int maxDepth(String s) {
        int p = 0; 
        int ans = 0; 
        for (char ch : s.toCharArray()) {
           
            if (ch == '(') p++;
          
            else if (ch == ')') p--;
            
            ans = Math.max(ans, p);
        }
        return ans; 
    }
}

class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "(1+(2*3)+((8)/4))+1";
        int result = sol.maxDepth(s);
        System.out.println("Max Depth: " + result);
    }
}

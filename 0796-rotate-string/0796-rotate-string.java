class Solution {
    
    public boolean rotateString(String s, String goal) {
       
        if (s.length() != goal.length()) {
          
            return false;
        }
       
        String doubledS = s + s;
       
        return doubledS.contains(goal);
    }
}


public class Main {
    public static void main(String[] args) {
       
        Solution sol = new Solution();

        System.out.println(sol.rotateString("rotation", "tionrota"));
    }
}
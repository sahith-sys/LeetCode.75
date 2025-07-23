class Solution {
    public int maximumGain(String s, int x, int y) {
        if(x>y){
            return solve(s,'a','b',x,y);
        }
        else{
            return solve(s,'b','a',y,x);
        }
    }
    static int solve(String s, char first, char second, int high, int low){
        Stack<Character> stack = new Stack<>();
        int score = 0;
        for(char c:s.toCharArray()){
            if(!stack.isEmpty() && stack.peek()==first && c==second){
                stack.pop();
                score+=high;
            }
            else{
                stack.push(c);
            }
        }
        Stack<Character> stack2 = new Stack<>();
        while(!stack.isEmpty()){
            char curr = stack.pop();
            if(!stack2.isEmpty()&&stack2.peek()==first && curr==second){
                stack2.pop();
                score+=low;
            }
            else{
                stack2.push(curr);
            }
        }
        return score;
    }
}
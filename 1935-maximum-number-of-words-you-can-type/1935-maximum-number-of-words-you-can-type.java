class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        int count = 0;
        for(String str: words){
            boolean valid = true;
            for(int i=0; i<brokenLetters.length(); i++){
                char ch = brokenLetters.charAt(i);
                if(str.indexOf(ch)!=-1){
                    valid = false;
                    break;
                }
            }
            if(valid) count++;
        }
        return count;
    }
}
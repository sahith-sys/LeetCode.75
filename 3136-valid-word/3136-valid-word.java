class Solution {
    public boolean isValid(String word) {
        if(word.length()<3){
            return false;
        }
        String vowels = "AEIOUaeiou";
        boolean vowel = false;
        boolean consonant = false;
        for(char ele:word.toCharArray()){
            if(vowels.indexOf(ele)!=-1){
                vowel = true;
            }
            else if(Character.isLetter(ele)){
                consonant = true;
            }
            if(!Character.isLetterOrDigit(ele)){
                return false;
            }
        }
        if(vowel && consonant){
            return true;
        }
        else{
            return false;
        }
    }
}
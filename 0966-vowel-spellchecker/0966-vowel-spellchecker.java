class Solution {
    public String[] spellchecker(String[] wordlist, String[] queries) {
        int n = queries.length;
        String[] res=  new String[n];
        int index = 0;
        for(int i=0; i<n; i++){
            String hasExact = "-1";
            String cap = "-1";
            for(int j=0; j<wordlist.length; j++){
                if(queries[i].equals(wordlist[j])){
                    hasExact = wordlist[j];
                }
                if(cap.equals("-1") && queries[i].toLowerCase().equals(wordlist[j].toLowerCase())){
                    cap = wordlist[j];
                }
            }
            if(hasExact.equals("-1") && cap.equals("-1")){
                int m = queries[i].length();
                String vowel = "-1";
                for(int k=0; k<wordlist.length; k++){
                    int nk = wordlist[k].length();
                    if(m!=nk){
                        continue;
                    }
                    boolean ok = true;
                    for(int l=0; l<nk; l++){
                        char one = Character.toLowerCase(queries[i].charAt(l));
                        char two = Character.toLowerCase(wordlist[k].charAt(l));
                        if("aeiou".indexOf(one)!=-1 && "aeiou".indexOf(two)!=-1) continue;
                        if(one!=two){
                            ok=false;
                            break;
                        }
                    }
                    if(ok){
                        vowel = wordlist[k];
                        res[index++] = vowel;
                        break;
                    }
                }
                if(vowel.equals("-1")){
                    res[index++] = "";
                }
            }
            else{
                if(!hasExact.equals("-1")){
                    res[index++] = hasExact;
                    System.out.print(hasExact+i+" ");
                }
                else{
                    res[index++] = cap;
                    System.out.print(cap+i+",");
                }
            }
        }
        return res;
    }
}
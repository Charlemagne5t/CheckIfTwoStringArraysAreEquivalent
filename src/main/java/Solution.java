class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int i1 = 0;
        int j1 = 0;
        int i2 = 0;
        int j2 = 0;
        boolean firstHasEnded = false;
        boolean secondHasEnded = false;
        while(true){
            if(word1[i1].charAt(j1) != word2[i2].charAt(j2)){
                return false;
            }
            j1++;
            if(j1 == word1[i1].length()){
                i1++;
                j1 = 0;
            }
            if(i1 == word1.length){
                firstHasEnded = true;
            }

            j2++;
            if(j2 == word2[i2].length()){
                i2++;
                j2 = 0;
            }
            if(i2 == word2.length){
                secondHasEnded = true;
            }
            if(firstHasEnded != secondHasEnded){
                return false;
            }
            if(firstHasEnded && secondHasEnded){
                return true;
            }
        }

    }
}
public class checkStringEquivalent {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2){
        String str1 = String.join("", word1);
        String str2 = String.join("", word2);
        if (str1.equals(str2)) {
            return true;
        }else{
            return false;
        }
            
        }
    public static void main(String[] args) {
        checkStringEquivalent obj = new checkStringEquivalent();
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        System.out.println("the String is equal: " + obj.arrayStringsAreEqual(word1, word2));
        }
        }

    


public class subsetCount {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(subSetCount(s));
        }
    
        public static int subSetCount(String s) {
        return helperCount("", s);
    }

    public static int helperCount(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            return 1;
        }
        return helperCount(processed + unprocessed.charAt(0), unprocessed.substring(1))
                + helperCount(processed, unprocessed.substring(1));
    }

}

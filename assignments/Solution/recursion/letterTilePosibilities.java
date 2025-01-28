import java.util.HashSet;
import java.util.Set;

public class letterTilePosibilities {
    public int numTilePossibilities(String tiles) {
        Set<String> subset = new HashSet<>();
        permutations("", tiles, subset);
        return subset.size() - 1;
    }
    private void permutations(String p, String up, Set<String> subset) {
        subset.add(p);
        for (int i = 0; i < up.length(); i++) {
            String f = up.substring(0, i);
            String s = up.substring(i + 1);
            permutations(p + up.charAt(i), f + s, subset);
        }
    }
public static void main(String[] args) {
    String tiles = "AAB";
    System.out.println( new letterTilePosibilities().numTilePossibilities(tiles));
}
    
}

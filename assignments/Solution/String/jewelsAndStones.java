
public class jewelsAndStones {
    public int numJewelsInStones(String jewels, String stones){
        int count = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (jewels.indexOf(stones.charAt(i)) != -1) {
                count++;
            }
        }
        return count;

    }
    
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        jewelsAndStones obj = new jewelsAndStones();
        System.out.println(obj.numJewelsInStones(jewels, stones));
    }
   
    
}

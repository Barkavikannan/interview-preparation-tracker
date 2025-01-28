import java.util.ArrayList;
import java.util.List;

public class allPathSourceToTarget {
    public List<List<Integer>> allPathsSourceTarget(int[][] g) {
        List<List<Integer>> nm=new ArrayList<List<Integer>>();
        ArrayList<Integer> kk=new ArrayList<>();
        kk.add(0);
        task(g,nm,kk,0);
        return nm;
    }
    void task(int[][] g , List<List<Integer>> kk , ArrayList<Integer> p , int s)
    {
        if(s==g.length-1)
        {
            kk.add(new ArrayList<>(p));
        }
        for(int f:g[s])
        {
            p.add(f);
            task(g,kk,p,f);
            p.remove(p.size()-1);
        }
    }
public static void main(String[] args) {
    int [][] g = {{1,2}, {3}, {3}, {}};
    System.out.println( new allPathSourceToTarget().allPathsSourceTarget(g));
}
    
}

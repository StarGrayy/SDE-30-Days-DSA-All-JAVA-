package Day1;
import java.util.ArrayList;
import java.util.List;

public class PascalTri {
    public static List<List<Integer>> generate(int numRows) {
        List<Integer> a = new ArrayList<Integer>();
        a.add(1);
        List<List<Integer>> out = new ArrayList<>();
        out.add(a);
        for(int i=0;i<numRows-1;i++){
        List<Integer> in = new ArrayList<Integer>();
            List<Integer> c= out.get(i);
            for(int j=0;j<c.size();j++){
                if(j==0) in.add(c.get(j));
                if(j!=0) in.add(c.get(j)+c.get(j-1));
                if(j==c.size()-1) in.add(c.get(j));
            }
            out.add(in);
        }
        return out;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(generate(n));
    }
}

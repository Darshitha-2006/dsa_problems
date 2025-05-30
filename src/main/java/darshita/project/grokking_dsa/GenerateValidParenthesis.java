package darshita.project.grokking_dsa;
import java.util.*;
class ParString{
    String str;
    int openCt;
    int closeCt;
    ParString(String str, int openCt, int closeCt){
        this.str = str;
        this.openCt = openCt;
        this.closeCt = closeCt;
    }

}
public class GenerateValidParenthesis {
    public static List<String> generateValidParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        Queue<ParString> q = new LinkedList<>();
        q.offer(new ParString("",0,0));
        while(!q.isEmpty()){
            ParString p = q.poll();
            if(p.openCt == n && p.closeCt == n){
                ans.add(p.str);
            }
            else{
                if(p.openCt < n){
                    q.offer(new ParString(p.str+"(", p.openCt+1,p.closeCt));
                }
                if(p.closeCt < p.openCt){
                    q.offer(new ParString(p.str+")", p.openCt,p.closeCt+1));
                }

            }
        }
        return ans;
    }
    public static void main(String[] args) {

        List<String> ans = GenerateValidParenthesis.generateValidParenthesis(3);
        System.out.println(ans);
    }
}

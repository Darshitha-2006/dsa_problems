package darshita.project.grokking_dsa;

import java.util.ArrayList;
import java.util.List;

public class expressionEvaluation {
    public static List<Integer> evaluate(String exp) {
        List<Integer> result = new ArrayList<Integer>();
        if(exp.length()==1){
            result.add(1);
        }
        for(int i=0; i<exp.length()-2; i+=2){
            int num1 = (exp.charAt(i)-'0');
            int num2 = (exp.charAt(i+2)-'0');
            switch(exp.charAt(i+1)){
                case '+':
                    result.add(num1+num2);
                    break;
                case '-':
                    result.add(num1-num2);
                    break;
                case '*':
                    result.add(num1*num2);
                    break;
                case '/' :
                    result.add(num1/num2);
                    break;
                default:
                    break;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(evaluate("1+2*3-3+5=9"));
    }
}

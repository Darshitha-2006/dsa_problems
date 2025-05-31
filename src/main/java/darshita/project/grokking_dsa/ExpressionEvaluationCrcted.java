package darshita.project.grokking_dsa;
import java.util.*;
public class ExpressionEvaluationCrcted {
    public static List<Integer> exprEval(String exp) {
        List<Integer> result = new ArrayList<>();
        if(!exp.contains("+") && !exp.contains("-") && !exp.contains("*") && !exp.contains("/") && !exp.contains("%")){
            result.add(Integer.parseInt(exp));
        }
        for(int i=0; i<exp.length(); i++){
            Character c = exp.charAt(i);
            if(!Character.isDigit(exp.charAt(i))){
                List<Integer> leftPart = exprEval(exp.substring(0, i));
                List<Integer> rightPart = exprEval(exp.substring(i+1));
                for(int Part1 : leftPart){
                    for(int Part2 : rightPart){
                        if(c == '+'){
                            result.add(Part1 + Part2);

                        }
                        else if(c == '-'){
                            result.add(Part1 - Part2);

                        }
                        else if(c == '*'){
                            result.add(Part1 * Part2);
                        }
                        else if(c == '/'){
                            result.add(Part1 / Part2);
                        }
                        else if(c == '%'){
                            result.add(Part1 % Part2);
                        }

                    }

                }
            }
        }
        return result;

    }
    public static void main(String[] args) {
        System.out.println(exprEval("5+2*3"));
    }
}

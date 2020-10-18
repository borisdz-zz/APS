import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//public class ExpressionEvaluator {
//
//    public static int evaluateExpression(String expression){
//        Stack<Integer> stek = new Stack<>();
//        char[] izraz = expression.toCharArray();
//        for(int i = 0;i<izraz.length;i++){
//            if(izraz[i]=='+'){
//
//            }else if(izraz[i]=='*'){
//                int last = stek.pop();
//                i++;
//                int nov=0;
//                while(i<izraz.length&&izraz[i]!='+'&&izraz[i]!='*'){
//                    nov*=10;
//                    nov+=izraz[i]-'0';
//                    i++;
//                }
//                i--;
//                stek.push(nov*last);
//            }else{
//                int nov=0;
//                while(i<izraz.length&&izraz[i]!='+'&&izraz[i]!='*'){
//                    nov*=10;
//                    nov+=izraz[i]-'0';
//                    i++;
//                }
//                i--;
//                stek.push(nov);
//            }
//        }
//        int suma=0;
//        while(stek.size()>0){
//            suma+=stek.pop();
//        }
//        return suma;
//    }
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println(evaluateExpression(input.readLine()));
//    }
//}
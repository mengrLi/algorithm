package Assignment2;

import java.util.Stack;


/*括号匹配
1. 判断是否字符串为空
2. 判断是否为偶数个括号
 */
public class BracketMatchTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String s = "([)";
        Stack<Character> sc = new Stack<Character>();
        char[] c = s.toCharArray();
        if (c.length == 0) {
            System.out.println("为空");
        } else {
            if (c.length % 2 == 1) {
                System.out.println("不匹配");
            } else {
                for (int i = 0; i < c.length; i++) {
                    if (c[i] == '(' || c[i] == '[' || c[i] == '{') {
                        sc.push(c[i]);
                    } else if (c[i] == ')') {
                        if (sc.peek() == '(') {
                            sc.pop();
                        }
                    } else if (c[i] == ']') {
                        if (sc.peek() == '[') {
                            sc.pop();
                        }
                    } else if (c[i] == '}') {
                        if (sc.peek() == '{') {
                            sc.pop();
                        }
                    }
                }
                if (sc.empty()) {
                    System.out.println("匹配");
                } else {
                    System.out.println("不匹配");
                }

            }
        }
    }
}





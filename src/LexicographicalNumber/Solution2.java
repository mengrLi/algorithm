package LexicographicalNumber;

import LexicographicalNumber.Solution;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {

    public List<Integer> lexicalOrder(int n) {


        List<Integer> list = new ArrayList<Integer>();
        int cur = 1;
        for (int i = 0; i < n; ++i) {
            list.add(cur);
            if (cur * 10 <= n) {
                cur *= 10;
            } else {
                if (cur >= n)
                    cur /= 10;

                cur++;

                while (cur % 10 == 0)
                    cur /= 10;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        new Solution().run();

    }





}


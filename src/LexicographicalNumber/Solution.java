package LexicographicalNumber;

import java.util.List;
import java.util.ArrayList;

public class Solution {

    public List<Integer> lexicalOrder(int n) {

        int k=0;
        int m=n;
        while (n!=0) {
            k+=1;
            n/=10;
        }
        int sum=(int) Math.pow(11, k);
        int[] num=new int[sum];
        for (int i = 1; i <= m; i++) {
            num[transfer(i, k)]=i;
        }
        List<Integer> list=new ArrayList<Integer>();
        for (int i = 0; i < num.length; i++) {
            if (num[i]!=0) {
                list.add(num[i]);
            }
        }
        return list;
    }

    public int transfer(int n,int k){
        int ans=0;
        int b=1;
        for (int i = 0; i < k; i++) {
            if (n!=0) {
                ans+=(b*(n%10+1));
                b*=11;
                n/=10;
            }else{
                ans*=11;
            }
        }
        return ans;
    }

    public static void main(String[] args)
    {
        new Solution().run();

    }

    void run() {
        List<Integer>  list = lexicalOrder(20);
        for (int i : list) {
            System.out.print(i+",");
        }

    }
}
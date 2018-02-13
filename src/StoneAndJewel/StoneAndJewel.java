package StoneAndJewel;
/*
* */

public class StoneAndJewel {
    public static int numJewelsInStones(String J, String S) {
        int num=0;
        char[] charJ =J.toCharArray();
        char[] charS =S.toCharArray();
        for(char s:charS)
        {
            for(char j:charJ)
            {
                if(s==j)
                {
                    num++;
                }
            }
        }
        return num;
    }
    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA","aAAbbb"));
    }

}

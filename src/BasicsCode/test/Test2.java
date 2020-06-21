package BasicsCode.test;

/**
 * @author bobwu
 * @Title: Test2
 * @ProjectName JavaCodeDemo
 * @date 2020-04-2819:25
 */
public class Test2 {


    public static void main(String[] args) {
        System.out.println(winner(2,3));
    }



    public static char winner(int A, int B) {
        if (B == 0){
            return 'A';
        }
        // write code here
        if (A >= B && A % B == 0) {
            return 'A';
        }
        if (A < B && B % A == 0) {
            return 'B';
        }

        char ans;
        if (A >= B){
            int a = A % B;
            int b = B;
            ans = winner(a,b);
        }else {
            int b = B % A;
            int a = A;
            ans = winner(a,b);
        }
        return ans;
    }
}

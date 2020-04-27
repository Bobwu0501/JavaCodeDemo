package BasicsCode.ForOffer;

/**
 * @author bobwu
 * @Title: JumpFloorII
 * @ProjectName niukecode
 * @date 2020-04-2222:49
 */
public class JumpFloorII {
    public static void main(String[] args) {
        System.out.println(JumpFloorII(3));
        System.out.println(JumpFloorIII(4));
    }

    public static int JumpFloorII(int target) {
        int ans = 1;
        int num = 1;
        while (ans < target) {
            num = 2 * num;
            ans++;
        }
        return num;
    }

    public static int JumpFloorIII(int target) {
        if (target == 1) {
            return 1;
        }
        if (target == 2) {
            return 2;
        }
        if (target > 2) {
            return 2 * JumpFloorIII(target - 1);
        }
        return 0;
    }
}

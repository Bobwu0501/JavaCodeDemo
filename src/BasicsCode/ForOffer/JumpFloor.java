package BasicsCode.ForOffer;

/**
 * @author bobwu
 * @Title: JumpFloor
 * @ProjectName niukecode
 * @date 2020-04-2222:40
 */
public class JumpFloor {

    public static void main(String[] args) {

    }

    public static int JumpFloor(int target) {
        if (target == 1) {
            return 1;
        }
        if (target == 2) {
            return 2;
        }

        if (target > 2) {
            return JumpFloor(target - 1) + JumpFloor(target - 2);
        }
        return 0;
    }

}

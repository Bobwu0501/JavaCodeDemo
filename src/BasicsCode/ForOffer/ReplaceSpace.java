package BasicsCode.ForOffer;

/**
 * 描述：
 *
 * @author wushunyu
 * @date 2020/4/8
 */
public class ReplaceSpace {

    public static String replaceSpace(StringBuffer str) {
        for (int i = 0; i< str.length();i++){
            char ch1 = str.charAt(i);
            if (ch1 == ' '){
                str.replace(i,i+1,"%20");
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("We are happy.");
        System.out.println(replaceSpace(stringBuffer));
    }
}

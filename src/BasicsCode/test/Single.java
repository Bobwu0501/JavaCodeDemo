package BasicsCode.test;


/**
 * @author bobwu
 * @Title: Sington
 * @ProjectName niukecode
 * @date 2020-04-1319:34
 */
public class Single {

    private static Single sington = new Single();


    public static Single getSington(){
        return sington;
    }

    private Single() {

    }
}

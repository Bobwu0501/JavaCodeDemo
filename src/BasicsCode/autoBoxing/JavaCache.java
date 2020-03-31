package BasicsCode.autoBoxing;

/**
 * 描述：
 * 关于缓存池
 *
 * @author wushunyu
 * @date 2020/3/26
 */
public class JavaCache {


    public static void main(String[] args) {
        //new Integer(123) 与 Integer.valueOf(123) 的区别在于：
        //new Integer(123) 每次都会新建一个对象
        //Integer.valueOf(123) 会使用缓存池中的对象，多次调用会取得同一个对象的引用。[当缓存池没有的时候，才回去new一个对象]
        Integer integer = new Integer(123);
        Integer integer2 =  new Integer(123);
        System.out.println(integer == integer2);//false

        Integer integer3 = Integer.valueOf(123);
        System.out.println(integer == integer3);//false
        System.out.println(integer2 == integer3);//false

        Integer integer4 = Integer.valueOf(123);
        System.out.println(integer3 == integer4);//true


    }







}

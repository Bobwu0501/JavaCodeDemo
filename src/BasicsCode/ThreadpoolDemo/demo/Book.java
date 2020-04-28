package BasicsCode.ThreadpoolDemo.demo;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 描述：
 *
 * @author wushunyu
 * @date 2020/4/22
 */
public class Book {

    private static AtomicInteger id = new AtomicInteger(0);//书名生成器

    private String bookName;

    public Book() {
        bookName = "book-" + String.valueOf(id.incrementAndGet());//书名自动生成
    }


    public void copy() {
        System.out.println("start copy: " + bookName);

        try {
            Thread.sleep(100L);//100ms
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("end copy: " + bookName);
    }

    public static void main(String[] args) {
        Book book = new Book();
        book.copy();
        book.copy();
        book.copy();



    }

}

package BasicsCode.socket;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 描述：
 * tcp-socket
 * 客户端
 *
 * @author wushunyu
 * @date 2020/3/26
 */
public class TcpClient {

    public static void main(String[] args) throws Exception {
        //客户端socket
        //创建socket
        Socket socket = new Socket("127.0.0.1", 6666);
        //获取输出流
        OutputStream outputStream = socket.getOutputStream();
        //获取输入流
        InputStream inputStream = socket.getInputStream();
        //将要传递给server的字符串参数转换成byte数组，并将数组写入到输出流中
        outputStream.write(new String("hello world").getBytes());

        int ch = 0;
        byte[] buff = new byte[1024];
        //buff主要是用来读取输入的内容，存成byte数组，ch主要用来获取读取数组的长度
        ch = inputStream.read(buff);
        //将接收流的byte数组转换成字符串，这里是从服务端回发回来的字符串参数的长度

        String content = new String(buff, 0, ch);
        System.out.println(content);
        //关闭输入输出流和socket
        inputStream.close();
        outputStream.close();
        socket.close();


    }
}

package BasicsCode.socket;


import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 描述：
 * 多线程类，用于server端
 *
 * @author wushunyu
 * @date 2020/3/26
 */
public class ServerThread implements Runnable {


    private Socket socket;

    public ServerThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            //获取Socket的输出流,用来向客户端发送数据
            OutputStream outputStream = socket.getOutputStream();

            //获取Socket的输入流,用来接收客户端发送过来的数据
            InputStream inputStream = socket.getInputStream();

            int ch = 0;

            byte[] buff = new byte[1024];
            //buff主要是用来读取输入的内容，存成byte数组，ch主要用来获取读取数组的长度

            ch = inputStream.read(buff);
            //接收留的byte数组转换成字符串，这里获取的内容是客户端发来的字符串参数
            String content = new String(buff, 0, ch);
            System.out.println(content);
            //往输出流里写入获得的字符串的长度，会发给客户端
            outputStream.write(String.valueOf(content.length()).getBytes());
            //关闭输入输出流和socket
            inputStream.close();
            outputStream.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

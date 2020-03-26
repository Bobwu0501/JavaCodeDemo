package BasicsCode.socket;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * 描述：
 * 模拟TCP-socket编程
 * server端
 *
 * @author wushunyu
 * @date 2020/3/26
 */
public class TcpServer {


    public static void main(String[] args) throws Exception {
        //socket流程
        //创建一个serverSocket
        ServerSocket serverSocket = new ServerSocket(6666);
        boolean f = true;
        while (f) {
            //等待客户端连接
            Socket socket  = serverSocket.accept();
            System.out.println("与客户端连接成功！");
            //为每个客户端起一个线程
            new Thread(new ServerThread(socket)).start();
        }
        serverSocket.close();
    }
}

/**
 * 客户端
 * 1 连接服务器socket
 * 2 发送消息
 */
package com.net;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

//客户端
public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = null;
        OutputStream outputStream = null;
        try {
            //1. 要知道服务器的地址,端口号
            InetAddress serverIP = InetAddress.getByName("127.0.0.1");
            int port = 9999;
            //2. 创建一个socket 链接
            socket = new Socket(serverIP,port);
            //3.发送消息 IO  流
            outputStream = socket.getOutputStream();
            outputStream.write("hello world".getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket == null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

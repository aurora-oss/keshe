package com.example.bookstore.utils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
* @Author monster
* @Description This class is mainly provided for testing Java basis techniques such as  I\O、 Thread and TCP\IP。
* @Time 2022-09-25
* */

public class MyException implements Runnable {
    /*自定义异常类
    * */
    private ServerSocket serverSocket;
    private Socket socket;
    int resources = 10;

    public static void main(String[] args) throws Exception {
//        InetAddress ip;
//        try {
//            ip = InetAddress.getLocalHost();
//            String host = ip.getHostName();
//            String port = ip.getHostAddress();
//            System.out.println("本机名："+host + "\n本机ip地址： " + port);
//        } catch (UnknownHostException e) {
//            e.printStackTrace();
//        }
        int[] resources = {1,2,3,7,8,9};
            System.out.println(Findnum(resources,0,resources.length,7));
//        MyException myException = new MyException();
//        myException.start();
    }

    static int Findnum(int[] arr,int start,int end,int target){
        int mid = (start +(end - start)/2);
        if(target ==arr[mid]){
            return mid;
        }
        if(target<arr[mid]){
            return Findnum(arr,start,mid-1,target);
        }
        else{
            return Findnum(arr,mid+1,end,target);
        }
    }

    void start() throws Exception{
        serverSocket = new ServerSocket(45621);
        System.out.println("服务器套接字连接成功：--");
        while (true){
            System.out.println("等待客户连接");
            socket = serverSocket.accept();     //监听客户端连接
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while (true){
                String message = reader.readLine();
                if("exit".equals(message)){
                    System.out.println("客户机推出");
                    break;
                }
                System.out.println("客户机"+message);
            }
            reader.close();
            socket.close();
        }
    }

    public void RedisConnection(){

    }

    public synchronized void run(){
        while (true) {
                if(resources > 0){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + "：————票数："+resources--);
        }
    }

    private static void FileTest() throws Exception {
        /*文件的输入*/
        File file = new File("F:\\test.txt");
        byte[] bytes = "文件输入".getBytes();
        FileOutputStream out = new FileOutputStream(file);
        out.write(bytes, 0, bytes.length);

        /*文件的输出*/
        FileInputStream in = new FileInputStream(file);
        byte[] byt = new byte[1024];
        int len = in.read(byt);
        String message = new String(bytes, 0, len);
        if(file.exists()) {
            file.delete();
            System.out.println("F:\\test.txt已经删除！");
        }else{
            file.createNewFile();
            System.out.println("F:\\test.txt 已经建立" );
        }
    }
}

class MyClient extends JFrame{
    private  PrintWriter writer;
    Socket socket;
    private JTextArea text= new JTextArea();
    private JTextField textField= new JTextField();

    public MyClient(){
        setTitle("My Client");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = getContentPane();
        JScrollPane scrollPane = new JScrollPane(text);
        getContentPane().add(scrollPane,BorderLayout.CENTER);
        container.add(text,"South");
        textField.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event) {
                writer.println(text.getText().trim());
                text.append(textField.getText()+"\n");
                textField.setText("");
            }
        });
    }
    private void connect(){
        text.append("尝试连接：");
        try {
            socket = new Socket("127.0.0.1",45621);
            writer = new PrintWriter(socket.getOutputStream(),true);
            text.append("完成连接");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws Exception {
        MyClient client = new MyClient();
        client.setSize(200,100);
        client.setVisible(true);
        client.connect();
    }
}

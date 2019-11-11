package RMI;

import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Base64;

public class SoundClient {
    public static void main(String[] args) throws Exception {
        File file = new File("rex.mp3");
        FileInputStream fis = new FileInputStream(file);
        BufferedInputStream bis = new BufferedInputStream(fis);
        DatagramSocket socket = new DatagramSocket();
        byte[] contents;
        long fileLength = file.length();
        long current = 0;

        long start = System.nanoTime();
        DatagramPacket dp;
        while (current != fileLength) {
            int size = 1280;
            if (fileLength - current >= size)
                current += size;
            else {
                size = (int) (fileLength - current);
                current = fileLength;
            }
            contents = new byte[size];
            bis.read(contents, 0, size);
            dp = new DatagramPacket(contents, contents.length, InetAddress.getByName("localhost"), 50005);
            socket.send(dp);
            Thread.sleep(100);
        }
    }
}

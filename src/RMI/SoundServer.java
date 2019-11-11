package RMI;

import javax.sound.sampled.*;
import java.io.ByteArrayInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class SoundServer {
    AudioInputStream audioInputStream;
    private static AudioInputStream ais;
    private static AudioFormat format;
    private static boolean status = true;
    static int port = 50005;
    private static int sampleRate = 16000;

    public static void main(String args[]) throws Exception {


        DatagramSocket serverSocket = new DatagramSocket(50005);


        byte[] receiveData = new byte[1280];
        // ( 1280 for 16 000Hz and 3584 for 44 100Hz (use AudioRecord.getMinBufferSize(sampleRate, channelConfig, audioFormat) to get the correct size)

        format = new AudioFormat(sampleRate, 16, 1, true, false);

        while (status) {
            DatagramPacket receivePacket = new DatagramPacket(receiveData,
                    receiveData.length);

            serverSocket.receive(receivePacket);

            ByteArrayInputStream baiss = new ByteArrayInputStream(
                    receivePacket.getData());

            ais = new AudioInputStream(baiss, format, receivePacket.getLength());

            // A thread solve the problem of chunky audio
            new Thread(() -> toSpeaker(receivePacket.getData())).start();
        }
    }

    public static void toSpeaker(byte[] soundbytes) {
        try {

            DataLine.Info dataLineInfo = new DataLine.Info(SourceDataLine.class, format);
            SourceDataLine sourceDataLine = (SourceDataLine) AudioSystem.getLine(dataLineInfo);

            sourceDataLine.open(format);

            FloatControl volumeControl = (FloatControl) sourceDataLine.getControl(FloatControl.Type.MASTER_GAIN);
            volumeControl.setValue(5.0f);

            sourceDataLine.start();
            sourceDataLine.open(format);

            sourceDataLine.start();

            System.out.println("format? :" + sourceDataLine.getFormat());

            sourceDataLine.write(soundbytes, 0, soundbytes.length);
            System.out.println(soundbytes.toString());
            sourceDataLine.drain();
            sourceDataLine.close();
        } catch (Exception e) {
            System.out.println("Not working in speakers...");
            e.printStackTrace();
        }
    }
}

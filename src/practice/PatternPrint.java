package practice;

import javax.net.ssl.HttpsURLConnection;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

public class PatternPrint extends Thread {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new PatternPrint().start();
        }

    }

    @Override
    public void run() {
        try {
            URL u = new URL("https://www.quiz-maker.com/results2511874x81Dd4d62-71");
            HttpsURLConnection con = (HttpsURLConnection) u.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("user-agent", "Mozilla/5.0");
            con.setRequestProperty("content-type", "application/x-www-form-urlencoded; charset=UTF-8");
            con.setRequestProperty("content-length", "128");
            Map<String, String> mp = new HashMap<>();
            mp.put("qp_ipt2511874", "47.11.255.231");
            mp.put("qp_d2511874", "43729.7677692669-43729.7679078778");
            mp.put("qp_fp2511874", "2437330040");
            mp.put("qp_v2511874", "2");
            mp.put("qp_b2511874", "Vote");
            con.setDoOutput(true);
            StringJoiner join = new StringJoiner("&");
            for (Map.Entry<String, String> ent : mp.entrySet()) {
                join.add(URLEncoder.encode(ent.getKey(), StandardCharsets.UTF_8)
                        + "=" + URLEncoder.encode(ent.getValue(), StandardCharsets.UTF_8));
            }
            byte[] out=join.toString().getBytes();
            con.setFixedLengthStreamingMode(out.length);
            con.connect();
            try(OutputStream outs=con.getOutputStream()){
                outs.write(out);
            }
            System.out.println(con.getResponseCode());
            System.out.println(con.getCipherSuite());
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

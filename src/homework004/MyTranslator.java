package homework004;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

/**
 * FileName: Task09
 * Author:   Andriy Vulook
 * Date:     05.02.2023 0:54
 * Description: myTranslator
 */

public class MyTranslator {

    private static final String CLIENT_ID = "FREE_TRIAL_ACCOUNT";
    private static final String CLIENT_SECRET = "PUBLIC_SECRET";
    private static final String ENDPOINT = "https://whatsmate.net/6";

    public static void main(String[] args) throws Exception {

        String fromLang = "uk";
        String toLang = "en";

        System.out.println("Еnter the words to translate: ");
        Scanner s = new Scanner(System.in);
        System.out.print("==> ");
        String text = s.nextLine();

        translate(fromLang, toLang, text);

    }

    public static void translate(String fromLang, String toLang, String text) throws Exception {

        String jsonPayload = new StringBuilder()
                .append("{")
                .append("\"fromLang\":\"")
                .append(fromLang)
                .append("\",")
                .append("\"toLang\":\"")
                .append(toLang)
                .append("\",")
                .append("\"text\":\"")
                .append(text)
                .append("\"")
                .append("}")
                .toString();

        URL url = new URL(ENDPOINT);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setDoOutput(true);
        conn.setRequestMethod("POST");
        conn.setRequestProperty("X-WM-CLIENT-ID", CLIENT_ID);
        conn.setRequestProperty("X-WM-CLIENT-SECRET", CLIENT_SECRET);
        conn.setRequestProperty("Content-Type", "application/json");

        OutputStream os = conn.getOutputStream();
        os.write(jsonPayload.getBytes());
        os.flush();
        os.close();

        int statusCode = conn.getResponseCode();
        System.out.print("ok: " + statusCode + " ");
        System.out.println("---- translated ----" );
        BufferedReader br = new BufferedReader(new InputStreamReader(
                (statusCode == 200) ? conn.getInputStream() : conn.getErrorStream()
        ));
        String output;
        while ((output = br.readLine()) != null) {
            System.out.print("==> ");
            System.out.println(output);
        }
        conn.disconnect();
    }

}

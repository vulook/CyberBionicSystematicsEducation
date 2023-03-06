package homework007;

import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

/**
 * FileName: Task03
 * Author:   Andriy Vulook
 * Date:     19.02.2023 0:59
 * Description: Currency Converter Program
 */

public class Task03 {
    static String url = "https://api.apilayer.com/exchangerates_data/convert?to=to&from=from&amount=amount";

    public static void main(String[] args) throws IOException, InterruptedException {

        String to;
        String from;
        double amount;
        String responseBody;

        System.out.println("The Currency Converter Program is running ...");
        System.out.println("Currency: UAH, USD, AUD, CAD, EUR, GBP, MXN, PLN, BYR, RUB and other ...");
        Scanner s = new Scanner(System.in);
        System.out.print("Which currency You want to Convert?: ");
        from = s.next();
        System.out.print("Choose the currency: ");
        to = s.next();
        System.out.print("Enter amount: ");
        amount = Double.parseDouble(s.next());

        checkInternetConnection();

        responseBody = invoke(modificURL(to, from, amount));

        readJSON(responseBody);

    }

     static void checkInternetConnection() {
        try {
            URL url = new URL("https://api.apilayer.com/");
            URLConnection connection = url.openConnection();
            connection.connect();
            System.out.println("Connection Successful");
        } catch (Exception e) {
            System.out.println("Internet Not Connected");
            System.exit(0);
        }
    }

    static String modificURL(String to, String from, double amount) {
        url = url.replace("to=to", "to=" + to);
        url = url.replace("from=from", "from=" + from);
        url = url.replace("amount=amount", "amount=" + amount);
        return url;
    }

    static String invoke(String url) throws IOException, InterruptedException {
        String responseBody = null;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("apikey", "0Lp3TnzKuhaVLaSdseraZk1RsNuFTMZN")
                .GET()
                .build();

        HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("\nPage response status code: " + response.statusCode());
        responseBody = String.valueOf(response.body());

        return responseBody;
    }

    static void readJSON(String responseBody) {

        responseBody = responseBody.replace("\"", "");
        String[] JSONArray = responseBody.split("[-{}!,;?]\\s*");

        System.out.println("---------------------------------------------------------");
        System.out.println(JSONArray[3]);
        System.out.println(JSONArray[4]);
        System.out.println(JSONArray[5]);
        System.out.println(JSONArray[9]);
        System.out.println(JSONArray[14]);
    }

}
package utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONObject;
import java.util.Iterator;

public class SupabaseAPI {

    private static final String SUPABASE_URL = "https://diaprxkkwimucqgtrtuz.supabase.co";
    private static final String SUPABASE_KEY = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6ImRpYXByeGtrd2ltdWNxZ3RydHV6Iiwicm9sZSI6ImFub24iLCJpYXQiOjE3NDk0ODYwNzMsImV4cCI6MjA2NTA2MjA3M30.y-bsAS2ra9wCub3C56_LM-hGNofmuLHqSBLQ98www3Y";

    public static String getFormattedData(String table, String query) {
        try {
            String endpoint = SUPABASE_URL + "/rest/v1/" + table + query;
            URL url = new URL(endpoint);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("apikey", SUPABASE_KEY);
            con.setRequestProperty("Authorization", "Bearer " + SUPABASE_KEY);
            con.setRequestProperty("Accept", "application/json");

            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            StringBuilder content = new StringBuilder();
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();
            con.disconnect();

            // Parsing JSON array dan tampilkan semua kolom otomatis
            JSONArray arr = new JSONArray(content.toString());
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < arr.length(); i++) {
                JSONObject obj = arr.getJSONObject(i);
                Iterator<String> keys = obj.keys();
                while (keys.hasNext()) {
                    String key = keys.next();
                    result.append(key).append(": ").append(obj.optString(key)).append("\n");
                }
                result.append("\n"); // pemisah antar record
            }

            return result.toString();

        } catch (Exception e) {
            e.printStackTrace();
            return "Terjadi kesalahan: " + e.getMessage();
        }
    }
}


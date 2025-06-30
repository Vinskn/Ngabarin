package utils;

import NgabarinUTS.SQLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import org.json.JSONArray;
import org.json.JSONObject;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class SupabaseAPI {
    private static final String SUPABASE_URL = "https://...";
    private static final String SUPABASE_KEY = "ey...";

    public static void postTableData(String tableName) {
        SQLConnection connect;
        String query = "SELECT * FROM " + tableName;

        try {
            connect = new SQLConnection();
            Statement st = connect.con.createStatement();
            ResultSet res = st.executeQuery(query);

            SupabaseAPI api = new SupabaseAPI();
            boolean isCleared = api.clearDataTable(tableName);
            if (!isCleared) {
                System.out.println("Gagal menghapus data lama dari Supabase.");
                return;
            }

            ResultSetMetaData meta = res.getMetaData();
            int columnCount = meta.getColumnCount();

            while (res.next()) {
                JSONObject json = new JSONObject();
                for (int i = 1; i <= columnCount; i++) {
                    String columnName = meta.getColumnName(i);
                    Object value = res.getObject(i);
                    json.put(columnName, value);
                }

                boolean sent = api.apiPost(tableName, json);
                if (!sent) {
                    System.out.println("Gagal mengirim data: " + json.toString());
                }
            }
            System.out.println("Data berhasil dikirim");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean apiPost(String tableName, JSONObject json) {
        try {
            URL url = new URL(SUPABASE_URL + tableName);
            HttpURLConnection connect = (HttpURLConnection) url.openConnection();
            connect.setRequestMethod("POST");

            connect.setRequestProperty("apikey", SUPABASE_KEY);
            connect.setRequestProperty("Authorization", "Bearer " + SUPABASE_KEY);
            connect.setRequestProperty("Content-Type", "application/json");
            connect.setRequestProperty("Prefer", "return=minimal");
            connect.setDoOutput(true);

            try (OutputStream os = connect.getOutputStream()) {
                byte[] input = json.toString().getBytes("utf-8");
                os.write(input, 0, input.length);
            }

            int code = connect.getResponseCode();
            return (code == 201 || code == 204);

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private boolean clearDataTable(String table_name) {
        try {
            URL url = new URL(SUPABASE_URL + table_name + "?id=gt.0");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("DELETE");

            conn.setRequestProperty("apikey", SUPABASE_KEY);
            conn.setRequestProperty("Authorization", "Bearer " + SUPABASE_KEY);
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("Prefer", "return=representation");

            int code = conn.getResponseCode();
            return (code == 200 || code == 204);

        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
}

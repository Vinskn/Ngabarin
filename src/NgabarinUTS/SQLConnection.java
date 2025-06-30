package NgabarinUTS;
import java.sql.Connection;
import java.sql.DriverManager;

public class SQLConnection {
    public Connection con;

    public SQLConnection() {
        String id = "root";
        String pass = "";
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/ngabarin?useSSL=false&serverTimezone=UTC";

        try {
            Class.forName(driver).newInstance();
            con = DriverManager.getConnection(url, id, pass);

            if (con != null) {
                System.out.println("✅ Koneksi berhasil");
            } else {
                System.out.println("❌ Koneksi gagal");
            }

        } catch (Exception e) {
            System.out.println("❌ ERROR koneksi: " + e.getMessage());
            con = null;
        }
    }

    // ⬇️ Tambahkan ini di bagian bawah
    public static void main(String[] args){
        SQLConnection k = new SQLConnection();
        if (k.con == null) {
            System.out.println("❌ Masih gagal koneksi. Cek pengaturan.");
        } else {
            System.out.println("✅ Tes koneksi berhasil.");
        }
    }
}


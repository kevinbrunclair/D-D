package singleton;

import java.sql.*;

public class Dbaccess {

    private final String DB_URL = "jdbc:mysql://localhost:3306/herodb";
    private final String USER = "root";
    private final String PASS = "";
    private Connection connection;
    private Statement statement;
    private static Dbaccess instance = null;

    public static Dbaccess getInstance() {
        if (instance == null) {
            instance = new Dbaccess();
        }
        return instance;
    }

    private Dbaccess() {
        try {
            connection = DriverManager.getConnection(DB_URL, USER, PASS); // Open a connection
            statement = connection.createStatement(); // Execute a query
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void getHeros() {
        try {
            String query = "SELECT * FROM hero";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                System.out.print("ID: " + rs.getInt("id"));
                System.out.print(", Type: " + rs.getString("type"));
                System.out.print(", Nom: " + rs.getString("nom"));
                System.out.print(", NiveauVie: " + rs.getInt("niveauvie"));
                System.out.print(", NiveauForce: " + rs.getInt("niveauforce"));
                System.out.print(", ArmeEtOuSort: " + rs.getString("armeetousort"));
                System.out.println(", Bouclier: " + rs.getString("bouclier"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void createHero(String type, String nom, int niveauvie, int niveauforce, String armeetousort, String bouclier) {
        try {
            String query = "INSERT INTO hero (type, nom, niveauvie, niveauforce, armeetousort, bouclier) VALUES ('" + type + "', '" + nom + "', '" + niveauvie + "', '" + niveauforce + "', '" + armeetousort + "', '" + bouclier + "')";
            statement.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }

    public void selectHero(int id) {
        try {
            String sql = "SELECT * FROM hero WHERE id= " + id;
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {
                System.out.print("ID: " + rs.getInt("id"));
                System.out.print(", Type: " + rs.getString("type"));
                System.out.print(", Nom: " + rs.getString("nom"));
                System.out.print(", NiveauVie: " + rs.getInt("niveauvie"));
                System.out.print(", NiveauForce: " + rs.getInt("niveauforce"));
                System.out.print(", ArmeEtOuSort: " + rs.getString("armeetousort"));
                System.out.println(", Bouclier: " + rs.getString("bouclier"));
            }

        } catch (SQLException e) {
            e.printStackTrace();

        }
    }

    public void changeLifePoints() {
        try {
            String query = "";
            statement.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}

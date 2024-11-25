package src.ketaloca.repositories;

import src.ketaloca.DatabaseConnection;
import src.ketaloca.models.Alojamiento;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.sql.Connection;

public class AlojamientosRepository {

    public static ArrayList<Alojamiento> getAll() throws SQLException {
        String query = "Select * FROM alojamientos";
        Connection connection = DatabaseConnection.getConnection();
        PreparedStatement stmt = connection.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();

        ArrayList<Alojamiento> alojamientos = new ArrayList<>();

        while (rs.next()) {
            Alojamiento alojamiento = new Alojamiento(
                    rs.getString("id"),
                    rs.getString("userEmail"),
                    rs.getString("descripcion"),
                    rs.getString("nombre"),
                    (ArrayList<String>) rs.getArray("imgURL"),
                    rs.getBoolean("animales"),
                    (Map<String, Double>) rs.getArray("ubicacion"));

            alojamientos.add(alojamiento);
        }

        return alojamientos;
    }

    public static ArrayList<Alojamiento> getByEmail(String email) {
        return null;
    }

    public static Alojamiento getById(String id) {
        return null;
    }

    public static void create(Alojamiento alojamiento) {
        CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(500);
                return "Exitoso";
            } catch (Exception e) {
                e.printStackTrace();
                return "Error";
            }
        }).thenAccept(System.out::println);
    }

    public static void delete(String id) {
    }
}

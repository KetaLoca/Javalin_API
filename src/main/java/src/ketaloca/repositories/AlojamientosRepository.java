package src.ketaloca.repositories;

import src.ketaloca.models.Alojamiento;

import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;

public class AlojamientosRepository {

    public static ArrayList<Alojamiento> getAll() {
        return null;
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

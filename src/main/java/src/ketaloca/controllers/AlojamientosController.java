package src.ketaloca.controllers;

import io.javalin.http.Context;
import src.ketaloca.models.Alojamiento;
import src.ketaloca.repositories.AlojamientosRepository;

import java.util.ArrayList;
import java.util.Map;

public class AlojamientosController {

    public static void getAlojamientos(Context ctx) {
        String email = ctx.queryParam("userEmail");
        if (email == null || email.isEmpty()) {
            ArrayList<Alojamiento> alojamientos = AlojamientosRepository.getAll();
            if (alojamientos != null) {
                ctx.status(200).json(alojamientos);
                return;
            }
            ctx.status(404).json(Map.of("message", "Not found"));
            return;
        }

        ArrayList<Alojamiento> alojamientos = AlojamientosRepository.getByEmail(email);
        if (alojamientos != null) {
            ctx.status(200).json(alojamientos);
            return;
        }
        ctx.status(404).json(Map.of("message", "Not found"));
    }

    public static void getAlojamientoById(Context ctx) {
        String id = ctx.pathParam("id");
        Alojamiento alojamiento = AlojamientosRepository.getById(id);
        if (alojamiento != null) {
            ctx.status(200).json(alojamiento);
            return;
        }
        ctx.status(404).json(Map.of("message", "Not found"));
    }

    public static void create(Context ctx) {
    }

    public static void delete(Context ctx) {
    }
}

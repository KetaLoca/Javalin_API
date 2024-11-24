package src.ketaloca.routes;

import io.javalin.apibuilder.ApiBuilder;
import src.ketaloca.controllers.AlojamientosController;

public class AlojamientosRouter {
    public static void routes() {
        ApiBuilder.path("/alojamientos", () -> {

            ApiBuilder.get(AlojamientosController::getAlojamientos);

            ApiBuilder.get("/{id}", AlojamientosController::getAlojamientoById);

            ApiBuilder.post(AlojamientosController::create);

            ApiBuilder.delete("/{id}", AlojamientosController::delete);
        });
    }
}

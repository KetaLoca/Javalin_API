package src.ketaloca.routes;

import io.javalin.apibuilder.ApiBuilder;
import src.ketaloca.controllers.ReservasController;

public class ReservasRouter {
    public static void routes() {
        ApiBuilder.path("/reservas", () -> {

            ApiBuilder.get("/{id}", ReservasController::getById);

            ApiBuilder.get(ReservasController::getAll);

            ApiBuilder.post(ReservasController::create);

            ApiBuilder.delete("/{id}", ReservasController::delete);
        });
    }
}

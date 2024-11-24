package src.ketaloca.routes;

import io.javalin.apibuilder.ApiBuilder;
import src.ketaloca.controllers.UsersController;

public class UsersRouter {
    public static void routes() {
        ApiBuilder.path("/users", () -> {

            ApiBuilder.get(UsersController::getById);

            ApiBuilder.post("/register", UsersController::register);

            ApiBuilder.post("/login", UsersController::login);

            ApiBuilder.post("/logout", UsersController::logout);

            ApiBuilder.patch("/{id}", UsersController::update);

            ApiBuilder.delete("/{id}", UsersController::delete);
        });
    }
}

package src.ketaloca;

import io.javalin.Javalin;

import java.util.Map;

import src.ketaloca.routes.UsersRouter;
import src.ketaloca.routes.AlojamientosRouter;
import src.ketaloca.routes.ReservasRouter;

public class App {
    public static void main(String[] args) {
        try {
            Javalin app = Javalin.create().start(4000);

            app.get("/", ctx -> ctx.json(
                    Map.of(
                            "english", "Hello world!",
                            "español", "Hola mundo!")
            ));

            app.routes(() -> {
                UsersRouter.routes();
                AlojamientosRouter.routes();
                ReservasRouter.routes();
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

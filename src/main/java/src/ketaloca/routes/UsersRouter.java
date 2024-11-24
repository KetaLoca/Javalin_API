package src.ketaloca.routes;

import io.javalin.apibuilder.ApiBuilder;

import java.util.Map;

public class UsersRouter {
    public static void routes() {
        ApiBuilder.path("/users", () -> {
            ApiBuilder.get(ctx -> {
                ctx.status(200).json(Map.of("message", "Probando enrutador"));
            });
        });
    }
}

package src.ketaloca;

import io.javalin.Javalin;

import java.util.Map;

public class App {
    public static void main(String[] args) {
        Javalin app = Javalin.create().start(4000);
        app.get("/", ctx -> ctx.json(
                Map.of(
                        "message", "Hello world!",
                        "message2", "Hola mundo!")
        ));
    }
}

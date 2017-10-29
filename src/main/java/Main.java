

import static spark.Spark.*;

public class Main {

  public static void main(String[] args) {

    port(Integer.valueOf(System.getenv("PORT")));
    staticFileLocation("/public");
        get("/", (req, res) -> "La direccion debe agregarle el formato '/cuadrado?numero=2'");
        get("/cuadrado", (req, res) -> String.valueOf(Math.pow(Double.parseDouble(req.queryParams("numero")),2)));
    }

}

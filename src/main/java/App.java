import java.util.HashMap;
import java.util.Map;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("teams", request.session().attribute("teams"));
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/teams", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();

      ArrayList<Team> teams = request.session().attribute("teams");
      if (teams == null) {
        teams = new ArrayList<Team>();
        request.session().attribute("teams", teams);
      }

      String name = request.queryParams("name");
      Team newTeam = new Team(name);
      teams.add(newTeam);
      request.session().attribute("team", newTeam);

      model.put("template", "templates/success.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());







  }
}

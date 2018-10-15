
import com.google.gson.Gson;

import java.util.Arrays;
import java.util.List;

public class JSON_lister {

    public static void main(String[] args) {

        String probabilityJsonToGson = "{\n" +
                " \"probabilities\": [\n" +
                "  {\n" +
                "   \"team_name\": \"TEAM\",\n" +
                "   \"percent\": \"WIN %\"\n" +
                "  },\n" +
                "  {\n" +
                "   \"team_name\": \"Colorado Rockies\",\n" +
                "   \"percent\": \"54%\"\n" +
                "  },\n" +
                "  {\n" +
                "   \"team_name\": \"Chicago Cubs\",\n" +
                "   \"percent\": \"46%\"\n" +
                "  }\n" +
                " ]\n" +
                "}";

        Gson gson = new Gson();
        Yla olio = gson.fromJson(probabilityJsonToGson,Yla.class);
        System.out.println(olio.toString());

    }
}

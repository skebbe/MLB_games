
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class JSON_lister {

    public static void main(String[] args) throws FileNotFoundException {

        Probabilities probabilitiesJSON = new Probabilities();

        Gson gson = new Gson();
        JsonReader reader = new JsonReader(new FileReader("D:\\lataukset\\Crawling\\MLB\\probabilities_15.10.json"));

        probabilitiesJSON = gson.fromJson(reader, Probabilities.class);
        System.out.println(probabilitiesJSON.toString());

        Probability[] probabilities = probabilitiesJSON.getProbabilities();

        for (Probability probability : probabilities) {
        }

    }
}

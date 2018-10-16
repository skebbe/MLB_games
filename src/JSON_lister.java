
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class JSON_lister {

    public static void main(String[] args) throws FileNotFoundException {

        Probabilities probabilitiesJSON = new Probabilities();

        Gson gson = new Gson();
        JsonReader probsReader = new JsonReader(new FileReader("C:\\Users\\teemu\\Downloads\\Scrapes\\MLB\\probabilities_16.10.json"));

        probabilitiesJSON = gson.fromJson(probsReader, Probabilities.class);
        System.out.println(probabilitiesJSON.toString());
        

    }
}

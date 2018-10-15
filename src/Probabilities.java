import java.util.Arrays;

public class Probabilities {

    Probability[] probabilities;

    public Probabilities(Probability[] probabilities) {
        this.probabilities = probabilities;
    }

    public Probabilities() {

    }

    public Probability[] getProbabilities() {
        return probabilities;

    }

    public void setProbabilities(Probability[] probabilities) {
        this.probabilities = probabilities;
    }

    @Override
    public String toString() {
        return "Probabilities{" +
                "probabilities=" + Arrays.toString(probabilities) +
                '}';
    }
}

public class Odd {

    String team_1;
    String odd_1;
    String team_2;
    String odd_2;

    public Odd(String team_1, String odds_1, String team_2, String odds_2) {
        this.team_1 = team_1;
        this.odd_1 = odds_1;
        this.team_2 = team_2;
        this.odd_2 = odds_2;
    }

    public String getTeam_1() {
        return team_1;
    }

    public void setTeam_1(String team_1) {
        this.team_1 = team_1;
    }

    public String getOdd_1() {
        return odd_1;
    }

    public void setOdd_1(String odd_1) {
        this.odd_1 = odd_1;
    }

    public String getTeam_2() {
        return team_2;
    }

    public void setTeam_2(String team_2) {
        this.team_2 = team_2;
    }

    public String getOdd_2() {
        return odd_2;
    }

    public void setOdd_2(String odd_2) {
        this.odd_2 = odd_2;
    }

    @Override
    public String toString() {
        return "Odd{" +
                "team_1='" + team_1 + '\'' +
                ", odd_1='" + odd_1 + '\'' +
                ", team_2='" + team_2 + '\'' +
                ", odd_2='" + odd_2 + '\'' +
                '}';
    }
}

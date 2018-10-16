public class Probability {

    String team_name;
    String percent;

    public Probability() {
        this.team_name = team_name;
        this.percent = percent;
    }

    public String getTeam_name() {
        return team_name;
    }

    public void setTeam_name(String team_name) {
        this.team_name = team_name;
    }

    public String getPercent() {
        return percent;
    }

    public void setPercent(String percent) {
        this.percent = percent;
    }

    @Override
    public String toString() {
        return "Prob{" +
                "name='" + team_name + '\'' +
                ", percent='" + percent + '\'' +
                '}';
    }


}

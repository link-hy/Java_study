package c7_ArrayList;

public class movie {
    private String name;
    private  double score;
    private String actor;

    public movie() {
    }

    public movie(String name, double score, String actor) {
        this.name = name;
        this.score = score;
        this.actor = actor;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public String getActor() {
        return actor;
    }
}

import java.util.List;

public class State {
    public int level;
    public List<String> skills;
    public String timePlayed;

    public State(int level, List<String> skills, String timePlayed){
        this.level = level;
        this.skills = skills;
        this.timePlayed = timePlayed;
    }

    public int getLevel(){
        return this.level;
    }
    public void setLevel(int level){
        this.level = level;
    }

    public List<String> getSkills(){
        return this.skills;
    }
    public void setSkills(List<String> skills){
        this.skills = skills;
    }
    public void addSkill(String skill){
        skills.add(skill);
    }


    public String getTimePlayed(){
        return this.timePlayed;
    }
    public void setTimePlayed(String timePlayed){
        this.timePlayed = timePlayed;
    }
}
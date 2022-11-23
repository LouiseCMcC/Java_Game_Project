package weapons;

public class Tool {
    private int healingValue;
    private String name;

    public Tool(int healingValue, String name){
        this.healingValue=healingValue;
        this.name=name;
    }

    public int getHealingValue() {
        return healingValue;
    }

    public String getName() {
        return name;
    }
}

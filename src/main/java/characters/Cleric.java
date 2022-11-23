package characters;

import javax.tools.Tool;
import java.util.ArrayList;

public class Cleric extends Character{
    private Tool tool;
    private ArrayList<Tool>tools;

    public Cleric (String name, int healthPoints, int treasure){
        super(name, healthPoints, treasure);
        this.tools= new ArrayList<Tool>();
    }

    public Tool getTool() {
        return tool;
    }

    public void setTool(Tool tool) {
        this.tool = tool;
    }
}

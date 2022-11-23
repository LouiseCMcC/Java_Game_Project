package characters;

import magics.Spell;
import weapons.Fork;
import weapons.Tool;
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

    public void addTool(Tool tool) {
        this.tools.add(tool);
    }

    public ArrayList getTools() {
        return this.tools;
    }

    public void setTool(Tool tool) {
        for (Tool ownTool : this.tools){
            if(tool == ownTool){
                this.tool = tool;
            }
        }
    }

    public int getBaseHeal() {
        if (this.tool != null) {
            return this.tool.getHealingValue();
        }
        return 1;
    }
}

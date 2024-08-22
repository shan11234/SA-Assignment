public class RemoteControl {
    private final int slot;
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;


    public RemoteControl(int slot){
        this.slot=slot;
        onCommands=new Command[slot];
        offCommands=new Command[slot];
        
    }
    public void setCommand(int slot,Command onCommand,Command offCommand){
        onCommands[slot]=onCommand;
        offCommands[slot]=offCommand;
    }
    public void onButtonWasPressed(int slot){
        onCommands[slot].execute();
        undoCommand=onCommands[slot];

    }
    public void offButtonWasPressed(int slot){
        offCommands[slot].execute();
        undoCommand=offCommands[slot];

    }
    public void undoButtonWasPressed(){
        undoCommand.undo();
    }

}

package com.stack.commandpattern;


public class Family {

    private FamilyCommand command;

    public void setCommand(FamilyCommand familyCommand){
        this.command = familyCommand;
    }

    public void talk(){
        command.speech();
    }

}

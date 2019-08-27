package com.stack.commandpattern;

import com.stack.commandpattern.CommandFamily.Bro;

public class BroCommand implements FamilyCommand {

    /**
     * Bro가 자기소개를 할수있도록 클래스화 한다.
     *
     */

    private Bro mBro;

    public BroCommand(Bro bro){
        this.mBro = bro;
    }

    @Override
    public void speech() {
        mBro.introduce();
    }
}

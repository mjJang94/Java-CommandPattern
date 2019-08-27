package com.stack.commandpattern;

import com.stack.commandpattern.CommandFamily.Mom;

public class MomCommand implements FamilyCommand {

    /**
     * Mom이 자기소개를 할수있도록 클래스화 한다.
     * <p>
     * Mom 클래스는 자기소개를 하는 메소드를 정의.
     */

    private Mom mMom;

    public MomCommand(Mom mom) {
        this.mMom = mom;
    }

    @Override
    public void speech() {
        mMom.introduce();
    }
}

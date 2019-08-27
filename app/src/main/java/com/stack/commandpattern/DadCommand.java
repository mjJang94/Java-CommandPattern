package com.stack.commandpattern;

import com.stack.commandpattern.CommandFamily.Dad;

public class DadCommand implements FamilyCommand {

    /**
     * Dad가 자기소개를 할수있도록 클래스화 한다.
     *
     * Dad 클래스는 자기소개를 하는 메소드를 정의.
     */
    private Dad mDad;

    public DadCommand(Dad dad) {
        this.mDad = dad;
    }

    @Override
    public void speech() {
        mDad.introduce();

    }



}



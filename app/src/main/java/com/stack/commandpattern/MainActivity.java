package com.stack.commandpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.stack.commandpattern.CommandFamily.Bro;
import com.stack.commandpattern.CommandFamily.Dad;
import com.stack.commandpattern.CommandFamily.Mom;

public class MainActivity extends AppCompatActivity {

    private Dad mDad = new Dad();
    private Mom mMom = new Mom();
    private Bro mBro = new Bro();


    /**
     * 이러한 디자인 패턴을 사용하면 가족 구성원(클래스)이 추가되더라도, 해당 클래스만 추가 구현해주면 되므로 OCP에 위반되지 않습니다.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FamilyCommand dadCommand = new DadCommand(mDad);
        FamilyCommand momCommand = new MomCommand(mMom);
        FamilyCommand broCommand = new BroCommand(mBro);

        Family family = new Family();

        //Dad speech 시작
        family.setCommand(dadCommand);
        family.talk();

        //Mom speech 시작
        family.setCommand(momCommand);
        family.talk();

        //Bro speech 시작
        family.setCommand(broCommand);
        family.talk();
    }
}

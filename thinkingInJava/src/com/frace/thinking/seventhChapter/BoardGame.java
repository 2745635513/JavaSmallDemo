package com.frace.thinking.seventhChapter;

import static com.frace.thinking.utils.Print.print;

/**
 * Created by frace on 2019/11/6 17:00
 */
public class BoardGame extends Game {
    private String board="BoardGameStr";
    BoardGame(int i) {
        super(i);
        print("BoardGame Constructor"+i);
    }
    BoardGame(){
        super(1);
        print("boardGame 无参构造器");
    }
}

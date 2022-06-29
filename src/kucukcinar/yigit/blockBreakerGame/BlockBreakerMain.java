package kucukcinar.yigit.blockBreakerGame;

import javax.swing.*;

public class BlockBreakerMain {

    public static void main(String[] args) {
        JFrame obj = new JFrame();
        GamePlay gamePlay = new GamePlay();
        obj.setBounds(10, 10, 710, 600);
        obj.setTitle("Brick Breaker");
        obj.setResizable(true);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gamePlay);
    }
}

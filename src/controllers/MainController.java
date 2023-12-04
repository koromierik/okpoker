/*
* File: MainController.java
* Author: Körömi Erik
* Copyright: 2023, Körömi Erik 
* Date: 2023-12-02
* Licenc: MIT
*
*/

package controllers;

import java.util.Random;
import views.MainWindow;

public class MainController {

enum Round  {
    PREFLOP,
    FLOP,
    TURN,
    RIVER,
    SHOW
}

private int getRandom() {
    Random random = new Random();
    return random.nextInt(13);
}
    
public void initEvent() {
    this.mainWindow.startBtn.addActionListener(
        event -> {
            Random random = new Random();
            int hcard1 = random.nextInt(13);
            int hcard2 = random.nextInt(13);
    
            int ccard1 = random.nextInt(13);
            int ccard2 = random.nextInt(13);
    
            random = null;
    
            String humanCard1Str = cards[hcard1];
            String humanCard2Str = cards[hcard2];
    
            this.mainWindow.humanCard1Btn.setText(humanCard1Str);
            this.mainWindow.humanCard2Btn.setText(humanCard2Str);
    
            System.out.printf("%d %d\n", hcard1, hcard2);
    });
    
    this.mainWindow.stopBtn.addActionListener(
        event -> {
        System.out.println("Állj");
    });
    
    this.mainWindow.nextBtn.addActionListener(
        event -> {
            String flop1Str;
            String flop2Str;
            String flop3Str;
    
    if (this.round == Round.PREFLOP) {
            int flop1 = getRandom();
            int flop2 = getRandom();
            int flop3 = getRandom();
    
            flop1Str = cards[flop1];
            flop2Str = cards[flop2];
            flop3Str = cards[flop3];
    
            this.mainWindow.flop1Btn.setText("♦" + flop1Str);
            this.mainWindow.flop2Btn.setText(flop2Str);
            this.mainWindow.flop3Btn.setText(flop3Str);
            this.mainWindow.flop1Btn.setVisible(true);
            this.mainWindow.flop2Btn.setVisible(true);
            this.mainWindow.flop3Btn.setVisible(true);
            this.round = Round.FLOP;
            return;
        }
    
    if (this.round == Round.FLOP) {
        int turn = getRandom();
        this.mainWindow.turnButton.setText(cards[turn]);
        this.mainWindow.turnButton.setVisible(true);
        this.round = Round.TURN;
        return;
    }
    
    if (this.round == Round.TURN) {
        int river = getRandom();
        this.mainWindow.riverButton.setText(cards[river]);
        this.mainWindow.riverButton.setVisible(true);
        this.round = Round.RIVER;
    }
    });
}
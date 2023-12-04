/*
* File: MainWindow.java
* Author: Körömi Erik
* Copyright: 2023, Körömi Erik 
* Date: 2023-12-02
* Licenc: MIT
*
*/
package views;

import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainWindow extends JFrame {

    private JButton startBtn = new JButton("Start");
    private JButton stopBtn = new JButton("Stop");
    private JButton nextBtn = new JButton("Következő");
    private JButton flop1Btn = new JButton("");
    private JButton flop2Btn = new JButton("");
    private JButton flop3Btn = new JButton("");
    private JButton humanCard1Btn = new JButton();
    private JButton humanCard2Btn = new JButton();
    private JButton turnButton = new JButton();
    private JButton riverButton = new JButton();

    private JPanel tablePanel = new JPanel();
    private JPanel handPanel = new JPanel();
    private JPanel buttonPanel = new JPanel();

    public MainWindow() {
        initializeUI();
    }

    private void initializeUI() {
        // Table Panel
        tablePanel.setSize(100, 100);
        tablePanel.setBackground(Color.LIGHT_GRAY);
        tablePanel.add(flop1Btn);
        tablePanel.add(flop2Btn);
        tablePanel.add(flop3Btn);
        flop1Btn.setVisible(false);
        flop2Btn.setVisible(false);
        flop3Btn.setVisible(false);
        tablePanel.add(turnButton);
        tablePanel.add(riverButton);
        turnButton.setVisible(false);
        riverButton.setVisible(false);

        // Hand Panel
        handPanel.add(humanCard1Btn);
        handPanel.add(humanCard2Btn);

        // Button Panel
        buttonPanel.add(startBtn);
        buttonPanel.add(nextBtn);
        buttonPanel.add(stopBtn);

        // Main Layout
        setLayout(new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS));
        add(buttonPanel);
        add(tablePanel);
        add(handPanel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 250);
    }

    // Getter and Setter methods

    public JButton getStartBtn() {
        return startBtn;
    }

    public JButton getStopBtn() {
        return stopBtn;
    }

    public JButton getNextBtn() {
        return nextBtn;
    }

    public JButton getFlop1Btn() {
        return flop1Btn;
    }

    public JButton getFlop2Btn() {
        return flop2Btn;
    }

    public JButton getFlop3Btn() {
        return flop3Btn;
    }

    public JButton getHumanCard1Btn() {
        return humanCard1Btn;
    }

    public JButton getHumanCard2Btn() {
        return humanCard2Btn;
    }

    public JButton getTurnButton() {
        return turnButton;
    }

    public JButton getRiverButton() {
        return riverButton;
    }
}
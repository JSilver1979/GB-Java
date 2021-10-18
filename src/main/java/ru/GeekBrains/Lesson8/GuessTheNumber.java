package ru.GeekBrains.Lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessTheNumber extends JFrame{
    private int randomNumber;
    private JLabel label;
    private JButton[] buttons = new JButton[10];
    private int tryNumber;

    public GuessTheNumber() {

        setTitle("Guess the Number.");
        setBounds(200, 200, 600, 170);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        label = new JLabel();
        add(label, BorderLayout.NORTH);

        label.setText("Добро пожаловать в игру");
        label.setHorizontalAlignment(SwingConstants.CENTER);

        Font font = new Font("Arial",Font.ITALIC, 18);
        label.setFont(font);

        JPanel buttonsPanel = new JPanel(new GridLayout(1,10));
        add(buttonsPanel,BorderLayout.CENTER);

        for (int i = 0; i < 10 ; i++) {
            buttons[i] = new JButton(String.valueOf(i+1));
            buttons[i].setFont(font);
            buttons[i].setVisible(false);
            buttonsPanel.add(buttons[i]);
            int buttonNumber = i+1;
            JButton buttonLink = buttons[i];
            buttons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    tryToAnswer(buttonNumber, buttonLink);
                }
            });
        }

        JButton restartButton = new JButton("Начать новую игру");
        add(restartButton, BorderLayout.SOUTH);
        restartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startNewGame();
            }
        });

        setVisible(true);
    }

    public void tryToAnswer(int answerButton, JButton button) {
        if (tryNumber == 0) {
            label.setText("Игра закончена, у вас не осталось попыток");
            return;
        }
        if(answerButton == randomNumber) {
            label.setText("Число угадано! Ответ: " + randomNumber);
            button.setForeground(Color.CYAN);
        } else if(answerButton > randomNumber) {
            label.setText("Не верно. Загаданное число меньше");
            button.setVisible(false);
            decreaseTries();
        } else {
            label.setText("Не верно. Загаданное число больше");
            button.setVisible(false);
            decreaseTries();
        }
    }

    public void startNewGame() {
        tryNumber = 3;
        randomNumber = (int)(Math.random() * 10) +1;
        setTitle("Guess the Number. Число попыток: "+ tryNumber);
        label.setText("Программа загадала число от 1 до 10");
        for (int i = 0; i < 10; i++) {
            buttons[i].setVisible(true);
            buttons[i].setForeground(Color.BLACK);
        }

    }
    public void decreaseTries() {
        tryNumber--;
        setTitle("Guess the Number. Число попыток: "+ tryNumber);
    }
}

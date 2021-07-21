package com.company;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class classDic extends JFrame implements ActionListener {
    ArrayList<String> listOfWords = new ArrayList<>();
    JButton button = new JButton("verify");
    JTextField insertWord = new JTextField();
    JLabel answer = new JLabel();
    public classDic(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000, 1000);
        this.setBackground(Color.ORANGE);
        this.setVisible(true);
        this.setLayout(null);
        button.addActionListener(this);
        button.setBounds(350, 350, 250, 250);
        insertWord.setBounds(250, 250, 450, 50);
        answer.setBounds(350, 800, 450, 50);
        this.add(insertWord);
        this.add(button);
        this.add(answer);
    }

    public void actionPerformed(ActionEvent event){
        if(event.getSource() == button){
            String text = insertWord.getText();
            if(listOfWords.contains(text))
            {
                answer.setText("the word if already in the dictionary");
            }
            else{
                listOfWords.add(text);
                answer.setText("");
            }
        }
    }

}

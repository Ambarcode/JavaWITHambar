package com.ak;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GradedLab implements  ActionListener{
    JFrame frame;
    JButton b1,b2,b3;
    public int x1=15, x2=10;

    GradedLab(){


        frame =new JFrame("Basic Math Operation");
        frame.setLayout(new FlowLayout());
        b1=new JButton("Add");
        b2=new JButton("Subtract");
        b3=new JButton("Multiply");

        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){  //here i am using anonymous declaration

                System.out.println("Sum of "+ x1 +" and "+ x2 +" = "+(x1+x2) );

            }
        });
        b2.addActionListener(this);
        b3.addActionListener(this);
        frame.getContentPane().add(b1);
        frame.getContentPane().add(b2);
        frame.getContentPane().add(b3);
        frame.setVisible(true);
        frame.setSize(300,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }





    public static void main(String[] args) {
        new GradedLab();
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b2) {
            System.out.println("Difference of "+ x1 +" and "+ x2 +" = "+(x1-x2) );

        }
        else if(e.getSource()==b3) {
            System.out.println("Product of "+ x1 +" and "+ x2 +" = "+(x1*x2) );
        }


    }



}


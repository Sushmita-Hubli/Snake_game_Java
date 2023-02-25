/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Snakegame;
import java.awt.Color;
import javax.swing.JFrame;
/**
 *
 * @author HP
 */
public class Main {
    public static void main(String args[])
    {
        JFrame f=new JFrame();
        f.setTitle("Snake Game");
        f.setBounds(10,10,905,700);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        GamePanel panel=new GamePanel();
        panel.setBackground(Color.DARK_GRAY);
        f.add(panel);
        f.setVisible(true);
    }
    
}

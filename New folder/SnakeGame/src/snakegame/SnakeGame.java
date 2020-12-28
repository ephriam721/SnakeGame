/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakegame; 
import javax.swing.JFrame;
/**
 *
 * @author looye
 */
public class SnakeGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

		Window f1= new Window();
		

		f1.setTitle("Snake");
		f1.setSize(400,400);
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }
    
}

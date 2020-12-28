/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakegame;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JFrame;

/**
 *
 * @author looye
 */
class Window extends JFrame{
    private static final long serialVersionUID = -2542001418764869760L;
	public static ArrayList<ArrayList<DataOfSquare>> Grid;
	public static int width = 20;
	public static int height = 20;
	public Window(){
		
		
		Grid = new ArrayList<ArrayList<DataOfSquare>>();
		ArrayList<DataOfSquare> data;
		
		for(int i=0;i<width;i++){
			data= new ArrayList<DataOfSquare>();
			for(int j=0;j<height;j++){
				DataOfSquare c = new DataOfSquare(2);
				data.add(c);
			}
			Grid.add(data);
		}
		

		getContentPane().setLayout(new GridLayout(20,20,0,0));
		
		for(int i=0;i<width;i++){
			for(int j=0;j<height;j++){
                            Component add = getContentPane().add(Grid.get(i).get(j).square);
			}
		}
		
		Tuple position = new Tuple(10,10);

		ThreadsController c = new ThreadsController(position);

		c.start();


		this.addKeyListener(new KeyboardListener());

}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakegame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
/**
 *
 * @author looye
 */
public class KeyboardListener extends KeyAdapter {

    @Override
    public void keyPressed(KeyEvent e){
 		    switch(e.getKeyCode()){
		    	case 39:	// -> Right 
		    				if(ThreadsController.directionSnake!=2) {
                                                    ThreadsController.directionSnake=1;
                     }
		    			  	break;
		    	case 38:	// -> Top
							if(ThreadsController.directionSnake!=4) {
                                                            ThreadsController.directionSnake=3;
                     }
		    				break;
		    				
		    	case 37: 	// -> Left 
							if(ThreadsController.directionSnake!=1) {
                                                            ThreadsController.directionSnake=2;
                     }
		    				break;
		    				
		    	case 40:	// -> Bottom
							if(ThreadsController.directionSnake!=3) {
                                                            ThreadsController.directionSnake=4;
                     }
		    				break;
		    	
		    	default: 	break;
 		    }
 		}
}

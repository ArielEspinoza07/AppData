/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package appdata;

import javax.swing.JOptionPane;

/**
 *
 * @author marisol molina rosal
 */
public class Hilo implements Runnable{
    
    private Thread t;
    
    public Hilo(){
        t = new Thread(this,"Hilo");
        t.start();
    }
    
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            JOptionPane.showMessageDialog(null,"Procesando "+i+"%");
        }
    }
    
}

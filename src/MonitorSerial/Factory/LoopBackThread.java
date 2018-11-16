/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MonitorSerial.Factory;

import MonitorSerial.Controle.ControleMonitor;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fmaia
 */
public class LoopBackThread implements Runnable{
    
    private Boolean stop;
    private static Integer tempo = 1000;
    private final ControleMonitor controleMonitor;

    public LoopBackThread(ControleMonitor controleMonitor) {
        this.controleMonitor = controleMonitor;
    }

    public void setTempo(Integer tempo) {
        this.tempo = tempo;
    }

    public static Integer getTempo() {
        return tempo;
    }

    public void stop() {
        System.out.println("Entrou no Stop");
        this.stop = true;
    }
    
    public void iniciarLoopBack() throws InterruptedException{
        this.stop = false;
        while(!stop){
            this.controleMonitor.enviarTexto(randomico());
            Thread.sleep(tempo);
        }
    }
    
    @Override
    public void run() {
        try {
            this.controleMonitor.setTempoLoopBackGui(tempo);
            this.iniciarLoopBack();
        } catch (InterruptedException ex) {
            Logger.getLogger(LoopBackThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private String randomico() {
  
    int leftLimit = 65; // letter 'a'
    int rightLimit = 90; // letter 'z'
    int targetStringLength = 10;
    Random random = new Random();
    StringBuilder buffer = new StringBuilder(targetStringLength);
    for (int i = 0; i < targetStringLength; i++) {
        int randomLimitedInt = leftLimit + (int) 
          (random.nextFloat() * (rightLimit - leftLimit + 1));
        buffer.append((char) randomLimitedInt);
    }
    return buffer.toString()+"\n";
}
    
}

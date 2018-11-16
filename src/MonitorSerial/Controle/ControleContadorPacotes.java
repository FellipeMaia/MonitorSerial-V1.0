/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MonitorSerial.Controle;

import MonitorSerial.Gui.GuiContadorPacote;
import java.awt.Point;
import java.util.Locale;

/**
 *
 * @author fmaia
 */
public class ControleContadorPacotes {
    
    
    private Long pacotesRecebidos; //RX
    private Long pacotesEnviados; //TX
    private Long pacotesPerdidos; //TX sem Confirmação de recebimento
    private Long pacotesLoopBack; //RX recebe o mesmo dado do TX enviou
    
    private Object ultimoPacotesRecebido;
    private Object ultimoPacotesEnviado;
    
    private final GuiContadorPacote guiContadorPacote;

    public ControleContadorPacotes() {
        this.guiContadorPacote = new GuiContadorPacote(this);
    }
    
    public void setVisble(Boolean boo,Point p){
        this.guiContadorPacote.setLocation(p);
        this.guiContadorPacote.setVisible(boo);
    }
    
    public void limparContagem(){
        this.pacotesRecebidos = Long.valueOf(0);
        this.pacotesEnviados  = Long.valueOf(0);
        this.pacotesPerdidos  = Long.valueOf(0);
        this.pacotesLoopBack  = Long.valueOf(0);
    }

    public Long getPacotesRecebidos() {
        return pacotesRecebidos;
    }

    public Long getPacotesEnviados() {
        return pacotesEnviados;
    }

    public Long getPacotesPerdidos() {
        return pacotesPerdidos;
    }

    public Long getPacotesLoopBack() {
        return pacotesLoopBack;
    }
    
    public void contarPacotesEnviados(Object object){
        this.ultimoPacotesEnviado = object;
        this.pacotesEnviados ++;
        this.guiContadorPacote.setJLTXText(pacotesEnviados);
    }
    
    public void contarPacotesRecebido(Object object){
        this.ultimoPacotesRecebido = object;
        if(object.equals(this.ultimoPacotesEnviado)){
            this.pacotesLoopBack ++;
            this.guiContadorPacote.setJLReturned(pacotesLoopBack);
        }else{
            this.pacotesRecebidos ++;
            this.guiContadorPacote.setJLRXText(pacotesRecebidos);
        }
    }
}

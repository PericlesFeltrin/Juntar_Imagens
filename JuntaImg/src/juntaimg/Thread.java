/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juntaimg;

import java.io.IOException;

/**
 *
 * @author pericles
 */
public class Thread {

    static void sleep() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private int ini, fim;
    private String imagens, novaimagem;
    
    public Thread(int i, int f, String imgs, String nimgs) {
        ini = i;
        fim = f;
        imagens = imgs;
        novaimagem = nimgs;
    }
    
    public void run() throws IOException{
        Juntar j = new Juntar();
        for (int i = ini; i < fim; i++) {
            j.juntaLinhaColuna(i, imagens, novaimagem);
        }
    }
}

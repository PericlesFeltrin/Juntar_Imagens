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
    private int ini, fim;
    public Juntar j = new Juntar();
    public Thread(int i, int f) {
        ini = i;
        fim = f;
    }
    public void run() throws IOException{
        for (int i = ini; i < fim; i++) {
            j.juntaLinhaColuna(i);
        }
    }
}

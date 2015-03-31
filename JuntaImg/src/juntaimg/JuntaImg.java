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
public class JuntaImg {

    public static void main(String[] args) throws IOException{
        int x =0, quant = 4;
       
        x = 64/quant;
        
        for(int i = 0; i < quant; i++){
            Thread t = new Thread(x*i, x*(i+1));
            t.run();
        }
        
        Juntar j = new Juntar();
        j.juntaLinha();
        
    }
}

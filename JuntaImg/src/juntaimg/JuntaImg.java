/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juntaimg;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author pericles
 */
public class JuntaImg {
    
    

    public static void main(String[] args) throws IOException{
        int x =0, quant = 4;
        String imagens, novaimg;
        Scanner ler = new Scanner(System.in);
        Scanner arquivo = new Scanner(System.in);
        
        System.out.printf("Quantidade de Threads(2^n ou seja, 2, 4, 8..): "); 
        quant = ler.nextInt(); 
   
        System.out.printf("Caminho das Imagens: "); 
        imagens = arquivo.next();
        
        System.out.printf("Caminho das Novas Imagens: "); 
        novaimg = arquivo.next();
               
        x = 64/quant;
        
        long inicio = System.currentTimeMillis();
        for(int i = 0; i < quant; i++){
            Thread t = new Thread(x*i, x*(i+1), imagens, novaimg);
            t.run();
        }

        Juntar j = new Juntar();
        j.juntaLinha(imagens, novaimg);
                
        long fim = System.currentTimeMillis();
        System.out.println("Tempo de Execução com "+quant+" Threads é de "+(fim-inicio)+" milissegundos");
    }
}

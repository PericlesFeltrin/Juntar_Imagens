/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juntaimg;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author pericles
 */
public class Juntar {
   
    public void juntaLinhaColuna(int linha, String imagem, String nova) throws IOException{
        int coluna = 0;
        
        //cria uma nova imagem, com altura, comprimento e cor
        BufferedImage imgLinha = new BufferedImage(256*64, 256, BufferedImage.TYPE_USHORT_565_RGB);
        Graphics g = imgLinha.getGraphics();
        
        while(coluna < 64){
            //Busca imagem
            File path = new File(imagem+coluna+"_"+linha+".jpg");
            BufferedImage image = ImageIO.read(path);
            g.drawImage(image, 256*coluna, 0, null);     
            coluna++;
        }
        
        //Salva Imagem
        ImageIO.write(imgLinha, "JPG", new File(nova+"linha"+linha+".JPG"));

    }
    
    public void juntaLinha(String imagem, String nova) throws IOException{
        //cria uma nova imagem, com altura, comprimento e cor
        BufferedImage img = new BufferedImage(256*64, 256*64, BufferedImage.TYPE_USHORT_565_RGB);
        Graphics g = img.getGraphics();
        
        for(int i = 0; i < 64; ){
            //Busca imagem
            File path = new File(nova+"linha"+i+".jpg");
            if(path.exists()){
                BufferedImage image = ImageIO.read(path);
                g.drawImage(image, 0, 256*i, null);
                i++;                
            }
        }
        
        //Salva Imagem
        ImageIO.write(img, "JPG", new File(nova+"img.JPG"));

    }
    
}

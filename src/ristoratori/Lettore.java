/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ristoratori;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ildon
 */
public class Lettore {
private static BufferedReader br = null;
    private static String line;
    private static FileReader fr;        
    private static HashSet list = new HashSet();       
    private void Lettore(BufferedReader br,String line, FileReader fr, HashSet list ) {
    	this.br = br;
    	this.fr = fr;
    	this.line = line;
    	this.list = list;
    }
    public String ListaRistoranti(){
        try {           
            br = new BufferedReader(new FileReader("EatAdvisor.json"));            
            while((line = br.readLine()) != null  ){
                if (line.isEmpty()) continue;             
                return line;
            }          
        } catch (IOException ex) {
            ex.printStackTrace();
        }  
    return null;
		
    }
    public static void main(String[] args) {
    	Lettore d = new Lettore();      
    	String lista = d.ListaRistoranti();
        
        System.out.println(lista);
    }
        
	
}

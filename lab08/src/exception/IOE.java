/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOE {
    public static void readFile()throws FileNotFoundException, IOException{
        FileInputStream fis = new FileInputStream("Dictionary.txt");
	fis.read();
        fis.close();
    }
    public static void main(String [] args){
        try{
            readFile();
        }catch(Exception e){
            System.out.println("Ngoai le :"+e);
        }
    }
}

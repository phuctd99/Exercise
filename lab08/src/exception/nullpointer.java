/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;
public class nullpointer {
    public static void printLength() throws NullPointerException{
        String s = null;
        System.out.println(s.length());
    }
    public static void main(String[] args){
        try{
            printLength();
        }catch(Exception e){
            System.out.println("Ngoại lệ "+e);
        }
    }
}

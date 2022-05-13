/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukllivecoding;

/**
 *
 * @author PC
 */
public class Hitungukl {
    public static void main(String[] args) {
       bangundatar BD= new bangundatar();
       belahketupat BK= new belahketupat();
       BK.sisi= 2;
       BK.d1= 5;
       BK.d2= 10;
       
       persegipanjang PP= new persegipanjang();
       PP.panjang= 7;
       PP.lebar= 2;
       
       BD.keliling();
       BD.luas();
       
       BK.keliling();
       BK.luas();
       
       PP.keliling();
       PP.luas();
    }
}

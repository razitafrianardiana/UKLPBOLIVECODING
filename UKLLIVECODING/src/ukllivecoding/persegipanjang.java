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
public class persegipanjang extends bangundatar {
    float panjang, lebar;
    
    @Override
    public void luas(){
        float luas= panjang*lebar;
        System.out.println("Luas Persegi Panjang= " +luas);
    }
    @Override
    public void keliling(){
        float keliling= 2*(panjang+lebar);
        System.out.println("Keliling Persegi Panjang= " +keliling);
}
}
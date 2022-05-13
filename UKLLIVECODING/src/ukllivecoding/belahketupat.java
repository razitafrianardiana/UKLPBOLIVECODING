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
public class belahketupat extends bangundatar {
    float sisi, d1, d2;
    @Override
    public void luas(){
        int d1= 2;
        int d2= 5;
        float luas= d1*d2/2;
        System.out.println("Luas Belah Ketupat= "+luas);
    }
    
    @Override
    public void keliling(){
        float keliling= 4*sisi;
        System.out.println("Keliling Belah Ketupat "+keliling);
    }
}

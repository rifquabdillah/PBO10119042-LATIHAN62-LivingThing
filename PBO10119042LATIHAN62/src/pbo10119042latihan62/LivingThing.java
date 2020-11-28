/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10119042latihan62;

/**
 *
 * @author Muhammad Rifqu Abdillah
 * NIM  : 10119042
 * Kelas:IF-1
 */
public abstract class LivingThing {
    
    public abstract void walk (String nama);
    
    public void breath (String nama){
        System.out.println(nama + " Bernafas");
    }
    
    public void eat (String nama){
        System.out.println(nama + " makan");
    }
    
}

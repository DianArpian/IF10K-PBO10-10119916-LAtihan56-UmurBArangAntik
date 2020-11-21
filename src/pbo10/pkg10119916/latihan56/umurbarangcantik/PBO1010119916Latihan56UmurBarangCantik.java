/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10.pkg10119916.latihan56.umurbarangcantik;

/**
 *
 * @author 
 * NAMA     : DIAN ARPIAN
 * NIM      : 10119916
 * KELAS    : IF10K
 */
public class PBO1010119916Latihan56UmurBarangCantik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Radio radio = new Radio(234);
        radio.setName("Radio AM");
        System.out.println("Nama Barang Antik : "+radio.getName());
        radio.tampilUmur();
    }
    
}

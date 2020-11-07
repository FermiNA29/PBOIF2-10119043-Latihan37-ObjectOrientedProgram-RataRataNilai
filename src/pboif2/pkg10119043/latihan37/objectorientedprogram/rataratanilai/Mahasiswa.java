/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119043.latihan37.objectorientedprogram.rataratanilai;
import java.util.Scanner;
/**
 *
 * @author FERMI
 * NAMA      : FERMI NAUFAL AKBAR
 * NIM       : 10119043
 * KELAS     : IF2
 * DESKRIPSI : Program menghitung rata-rata nilai dengan objecct oriented
 */
public class Mahasiswa {
    private int i;
    private float nilai = 0;
    private float rataRata;
    
    public float[] inputNilai(int banyakMhs) {
        Scanner scanner = new Scanner(System.in);
        float[] nilaiMhs = new float[banyakMhs];
        for(i=0; i<=banyakMhs-1; i++) {
            System.out.print("Mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = scanner.nextInt();
        }
        return nilaiMhs;
    }
    
    private void hitungRataRata(float[] nilaiMhs) {
        for(i=0; i < nilaiMhs.length; i++) {
            nilai = nilai + nilaiMhs[i];
        }
        rataRata = nilai / nilaiMhs.length;
        System.out.println();
        System.out.println("Maka, Rata-rata nilainya adalah " + rataRata);
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println("Developed by : Fermi Naufal Akbar");
    }
    
    public void hasilRataRata(int banyakMhs) {
        hitungRataRata(inputNilai(banyakMhs));
    }
    
}

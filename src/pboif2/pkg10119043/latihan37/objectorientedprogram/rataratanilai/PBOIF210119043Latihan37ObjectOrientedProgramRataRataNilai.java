/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119043.latihan37.objectorientedprogram.rataratanilai;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author FERMI
 * NAMA      : FERMI NAUFAL AKBAR
 * NIM       : 10119043
 * KELAS     : IF2
 * DESKRIPSI : Program menghitung rata-rata nilai dengan objecct oriented
 */
public class PBOIF210119043Latihan37ObjectOrientedProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static int banyakMhs;
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Banyak Mahasiswa : ");
        banyakMhs = scanner.nextInt();
        
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.hasilRataRata(banyakMhs);
    }
}

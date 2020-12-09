/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remidiprorpl;

/**
 *
 * @author MOKLET-1
 */
import java.util.Scanner;
public class RemidiProRPL {

    /**
     * @param args the command line arguments
     */
    static void nama(){
        System.out.println("Chasidiyah Chesarya Al-Asyhari");
    }
    static void kelas(){
        System.out.println("X RPL 3 / 07 ");
    } 
    static void usia(){
        System.out.println("Usia :"+(2020-2004));
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner scan = new Scanner(System.in);
    int tugas1, tugas2, tugas3, nilaiKimia, rerataKimia;
    boolean keluar = true;
    String ulang;
    
    nama();
    kelas();
    usia();
    
        System.out.println("\n");
        System.out.println("Nilai Rapor Kimia");
        
        System.out.println("Masukkan Nilai Tugas 1 Anda ;");
        tugas1 = scan.nextInt();
        
        System.out.println("Masukkan Nilai Tugas 2 Anda ;");
        tugas2 = scan.nextInt();
        
        System.out.println("Masukkan Nilai Tugas 3 Anda ;");
        tugas3 = scan.nextInt();
        
        nilaiKimia = (tugas1 + tugas2 + tugas3);
        rerataKimia = (nilaiKimia/3);
        System.out.println("Nilai Rapor Kimia Anda ="+rerataKimia);
        
        if(rerataKimia >= 90){
            System.out.println("Grade anda adalah A");
        }
        if(rerataKimia >= 80 && rerataKimia <= 90){
            System.out.println("Grade anda adalah B");
        }
        if(rerataKimia >= 70 && rerataKimia <= 80){
            System.out.println("Grade anda adalah C");
        }
        else{
            System.out.println("Mohon Maaf Anda Tidak Naik Kelas");
        }
        System.out.println("\n");
        
        while(keluar){
            System.out.println("Apakah Anda Ingin Keluar?");
            System.out.println("jawabYa atau Tidak");
            
            ulang = scan.nextLine();
            
            if(ulang.equalsIgnoreCase("ya")){
                keluar = false;
            }
        }
    }
    
    
}

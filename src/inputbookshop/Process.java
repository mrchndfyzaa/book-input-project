/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inputbookshop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author march
 */
public class Process {
    private String judulBuku;
    private String penulisBuku;
    private String penerbitBuku;
    private String sinopsisBuku;
    private String quotesBuku;
//    private String[] dataBuku;
    List<String> dataBuku = new ArrayList<String>();
    
    private int jumlahInput;
    Scanner input = new Scanner(System.in);
    
    Process(){
        
    }
    
    public void setJumlahInput(){
        System.out.print("Masukkan jumlah buku yang akan diinputkan: ");
        this.jumlahInput = input.nextInt();
        input.nextLine();
        setData();
    }
    
    public int getJumlahInput(){
        return jumlahInput;
    }
    
    public void setData(){
        for (int i = 0; i < getJumlahInput(); i++) {
            System.out.print("Masukkan judul buku ke-" + (i+1) + " : ");
            this.judulBuku = input.nextLine();
            System.out.print("Masukkan penulis buku ke-" + (i+1) + " : ");
            this.penulisBuku = input.nextLine();
            System.out.print("Masukkan penerbit buku ke-" + (i+1) + " : ");
            this.penerbitBuku = input.nextLine();
            System.out.print("Masukkan sinopsis buku ke-" + (i+1) + " : ");
            this.sinopsisBuku = input.nextLine();
            System.out.print("Masukkan quotes buku ke-" + (i+1) + " : ");
            this.quotesBuku = input.nextLine();
            System.out.println("");
            dataBuku.add("\nJudul Buku : " + judulBuku + 
                    "\nPenulis Buku : " + penulisBuku +
                    "\nPenerbit Buku : " + penerbitBuku + 
                    "\nSinopsis Buku : " + sinopsisBuku +
                    "\nQuotes Buku : " + quotesBuku);
        }
    }
    
    public void displayMessage(){
        System.out.println("===========Result============");
        for (int i = 0; i < getJumlahInput(); i++) {
            System.out.print(dataBuku.get(i) + "\n");
        }
    }
}

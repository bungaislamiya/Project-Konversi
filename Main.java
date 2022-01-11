/*
Nama    : Bunga Islamiya Putri
NPM     : 20191310053
*/
package com.company;

import javax.swing.*;
public class Main {

    public static void main(String[] args) {
        int nilai;
        String n, nama, npm;

        char grade;
        nama = JOptionPane.showInputDialog("input nama mahasiswa:");
        npm = JOptionPane.showInputDialog("input npm mahasiswa:");
        n = JOptionPane.showInputDialog("input nilai:");

        nilai = Integer.parseInt(n);
        if (nilai >= 60 && nilai<=100)
        {
            grade = 'A';
        }else if (nilai>=70 && nilai<=84){
            grade ='B';
        }else if (nilai>=60 && nilai<=70){
            grade ='C';
        }else if (nilai>=50 && nilai<=60){
            grade ='D';
        }else{
            grade='E';
        }
        System.out.println("\tTugas Project konversi nilai.");
        System.out.println("Nama Mahasiswa\t\t: "+nama);
        System.out.println("Npm Mahasiswa\t\t: "+npm);
        System.out.println("Nilai Akhir mahasiswa\t: "+grade);
    }
}

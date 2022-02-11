/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundry;

/**
 *
 * @author Zila
 */
public class Person {
    protected  String nama, alamat, telepon; // membuat class yang variabel nya sama terlebih dahulu
// protected adalah modifier yg hanya bisa diakses oleh class itu sendiri (sub class)
// yang diwariskan method dan properti/atribut
    public Person(String nama, String alamat, String telepon){
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
    // this memanggil
    //method yang namanya sama dengan nama class nya itu disebut construstor
    //constructor dieksekusi ketika membuat objek baru ada keyword 'new'
    }
}

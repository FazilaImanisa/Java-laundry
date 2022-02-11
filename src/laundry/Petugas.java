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
public class Petugas extends Person {
    // class Petugas hanya menambahkan attribut idPetugas dan jabatan
    // untuk nama, alamat, dan telepon mewariskan dari claas Person 
    private int idPetugas;
    private String jabatan;
    
    public Petugas(int idPetugas, String nama, String alamat, String telepon, String jabatan){
        super(nama, alamat, telepon); //memanggil constructor dari Person
        this.idPetugas = idPetugas;
        this.jabatan = jabatan;
    }
    
    // implementasi enkapsulasi dengan pembuatan method untuk mengakses private data "idPetugas"
    public int getIdPetugas(){
        return idPetugas;
    }
    
    // implementasi enkapsulasi dengan pembuatan method untuk mengakses private data "jabatan"
    public String getJabatan(){
        return jabatan;
    }
    
    // implementasi enkapsulasi dengan pembuatan method untuk mengakses private data "nama"
    public String getNama(){
        return nama;
    }
    
    // implementasi enkapsulasi dengan pembuatan method untuk mengakses private data "alamat"
    public String getAlamat(){
        return alamat;
    }
    
    // implementasi enkapsulasi dengan pembuatan method untuk mengakses private data "telepon"
    public String getTelepon(){
        return telepon;
    }
}

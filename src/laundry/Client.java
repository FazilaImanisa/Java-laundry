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

// implementasi inheritence 
public class Client extends Person { //membuat class dan diwarisi dari class pertama (Person)
    // class Client hanya menambahkan attribut idClient dan saldo
    // untuk nama, alamat, dan telepon mewariskan dari class Person 
    private final int idClient;
    private double saldo;
    
    public Client(int idClient, String nama, String alamat, String telepon, double saldo){
        super(nama, alamat, telepon); // pemanggilan costructor Person
        this.idClient = idClient;
        this.saldo = saldo;
    }
    
    // implementasi enkapsulasi dengan pembuatan method untuk mengakses private data "idClient"
    public int getIdClient(){
        return idClient;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public String getTelepon(){
        return telepon;
    }
    
    public void kurangiSaldo(double jumlah){
        this.saldo -= jumlah;
    }
}

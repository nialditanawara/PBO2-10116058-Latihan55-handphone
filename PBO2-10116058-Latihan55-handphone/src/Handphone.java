/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116058.latihan55.handphone;

public class Handphone {
    protected String manufacture;
    protected String operatingSystem;
    protected String model;
    protected int harga;
    
    
    public Handphone( String man, String os, String model, int harga){
        this.manufacture = man;
        this.operatingSystem = os;
        this.model = model;
        this.harga = harga;
    }
    public void displayProduct(){
            Android android = new Android("Samsung", "Android ", "Grand", 3000000);
            android.setKeyStore("234ibfd3840fo");
            System.out.println("Manufatkur : " +android.manufacture);
            System.out.println("OS : "+android.operatingSystem);
            System.out.println("Harga : "+android.harga);
            System.out.println("Android Key Store : " +android.getKeyStore());
            System.out.println("");
            BlackBerry bb = new BlackBerry("BlackB", "RIM", "Curve", 2000000);
            bb.setPinBB("BHS249");
            System.out.println("Manufatkur : " +bb.manufacture);
            System.out.println("OS : "+bb.operatingSystem);
            System.out.println("Harga : "+bb.harga);
            System.out.println("Android Key Store : " +bb.getPinBB());
            System.out.println("");
            WindowsPhone WP = new WindowsPhone("Nokia", "Win8", "Lumia", 1000000);
            WP.setWpKeyStore("UUUQIJWORJ");
            System.out.println("Manufatkur : " +WP.manufacture);
            System.out.println("OS : "+WP.operatingSystem);
            System.out.println("Harga : "+WP.harga);
            System.out.println("Android Key Store : " +WP.getWpKeyStore());
            System.out.println("");
            }
    
}
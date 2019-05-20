/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_de_inversiones;

/**
 *
 * @author jdiazga
 */
public class Client {
    private String name;
    private String last_name;
    private int phone;
    private int edad;
    private String email;
    private Asset [] assets;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLast_name() {
        return last_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public int getPhone() {
        return phone;
    }
    public void setPhone(int phone) {
        this.phone = phone;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Asset[] getAssets() {
        return assets;
    }
    public void setAssets(Asset[] assets) {
        this.assets = assets;
    }
    

    public Client(String name, String last_name, int phone, int edad, String email) {
        this.name = name;
        this.last_name = last_name;
        this.phone = phone;
        this.edad = edad;
        this.email = email;
        this.assets=new Asset [10];
    }
    
    public void addAsset(int tipo_activo,){
        for(int i=0;i<10;i++){
            if(this.assets[i]!=null){
                switch (tipo_activo){
                this.assets[i]=new
                }
            }
        }
    }
         
}

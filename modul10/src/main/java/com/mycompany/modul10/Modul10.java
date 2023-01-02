package com.mycompany.modul10;

import java.util.Scanner;

interface ActivityLampu{
    public static final int LAMPU_HIDUP=1;
    public static final int LAMPU_MATI=0;
    public static final int LAMPU_REDUP=2;
    public abstract void matikanLampu();
    public abstract void hidupkanLampu();
    public abstract void redupkanLampu();
}

class Lampu implements ActivityLampu{
    public int statusLampu;
    
    public void matikanLampu(){
        if(statusLampu==0){
            System.out.println("Lampu sudah dalam kondisi mati");
        }
        else if(statusLampu==1){
            statusLampu-=1;
            System.out.println("Lampu sudah dimatikan");
        }
    }
    public void hidupkanLampu(){
        if(statusLampu==1){
            System.out.println("Lampu sudah dinyalakan\n***");
        }
        else{
            statusLampu+=1;
            System.out.println("Lampu sudah dalam kondisi menyala");
        }
    }
    public void redupkanLampu(){
        if(statusLampu==2){
            System.out.println("Lampu sudah redup\n***");
        }
        else{
            statusLampu+=1;
            System.out.println("Lampu sudah dalam kondisi menyala");
        }
    }
    public int setSaklar(int saklar){
        return statusLampu=saklar;
    }
}




public class Modul10 {

    public static void main(String[] args) {
        Lampu lampu= new Lampu();
        Scanner sc= new Scanner(System.in);
        lampu.statusLampu= lampu.setSaklar(0);
        System.out.println("Status Lampu = "+ lampu.statusLampu+ "\nketikkan");
        System.out.println("1 untuk menyalakan lampu"
                + "\n0 untuk mematikan lampu"
                + "\n2 untuk meredupkan lampu");
        
        int i=sc.nextInt();
        
            System.out.println("RUNNN");
          if(lampu.setSaklar(i)==0){
                lampu.matikanLampu();
            }
          else if(lampu.setSaklar(i)==1){
                lampu.hidupkanLampu();
            }
        else{
            lampu.redupkanLampu();
        }  
        
        
    }
}

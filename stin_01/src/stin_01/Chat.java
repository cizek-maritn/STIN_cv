/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stin_01;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class Chat {
    private final String name;
    private ArrayList<String> chat_log;
    private ArrayList<Klient> klienti;
    
    public Chat(String name) {
        this.name=name;
    }
    
    void AddMessage(Klient k, String msg) {
        //prida message od klienta do logu
        this.chat_log.add(k.getName() + ": " + msg);
    }
    
    void AddKlient(Klient k) {
        //prida klienta do chatu
        this.klienti.add(k);
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getChat_log() {
        return chat_log;
    }

    public ArrayList<Klient> getKlienti() {
        return klienti;
    }
  
    

}

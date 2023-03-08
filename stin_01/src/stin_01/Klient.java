/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stin_01;

/**
 *
 * @author Dell
 */
public class Klient {
    private final String name;
    
    public Klient(String name) {
        this.name=name;
    }
    
    void joinChat(Chat chat) {
        chat.AddKlient(this);
    }
    
    void sendMsg(String msg, Chat chat) {
        chat.AddMessage(this, msg);
    }

    public String getName() {
        return name;
    }
    
}

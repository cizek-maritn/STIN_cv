/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stin_01;

/**
 *
 * @author Dell
 */
public class Stin_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Klient k1 = new Klient("Pepa");
        Klient k2 = new Klient("Franta");
        Chat c1 = new Chat("grilovacka");
        Chat c2 = new Chat("zajezd");
        c1.AddKlient(k2);
        c1.AddKlient(k1);
        c2.AddKlient(k2);
        c1.AddMessage(k2, "ahoj");
        c1.AddMessage(k1, "nazdar");
        c2.AddMessage(k2, "hehe");
        display(c1,k1);
        display(c1,k2);
        display(c2,k1);
        display(c2,k2);
    }
    
    static void display(Chat ch, Klient k) {
        if (ch.getKlienti().contains(k)) {
            System.out.println("Chat: " + ch.getName());
            for (String s : ch.getChat_log()) {
                System.out.println(s);
            }
            System.out.println("");
        } else {
            System.out.println("tady nic");
            System.out.println("");
        }
    }
    
}

package cts.Panghe.Tiberiu_Andrei.g1162.main;

import cts.Panghe.Tiberiu_Andrei.g1162.adapter.BiletDeAcces;
import cts.Panghe.Tiberiu_Andrei.g1162.adapter.BiletRezervatOnline;
import cts.Panghe.Tiberiu_Andrei.g1162.adapter.OnlineOrder;
import cts.Panghe.Tiberiu_Andrei.g1162.adapter.Ticket;

import java.time.LocalDateTime;

public class Main {
    private static void printeazaBilet(Ticket ticket) {
        System.out.println(ticket.print());
    }

    public static void main(String[] args) {
        Ticket biletDeAcces = new BiletDeAcces("Cinema City", "Da", "Toparceanu", "Bucuresti", "Misto", "img.jpg", LocalDateTime.now(), "Da", "Da");
        printeazaBilet(biletDeAcces);

        OnlineOrder onlineOrder = new BiletRezervatOnline("Pizza", "Da", "Toparceanu", "Bucuresti", "Misto", "img.jpg", LocalDateTime.now(), "Da", "Da");
        System.out.println("\nDetaliile comenzii online:\n");
        System.out.println(onlineOrder.showOrderDetails());


        System.out.println("-----------------------------");
        Ticket onlineOrderAdapter = new BiletRezervatOnline("Fast and Furious", "Da", "Vin Diesel, Michelle Rodriguez", "Bucuresti", "Misto", "img.jpg", LocalDateTime.now(), "Da", "Da");
        printeazaBilet(onlineOrderAdapter);
    }
}

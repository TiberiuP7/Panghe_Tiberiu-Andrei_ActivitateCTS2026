package main;

import singleton.Hotel;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = Hotel.getInstance("Hotel Central", 7, 5);
        hotel.afiseazaDetaliiHotel();
        Hotel hotel2 = Hotel.getInstance("Hotel Lux", 200, 0);

        hotel.rezervaCamera();
        hotel.rezervaCamera();

        hotel2.rezervaCamera();
        hotel2.rezervaCamera();

        hotel.afiseazaDetaliiHotel();
        hotel2.afiseazaDetaliiHotel();
    }
}

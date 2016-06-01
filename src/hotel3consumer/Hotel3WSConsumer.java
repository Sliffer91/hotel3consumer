/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel3consumer;

/**
 *
 * @author Sliffer
 */
public class Hotel3WSConsumer {

    public static java.util.List<hotel3consumer.Habitacion> buscarHabitacionesEnFechas(java.lang.String inicio, java.lang.String fin) {
        hotel3consumer.Hotel3WS_Service service = new hotel3consumer.Hotel3WS_Service();
        hotel3consumer.Hotel3WS port = service.getHotel3WSPort();
        return port.buscarHabitacionesEnFechas(inicio, fin);
    }

    public static boolean registrarReserva(java.lang.Integer persona, java.lang.Integer name, java.lang.String inicio, java.lang.String fin, java.util.List<java.lang.Integer> habitaciones) {
        hotel3consumer.Hotel3WS_Service service = new hotel3consumer.Hotel3WS_Service();
        hotel3consumer.Hotel3WS port = service.getHotel3WSPort();
        return port.registrarReserva(persona, name, inicio, fin, habitaciones);
    }

}

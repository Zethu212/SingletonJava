/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NTLAHLA W
 */
public class DoubleBookingAppointmentHolder {
    
   public DoubleBookingAppointmentHolder(String name){
   System.out.println("Dear "+name + "," + "I may consult many people at a time!");
  
 }

    private DoubleBookingAppointmentHolder() {
    }
 
 private static class DoubleBookingHelper{
 private static final DoubleBookingAppointmentHolder INSTANCE = new DoubleBookingAppointmentHolder();
 }
 public static DoubleBookingAppointmentHolder getInstance(){
 return DoubleBookingHelper.INSTANCE;
 }
}



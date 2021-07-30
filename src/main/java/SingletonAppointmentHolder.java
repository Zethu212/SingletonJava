/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NTLAHLA W
 */
public class SingletonAppointmentHolder {
     
    private SingletonAppointmentHolder(){
    System.out.println("Dear Zukisa,I only consult one person at a time!");
    }
    private static class SingletonHelper{
    private static final SingletonAppointmentHolder INSTANCE = new  SingletonAppointmentHolder();
    }
    public static SingletonAppointmentHolder getInstance(String zukisa){
    return SingletonHelper.INSTANCE;
    }
    }

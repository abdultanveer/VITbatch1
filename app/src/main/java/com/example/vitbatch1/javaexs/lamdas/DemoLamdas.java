package com.example.vitbatch1.javaexs.lamdas;

public class DemoLamdas {

    public static void main(String[] args) {
        //life before lamdas
        MessageImpl message = new MessageImpl();
        message.sendMessage();

        //life after lamdas
        IMessage iMessage = () -> {
            System.out.println("sending message from lamda");};
        iMessage.sendMessage();
    }
}

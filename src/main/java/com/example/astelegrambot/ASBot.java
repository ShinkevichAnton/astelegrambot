package com.example.astelegrambot;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Component
public class ASBot extends TelegramLongPollingBot {
    @Override
    public String getBotUsername() {
        return "as_java_telegram_bot";
    }

    @Override
    public String getBotToken() {
        return "1258840669:AAHZmb07wTpuV78BEu2z7aiSCEGDY41W5Zs";
    }

    @Override
    public void onUpdateReceived(Update update) {
        if(update.hasMessage()){
            Message message = update.getMessage();
            if(message.hasText()){
                String text = message.getText();
                if(text.equals("/hello")){
                    String response = "Hello you too";
                    sendMessage(message,response);
                }
            }
        }
    }
    public void sendMessage(Message message,String response){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(message.getChatId());
        sendMessage.setText(response);
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }


    }
}

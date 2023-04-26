package org.example;

import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class MessageReact extends ListenerAdapter {
    public String getTagesplan(){
        return "Tagesplan";
    }
    public void onMessageReceived(MessageReceivedEvent event) {
        if (event.getMessage().isFromGuild()) {
            System.out.println("Message from " + event.getAuthor().getName() + ":" + event.getMessage().getContentDisplay());
        }


        if (event.getMessage().getContentRaw().equals("!tagesplan")) {
            event.getChannel().sendMessage(getTagesplan()).queue();
        }


        if (event.getMessage().getContentRaw().equals("!essensplan")) {
            HttpResponse<String> response = Unirest.get("")
                    .asString();
            event.getChannel().sendMessage(response.getBody()).queue();
        }


    }
}

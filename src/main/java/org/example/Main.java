package org.example;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        JDA jda = JDABuilder.createDefault("")
                .setActivity(Activity.playing("with JDA"))
                .enableIntents(GatewayIntent.MESSAGE_CONTENT)
                .addEventListeners(new MessageReact())
                .build();

    }
}

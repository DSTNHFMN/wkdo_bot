package org.example;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;
import okhttp3.OkHttpClient;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        JDABuilder.createDefault("MTA4NTQ3NTgwMTk2MjY0NzU3NA.GA520b.BLp2Apv-utjeOGpqFglQsc7wzRrGEEC7RQV-V0")
                .enableIntents(GatewayIntent.MESSAGE_CONTENT)
                .setStatus(OnlineStatus.ONLINE)
                .setActivity(Activity.playing("with JDA"))
                .addEventListeners(new MessageReact())
                .build();
    }
}
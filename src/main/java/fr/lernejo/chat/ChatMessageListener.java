
package fr.lernejo.chat;

import org.springframework.stereotype.Component;

@Component
public class ChatMessageListener {


    public void onMessage(String msg) {
        System.out.println(msg);
    }
}

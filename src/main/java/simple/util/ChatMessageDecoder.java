package simple.util;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 14-11-8
 * Time: 下午4:27
 * To change this template use File | Settings | File Templates.
 */


import java.io.StringReader;
import java.util.Date;

import javax.json.Json;
import javax.json.JsonObject;
import javax.websocket.DecodeException;
import javax.websocket.Decoder;
import javax.websocket.EndpointConfig;

public class ChatMessageDecoder implements Decoder.Text<ChatMessage> {
    @Override
    public void init(final EndpointConfig config) {
    }

    @Override
    public void destroy() {
    }

    @Override
    public ChatMessage decode(final String textMessage) throws DecodeException {
        ChatMessage chatMessage = new ChatMessage();
        JsonObject obj = Json.createReader(new StringReader(textMessage))
                .readObject();
        chatMessage.setMessage(obj.getString("message"));
        chatMessage.setSender(obj.getString("sender"));
        chatMessage.setReceived(new Date());
        return chatMessage;
    }

    @Override
    public boolean willDecode(final String s) {
        return true;
    }
}
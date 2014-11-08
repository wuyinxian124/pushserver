package simple.util;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 14-11-8
 * Time: 下午4:28
 * To change this template use File | Settings | File Templates.
 */

import java.util.Date;

public class ChatMessage {
    private String message;
    private String sender;
    private Date received;

    public final String getMessage() {
        return message;
    }

    public final void setMessage(final String message) {
        this.message = message;
    }

    public final String getSender() {
        return sender;
    }

    public final void setSender(final String sender) {
        this.sender = sender;
    }

    public final Date getReceived() {
        return received;
    }

    public final void setReceived(final Date received) {
        this.received = received;
    }

    @Override
    public String toString() {
        return "ChatMessage [message=" + message + ", sender=" + sender
                + ", received=" + received + "]";
    }
}

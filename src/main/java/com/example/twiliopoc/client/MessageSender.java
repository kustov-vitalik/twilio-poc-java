package com.example.twiliopoc.client;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.rest.api.v2010.account.message.Media;
import com.twilio.type.PhoneNumber;
import java.net.URI;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class MessageSender {
  public static void main(String[] args) {
    Twilio.init("AC93134cdb12642147f0a0346512b0f50b", "0a2fad8780686c182b9d5715183bf97b");
    sendTextMsgTpl();
//    sendMediaWithText();
//    sendMedia();
//    sendTextMsg();
//    sendMedia();
//    readMessageMedia();
  }


  static Message sendTextMsg() {
    Message message = Message.creator(
            new PhoneNumber("whatsapp:+5213316064201"),
            new PhoneNumber("whatsapp:+14155238886"),
            "This is a text message"
        )
        .create();

    log.info(message);
    return message;
  }

  static Message sendTextMsgTpl() {
    Message message = Message.creator(
            new PhoneNumber("whatsapp:+5213316064201"),
            new PhoneNumber("whatsapp:+14155238886"),
            "Your login code for Twilio is 12345"
        )
        .create();

    log.info(message);
    return message;
  }

  static Message sendMedia() {
    Message message = Message.creator(
            new PhoneNumber("whatsapp:+5213316064201"),
            new PhoneNumber("whatsapp:+14155238886"),
            ""
        )
        .setMediaUrl(URI.create(
            "https://upload.wikimedia.org/wikipedia/commons/9/9a/Gull_portrait_ca_usa.jpg"))
        .create();

    log.info(message);
    return message;
  }

  static Message sendMediaWithText() {
    Message message = Message.creator(
            new PhoneNumber("whatsapp:+5213316064201"),
            new PhoneNumber("whatsapp:+14155238886"),
            "Owls image. Looks amazing! ;)"
        )
        .setMediaUrl(
            URI.create(
                "https://upload.wikimedia.org/wikipedia/commons/9/9a/Gull_portrait_ca_usa.jpg")
        )
        .create();

    log.info(message);
    return message;
  }

  static void readMessageMedia() {
    var messageSid = "MM66cb8744cad741cdbe5574f3833d8a3b";
    final var mediaResourceSet = Media.reader(messageSid)
        .limit(10)
        .read();

    for (Media media : mediaResourceSet) {
      log.info(media);
    }
  }

}

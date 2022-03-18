package com.example.twiliopoc.server;

import java.util.Arrays;
import javax.servlet.ServletRequest;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class WhatsAppMessageController {

  @PostMapping(value = "message-received", consumes = "application/x-www-form-urlencoded")
  @SneakyThrows
  public void onReceive(ServletRequest request) {
    log.info("RECEIVED_MESSAGE");
    logRequest(request);
  }

  @PostMapping(value = "message-status-updated", consumes = "application/x-www-form-urlencoded")
  @SneakyThrows
  public void messageStatusUpdated(ServletRequest request) {
    log.info("UPDATE_STATUS");
    logRequest(request);
  }

  private void logRequest(ServletRequest request) {
    request.getParameterMap().forEach((k, v) -> log.info("{} => {}", k, Arrays.toString(v)));
  }

}

# twilio-poc-java

Input message example:

```
RECEIVED_MESSAGE
2022-03-18 01:08:17.945  INFO 50876 --- [nio-8088-exec-1] c.e.t.server.WhatsAppMessageController   : MediaContentType0 => [image/jpeg]
2022-03-18 01:08:17.945  INFO 50876 --- [nio-8088-exec-1] c.e.t.server.WhatsAppMessageController   : SmsMessageSid => [MM991a73d7028cddabd954ac1ea2ddc0ca]
2022-03-18 01:08:17.945  INFO 50876 --- [nio-8088-exec-1] c.e.t.server.WhatsAppMessageController   : NumMedia => [1]
2022-03-18 01:08:17.945  INFO 50876 --- [nio-8088-exec-1] c.e.t.server.WhatsAppMessageController   : ProfileName => [Vitaly Kustov]
2022-03-18 01:08:17.945  INFO 50876 --- [nio-8088-exec-1] c.e.t.server.WhatsAppMessageController   : SmsSid => [MM991a73d7028cddabd954ac1ea2ddc0ca]
2022-03-18 01:08:17.945  INFO 50876 --- [nio-8088-exec-1] c.e.t.server.WhatsAppMessageController   : WaId => [5213316064201]
2022-03-18 01:08:17.946  INFO 50876 --- [nio-8088-exec-1] c.e.t.server.WhatsAppMessageController   : SmsStatus => [received]
2022-03-18 01:08:17.946  INFO 50876 --- [nio-8088-exec-1] c.e.t.server.WhatsAppMessageController   : Body => []
2022-03-18 01:08:17.946  INFO 50876 --- [nio-8088-exec-1] c.e.t.server.WhatsAppMessageController   : To => [whatsapp:+14155238886]
2022-03-18 01:08:17.946  INFO 50876 --- [nio-8088-exec-1] c.e.t.server.WhatsAppMessageController   : NumSegments => [1]
2022-03-18 01:08:17.946  INFO 50876 --- [nio-8088-exec-1] c.e.t.server.WhatsAppMessageController   : MessageSid => [MM991a73d7028cddabd954ac1ea2ddc0ca]
2022-03-18 01:08:17.946  INFO 50876 --- [nio-8088-exec-1] c.e.t.server.WhatsAppMessageController   : AccountSid => [AC93134cdb12642147f0a0346512b0f50b]
2022-03-18 01:08:17.946  INFO 50876 --- [nio-8088-exec-1] c.e.t.server.WhatsAppMessageController   : From => [whatsapp:+5213316064201]
2022-03-18 01:08:17.946  INFO 50876 --- [nio-8088-exec-1] c.e.t.server.WhatsAppMessageController   : MediaUrl0 => [https://api.twilio.com/2010-04-01/Accounts/AC93134cdb12642147f0a0346512b0f50b/Messages/MM991a73d7028cddabd954ac1ea2ddc0ca/Media/MEa15a8c291df025cde65f79a42b1a582b]
2022-03-18 01:08:17.946  INFO 50876 --- [nio-8088-exec-1] c.e.t.server.WhatsAppMessageController   : ApiVersion => [2010-04-01]
```
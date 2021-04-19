package me.devtools4.ibkr4j.rest.session;

import feighn.dsljson.DslJsonDecoder;
import feighn.dsljson.DslJsonEncoder;
import feighn.dsljson.IbkrErrorDecoder;
import feign.Client.Default;
import feign.Feign;
import feign.Logger.ErrorLogger;
import feign.Logger.Level;
import feign.Request.Options;
import feign.codec.Decoder;
import feign.codec.Encoder;
import java.util.concurrent.TimeUnit;

public class SessionApiRun {

  public static void main(String args[]) {
    final Decoder decoder = new DslJsonDecoder();
    final Encoder encoder = new DslJsonEncoder();
    SessionApi api = Feign.builder()
        .client(new Default(SSLSocketClient.sslSocketFactory(), (h, ses) -> true))
        .encoder(encoder)
        .decoder(decoder)
        .errorDecoder(new IbkrErrorDecoder(decoder))
        .logger(new ErrorLogger())
        .logLevel(Level.BASIC)
        .options(new Options(10, TimeUnit.SECONDS, 60, TimeUnit.SECONDS, true))
        .target(SessionApi.class, "https://localhost:5000/v1/portal");

    try {
      api.tickle();
    } catch (Exception ex) {
      System.out.println("Error=" + ex.getMessage());
    }
  }
}
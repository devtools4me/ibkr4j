package me.devtools4.ibkr4j.rest.trades;

import feign.RequestLine;
import java.util.List;

public interface TradesApi {
  @RequestLine("GET /iserver/account/trades")
  List<Trade> trades();
}
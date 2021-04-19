package me.devtools4.ibkr4j.rest.fyi;

import feign.RequestLine;
import java.util.List;
import java.util.Map;

public interface FyiApi {

  @RequestLine("GET /fyi/unreadnumber")
  Map<String, Integer> unreadnumber();

  @RequestLine("GET /fyi/settings")
  List<Map<String, Object>> settings();
}
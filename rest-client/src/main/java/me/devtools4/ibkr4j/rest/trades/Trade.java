package me.devtools4.ibkr4j.rest.trades;

import com.dslplatform.json.CompiledJson;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode
@ToString
@CompiledJson
public class Trade {
  private String execution_id;
  private String symbol;
  private String side;
  private String order_description;
  private String trade_time;
  private Integer trade_time_r;
  private String size;
  private String price;
  private String submitter;
  private String exchange;
  private Integer comission;
  private Integer net_amount;
  private String account;
  private String company_name;
  private String contract_description_1;
  private String sec_type;
  private String conidex;
  private String position;
  private String clearing_id;
  private String clearing_name;
  private String order_ref;
}
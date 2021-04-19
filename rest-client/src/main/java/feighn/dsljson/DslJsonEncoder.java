package feighn.dsljson;

import com.dslplatform.json.DslJson;
import feign.RequestTemplate;
import feign.codec.Encoder;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.Charset;

public class DslJsonEncoder implements Encoder {

  private final DslJson json;

  public DslJsonEncoder() {
    this(new DslJson<>());
  }

  public DslJsonEncoder(DslJson json) {
    this.json = json;
  }

  @Override
  public void encode(Object object, Type bodyType, RequestTemplate template) {
    try (ByteArrayOutputStream os = new ByteArrayOutputStream()) {
      json.serialize(object, os);
      template.body(os.toString(Charset.defaultCharset()));
    } catch (IOException ex) {
      throw new IllegalArgumentException(ex);
    }
  }
}
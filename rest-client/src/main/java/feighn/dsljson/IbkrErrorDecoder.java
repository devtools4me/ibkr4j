package feighn.dsljson;

import feign.Response;
import feign.codec.Decoder;
import feign.codec.ErrorDecoder;

public class IbkrErrorDecoder implements ErrorDecoder {

  final Decoder decoder;
  final ErrorDecoder defaultDecoder = new Default();

  public IbkrErrorDecoder(Decoder decoder) {
    this.decoder = decoder;
  }

  @Override
  public Exception decode(String methodKey, Response response) {
    IbkrError error = new IbkrError();
    error.setMessage(defaultDecoder.decode(methodKey, response).getMessage());
    return error;
  }
}
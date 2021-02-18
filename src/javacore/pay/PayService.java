package javacore.pay;

import java.io.IOException;
import java.math.BigDecimal;

public interface PayService {

    void  pay(String appId, String phone, BigDecimal amount) throws IOException;

    void reFund();

    void callback(String orderId);

}

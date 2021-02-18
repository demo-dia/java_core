package javacore.pay;

import com.sun.jndi.toolkit.url.Uri;
import sun.net.www.http.HttpClient;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class iCBCPayService implements PayService{

    @Override
    public void pay(String appId, String phone, BigDecimal amount) throws IOException {
        HttpClient client = HttpClient.New(URI.create("https://gw.open.icbc.com.cn/ui/cardbusiness/aggregatepay/b2c/online/ui/consumepurchaseshowpay/V1").toURL());
        Map<String, String> request = new HashMap<>();
        request.put("app_id", "11111");
        //////////
    }

    @Override
    public void reFund() {
    }

    @Override
    public void callback(String orderId) {
        System.out.println("receive a order id callback pay success");
    }
}

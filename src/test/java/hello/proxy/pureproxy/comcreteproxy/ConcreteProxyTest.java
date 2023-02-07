package hello.proxy.pureproxy.comcreteproxy;

import hello.proxy.pureproxy.comcreteproxy.code.ConcreteClient;
import hello.proxy.pureproxy.comcreteproxy.code.ConcreteLogic;
import org.junit.jupiter.api.Test;

public class ConcreteProxyTest {

    @Test
    void noProxy() {
        ConcreteLogic concreteLogic = new ConcreteLogic();
        ConcreteClient client = new ConcreteClient(concreteLogic);
        client.excute();
    }
}

package hello.proxy.pureproxy.comcreteproxy.code;

public class ConcreteClient {
    private ConcreteLogic concreteLogic;

    public ConcreteClient(ConcreteLogic concreteLogic) {
        this.concreteLogic = concreteLogic;
    }

    public void excute() {
        concreteLogic.operation();
    }
}

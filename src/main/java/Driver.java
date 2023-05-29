import sun.rmi.transport.Transport;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Driver {
    private String name;
    private Transport transport;

    public Driver(String name,Transport transport){
        this.name=name;
        this.transport=transport;
    }
    public void StartTheCar(){
        System.out.println(name+"сел в"+transport);
        transport.start();
    }
    @PostConstruct
    private void init(){
        System.out.println("водитель проснулся");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("водитель уснул");
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", transport=" + transport +
                '}';
    }
}

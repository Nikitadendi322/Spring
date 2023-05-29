import jdk.internal.org.jline.terminal.Size;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sun.rmi.transport.Transport;

@Configuration


public class ApplicationConfig {
    @Bean(name = "bus")
    public Transport getBusBean(){return new Bus();}
    @Bean(name = "car")
    public Transport getCarBean(){return new Car(BodyType.COUPE);}
    @Bean (name = "pickup")
    public Transport getPickupBean(){return new Pickup(LoadCapacity.N1);}
    @Bean(name = "driver1")
    public Driver getDriver1(){return new Driver("Никита",getCarBean());}
    @Bean(name = "driver2")
    public Driver getDriver2(){return new Driver("Дима",getBusBean());}
    @Bean(name = "driver3")
    public Driver getDriver3(){return new Driver("Cаша",getPickupBean());}


}

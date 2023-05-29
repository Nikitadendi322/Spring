import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import sun.rmi.transport.Channel;
import sun.rmi.transport.Endpoint;
import sun.rmi.transport.Transport;

import java.security.AccessControlContext;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data


public class Car extends Transport {
    private BodyType bodyType;


    public void Start(){
        System.out.println("Car Started");
    }

    public Channel getChannel(Endpoint ep) {
        return null;
    }

    public void free(Endpoint ep) {

    }

    protected void checkAcceptPermission(AccessControlContext acc) {

    }
}

import jdk.internal.org.jline.terminal.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import sun.rmi.transport.Channel;
import sun.rmi.transport.Endpoint;
import sun.rmi.transport.Transport;

import java.security.AccessControlContext;

@EqualsAndHashCode
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Bus extends Transport {
    private Size size;


    public void start(){
        System.out.println("Bus Started");
    }

    public Channel getChannel(Endpoint ep) {
        return null;
    }

    public void free(Endpoint ep) {

    }

    protected void checkAcceptPermission(AccessControlContext acc) {

    }
}

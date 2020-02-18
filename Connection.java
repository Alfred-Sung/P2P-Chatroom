import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Base class that all things that need to communicate extends from
 * Gets information about the computer for communication uses later
 */
public class Connection {
    public static InetAddress localMachine;
    public static String hostName;
    public static String nickName;

    protected static final int PORT = 1000;
    protected static final int TIMEOUT = 100;
    protected static DatagramSocket socket;

    static {
        try {
            localMachine = InetAddress.getLocalHost();
            hostName = localMachine.getHostName();
            socket = new DatagramSocket(PORT);

            System.out.println(localMachine.getHostAddress() + " : " + hostName);
        } catch (Exception e) {
            System.out.println(e);
            System.exit(1);
        }
    }
}

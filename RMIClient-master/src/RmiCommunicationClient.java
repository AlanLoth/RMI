


/**
 *
 * @author Emmanuel Oropeza
 */
import java.io.IOException;
import java.rmi.NotBoundException;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RmiCommunicationClient {

    //Operational Classes

    private final Registry _registry;
    private final InterfaceRmiCommunication _interfaceRmiCommunication;
    private final int RMIPort = 1234;

    //Constructors
    public RmiCommunicationClient() throws RemoteException, NotBoundException, IOException {
        System.setProperty("java.security.policy", "java.policy");
        System.setSecurityManager(new RMISecurityManager());
        this._registry = LocateRegistry.getRegistry(1234);
        this._interfaceRmiCommunication = (InterfaceRmiCommunication) _registry.lookup("rmiServer");
    }

    public Float getSuma(float num1, float num2) throws RemoteException {
        return _interfaceRmiCommunication.getSuma(num1, num2);
    }
    public Float getResta(float num1, float num2) throws RemoteException {
        return _interfaceRmiCommunication.getResta(num1, num2);
    }
    public Float getMulti(float num1, float num2) throws RemoteException {
        return _interfaceRmiCommunication.getMulti(num1, num2);
    }
    public Float getDivi(float num1, float num2) throws RemoteException {
        return _interfaceRmiCommunication.getDivi(num1, num2);
    }
    public Float getAre(float num1, float num2) throws RemoteException {
        return _interfaceRmiCommunication.getAre(num1, num2);
    }
    public double getPow(double num1, double num2) throws RemoteException {
        return _interfaceRmiCommunication.getPow(num1, num2);
    }
}

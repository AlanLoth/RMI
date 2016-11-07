
import java.lang.Math;
import java.io.IOException;
import java.rmi.AlreadyBoundException;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.security.spec.InvalidKeySpecException;

public class RMIManager implements InterfaceRmiCommunication {

    //Operational Classes
    private static Registry _registry;
    private static InterfaceRmiCommunication _stub;

    //Constructors
    public RMIManager(int rmiPort) throws IOException, InvalidKeySpecException, Exception {
        _registry = LocateRegistry.createRegistry(rmiPort);
        this._stub = (InterfaceRmiCommunication) UnicastRemoteObject.exportObject(this, 0);

        try {
            System.setProperty("java.security.policy", "java.policy");
            System.setSecurityManager(new RMISecurityManager());
            _registry.bind("rmiServer", _stub);
            System.out.println("Esperando peticiones del cliente...");
        } catch (RemoteException | AlreadyBoundException e) {
            System.out.println("Server exception: " + e.toString());
        }
    }

    @Override
    public Float getSuma(float num1, float num2) throws RemoteException {
        return num1 + num2;
    }

    @Override
    public Float getResta(float num1, float num2) throws RemoteException {
        return num1 - num2;
    }

    @Override
    public Float getMulti(float num1, float num2) throws RemoteException {
        return num1 * num2;
    }

    @Override
    public Float getDivi(float num1, float num2) throws RemoteException {
        return num1 / num2;
    }

    @Override
    public Float getAre(float num1, float num2) throws RemoteException {
        return num1 * num2;
    }

    @Override
    public double getPow(double num1, double num2) throws RemoteException {
        return Math.pow(num1, num2);
    }
}

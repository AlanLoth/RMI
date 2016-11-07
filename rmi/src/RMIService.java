


import java.io.IOException;
import java.net.ServerSocket;
import java.rmi.RemoteException;
import java.security.spec.InvalidKeySpecException;

public class RMIService {

    //Operational Classes

    private static RMIManager _rmiManager;
    private static final int RMIPort = 1234;

    //Constructors
    public RMIService() throws InvalidKeySpecException, IOException, Exception {
        try (ServerSocket serverSocket = new ServerSocket(RMIPort)) {
            System.out.println("puerto disponible...");
            serverSocket.close();
            this._rmiManager = new RMIManager(RMIPort);

        } catch (IOException x) {
            System.out.println("el puerto esta ocupado..." + x);
        }
    }

    public float getSuma(float num1, float num2) throws RemoteException {
        Float _translationRule = _rmiManager.getSuma(num1, num2);
        return _translationRule;
    }
    public float getResta(float num1, float num2) throws RemoteException {
        Float _translationRule = _rmiManager.getResta(num1, num2);
        return _translationRule;
    }
    public float getMulti(float num1, float num2) throws RemoteException {
        Float _translationRule = _rmiManager.getMulti(num1, num2);
        return _translationRule;
    }
    public float getDivi(float num1, float num2) throws RemoteException {
        Float _translationRule = _rmiManager.getDivi(num1, num2);
        return _translationRule;
    }
    public float getAre(float num1, float num2) throws RemoteException {
        Float _translationRule = _rmiManager.getAre(num1, num2);
        return _translationRule;
    }
    public double getPow(double num1, double num2) throws RemoteException {
        double _translationRule = _rmiManager.getPow(num1, num2);
        return _translationRule;
    }
}

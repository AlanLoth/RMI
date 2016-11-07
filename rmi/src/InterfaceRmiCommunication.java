



import java.rmi.*;

public interface InterfaceRmiCommunication extends Remote 
{
    Float getSuma(float num1, float num2) throws RemoteException; 
    Float getResta(float num1, float num2) throws RemoteException; 
    Float getMulti(float num1, float num2) throws RemoteException; 
    Float getDivi(float num1, float num2) throws RemoteException; 
    Float getAre(float num1, float num2) throws RemoteException; 
    double getPow(double num1, double num2) throws RemoteException; 
}

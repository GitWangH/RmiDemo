import java.rmi.Remote;

public interface Hello extends Remote {

    public java.lang.String getMessageStatus(java.lang.String time) throws java.rmi.RemoteException;

}

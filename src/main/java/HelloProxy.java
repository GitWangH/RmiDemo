import java.rmi.RemoteException;

public class HelloProxy implements  Hello {

    private Hello hello = null;
    private String _endpoint = null;
    private void _initGetMirrorBSSoapProxy() {
        try {
            hello = (new HelloLocator()).getGetMirrorBSSoap();
            if (hello != null) {
                if (_endpoint != null)
                    ((javax.xml.rpc.Stub)hello)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
                else
                    _endpoint = (String)((javax.xml.rpc.Stub)hello)._getProperty("javax.xml.rpc.service.endpoint.address");
            }

        }
        catch (javax.xml.rpc.ServiceException serviceException) {}
    }


    public String getMessageStatus(String time) throws RemoteException {
        if (hello == null)
            _initGetMirrorBSSoapProxy();
        return hello.getMessageStatus(time);
    }
}

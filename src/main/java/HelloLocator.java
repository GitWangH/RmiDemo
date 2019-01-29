import javax.xml.rpc.ServiceException;
import java.net.URL;

public class HelloLocator extends org.apache.axis.client.Service implements HelloServer {

    // Use to get a proxy class for GetMirrorBSSoap
    private java.lang.String GetMirrorBSSoap_address = "http://127.0.0.1:57772/csp/jhip/JHIP.MIRRORS.BS.GetMirrorBS.cls";

    // The WSDD service name defaults to getMessageStatusthe port name.
    private java.lang.String GetMirrorBSSoapWSDDServiceName = "GetMirrorBSSoap";
    public String getGetMirrorBSSoapAddress() {
        return GetMirrorBSSoap_address;
    }

    public Hello getGetMirrorBSSoap() throws ServiceException {
        java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(GetMirrorBSSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGetMirrorBSSoap(endpoint);
    }

    public Hello getGetMirrorBSSoap(URL portAddress) throws ServiceException {
        try {
            HelloStub _stub = new HelloStub(portAddress, this);
            _stub.setPortName(getGetMirrorBSSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }


    public java.lang.String getGetMirrorBSSoapWSDDServiceName() {
        return GetMirrorBSSoapWSDDServiceName;
    }
}

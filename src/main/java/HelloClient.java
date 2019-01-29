import com.sun.javaws.Main;

import java.rmi.RemoteException;

public class HelloClient {
        public static void main(String[] args){
            //System.out.print("sss");
            HelloProxy helloProxy = new HelloProxy();
            String w="";
            try {
                w = helloProxy.getMessageStatus("2019-01-28");
                System.out.print("w"+w);
            } catch (RemoteException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }

        }
}

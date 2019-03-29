package mylearn.com.aidlserver;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;

import java.util.List;

public class MyRemoteService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return lBinder;
    }

    AIDLCalc.Stub lBinder = new AIDLCalc.Stub() {
        @Override
        public int addNumbers(int a, int b) throws RemoteException {
            return (a + b);
        }

        @Override
        public int subtractNumbers(int a, int b) throws RemoteException {
            return (a - b);
        }

        @Override
        public int multiplyNumbers(int a, int b) throws RemoteException {
            return (a * b);
        }
    };
}

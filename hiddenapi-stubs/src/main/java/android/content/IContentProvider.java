package android.content;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;

import androidx.annotation.RequiresApi;

public interface IContentProvider extends IInterface {
    Bundle call(String callingPkg, String attributionTag, String authority,
                String method, String arg, Bundle extras) throws RemoteException;

    @RequiresApi(31)
    Bundle call(AttributionSource attributionSource, String authority,
                String method, String arg, Bundle extras) throws RemoteException;
}

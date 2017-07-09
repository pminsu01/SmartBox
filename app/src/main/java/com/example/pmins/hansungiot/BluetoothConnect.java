/*
package com.example.pmins.hansungiot;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Handler;

/**
 * Created by pmins on 2017-07-01.
 */
/*
public class BluetoothConnect {

    private BluetoothAdapter btapater;
    private Activity activity;

    private Handler handler = new Handler();
    private static final int REQUEST_CONNECT_DEVICE = 1;
    private static final int REQUEST_ENABLE_BT = 2;

    public BluetoothConnect(Activity ac, Handler h) {

        activity = ac;
        handler = h;

    }

    public boolean getDevicestate() {

        if(btapater == null){

            return false;
        }

        else {
            return true;
        }
    }

    public void enableadpater() {

        if(btapater.isEnabled()) {

            new BluetoothGet();

        }

        else {

            Intent i = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
            activity.startActivityForResult(i, REQUEST_ENABLE_BT);

        }

    }

}
*/
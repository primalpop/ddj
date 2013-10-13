package com.hack.ddj;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import java.io.IOException;
import java.net.ServerSocket;

public class DDJActivity extends Activity {

    ServerSocket mServerSocket;
    int mLocalPort;
    NsdHelper mNsdHelper;
    public static final String TAG = "DDJ";


    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        initializeServerSocket();
    }

    public void initializeServerSocket() {
        // Initialize a server socket on the next available port.
        try {
            Log.d(TAG, "Creating Socket");
            mServerSocket = new ServerSocket(0);
            mLocalPort =  mServerSocket.getLocalPort();
            mNsdHelper = new NsdHelper(this);
            mNsdHelper.initializeNsd();
            mNsdHelper.registerService(mLocalPort);
            Log.d(TAG, "Socket Created");
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            Log.d(TAG, "Socket creation failed");
        }
    }


}

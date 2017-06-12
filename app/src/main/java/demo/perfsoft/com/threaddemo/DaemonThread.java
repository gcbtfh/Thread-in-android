package demo.perfsoft.com.threaddemo;

import android.util.Log;

/**
 * Created by Tong Hung on 06-Jun-17.
 * Copyright (C) SFR Software.
 */

public class DaemonThread extends Thread {

    @Override
    public void run() {
        super.run();
        int index = 0;
        Log.i("HUNG", "=== Daemon thread start");

        while (true){
            Log.i("HUNG","Daemon thread is running: " + index++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

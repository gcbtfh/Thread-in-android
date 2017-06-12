package demo.perfsoft.com.threaddemo;

import android.util.Log;

/**
 * Created by Tong Hung on 06-Jun-17.
 * Copyright (C) SFR Software.
 */

public class NormalThread extends Thread {

    @Override
    public void run() {
        super.run();

        int index = 0;
        Log.i("HUNG", "=== Normal thread start");

        for(int i=0; i<10; i++){
            Log.i("HUNG","Normal thread is running: " + index++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        Log.i("HUNG", "=== Normal thread stopped");
    }
}

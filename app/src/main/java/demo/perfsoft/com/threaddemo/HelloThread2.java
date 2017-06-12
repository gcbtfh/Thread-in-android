package demo.perfsoft.com.threaddemo;

import android.util.Log;

/**
 * Created by Tong Hung on 05-Jun-17.
 * Copyright (C) SFR Software.
 */

public class HelloThread2 implements Runnable {
    @Override
    public void run() {
        Log.i("HUNG", "Hello thread start");
        int index = 1;

        for(int i=0; i<5; i++){
            Log.i("HUNG", "Hello thread is running: " + index++);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        Log.i("HUNG", "Hello thread stopped");
    }
}

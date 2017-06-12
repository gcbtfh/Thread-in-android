package demo.perfsoft.com.threaddemo;

import android.util.Log;

/**
 * Created by Tong Hung on 05-Jun-17.
 * Copyright (C) SFR Software.
 */

public class HelloThread extends Thread {

    @Override
    public void run() {
        super.run();
        Log.i("HUNG", "Hello Thread start");
        int index = 1;

        for(int i=0; i<10; i++){
            Log.i("HUNG", "Hello thread is running: " + index++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        Log.i("HUNG", "Hello Thread stopped");
    }
}

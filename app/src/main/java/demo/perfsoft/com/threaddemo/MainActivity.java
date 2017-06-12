package demo.perfsoft.com.threaddemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        demoDaemonThread();
    }

    private void useThreadByExtendsThread(){
        Log.i("HUNG", "Main Thread Begin");
        int index = 1;

        for(int i=0; i<2; i++){
            Log.i("HUNG", "Main thread is running: " + index++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        HelloThread helloThread = new HelloThread();
        helloThread.start();

        for(int i=0; i<3; i++){
            Log.i("HUNG", "Main thread is running: " + index++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        Log.i("HUNG", "Main Thread stopped");
    }

    private void useThreadByImplementRunnable() {
        Log.i("HUNG", "Main thread start");

        Thread thread = new Thread(new HelloThread2());
        thread.start();

        Log.i("HUNG", "Main thread stopped");
    }

    private void demoDaemonThread(){
        Log.i("HUNG", "=== Main thread start");

        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setDaemon(true);
        daemonThread.start();

        new NormalThread().start();

        Log.i("HUNG", "=== Main thread stopped");

    }
}

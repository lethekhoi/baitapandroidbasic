package lethekhoi.ltk.hcmus.baitapandroidbasic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //bai tap 1: tong cac phan tu
        int[] array = {1, 4, 14, 30, 33, 58, 77, 99};
        int tong = 0;
        for (int value : array) {
            tong = tong + value;
        }
        Log.d("BBB", tong + "");

    }
}

package lethekhoi.ltk.hcmus.baitapandroidbasic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //bai tap 2: in ra index cua phan tu
        int[] array = {1, 4, 4, 30, 33, 58, 77, 99};
        findIndex(array, 4);

    }

    private void findIndex(int[] array, int number) {
        boolean flag = false;
        int i = 0;
        for (; i < array.length; i++) {
            if (array[i] == number) {
                Log.d("BBB", i + "");
                flag = true;

            }
        }
        if (!flag) {
            Log.d("BBB", "-1");
        }

    }


}

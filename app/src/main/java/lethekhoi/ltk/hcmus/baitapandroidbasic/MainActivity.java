package lethekhoi.ltk.hcmus.baitapandroidbasic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //bai tap 4: xóa phan tử trùng nhau
        int[] array = {1, 4, 4, 30, 33, 58, 77, 77, 30, 99};

        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {

                if (array[i] == array[j]) {
                    int index = j;
                    for (int k = index + 1; k < n; k++) {

                        array[k - 1] = array[k];
                    }
                    n--;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            Log.d("BBB", array[i] + "");
        }

    }


}

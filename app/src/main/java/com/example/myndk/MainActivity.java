package com.example.myndk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.myjni.LoginCtrl;
import com.example.myjni.MtcCallback;
import com.example.myjni.MyLib;
import com.example.myndk.databinding.ActivityMainBinding;
import com.example.myndk.lib.MtcApiCallback;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'myndk' library on application startup.
    static {
        System.loadLibrary("myndk");
        System.loadLibrary("MyLib-jni");
    }

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Example of a call to a native method
        TextView tv = binding.sampleText;
        //tv.setText(new JNITest().sayHello());
        tv.setText(stringFromJNI1() + "" + stringFromJNI());
        MtcApiCallback mtcApiCallback = new MtcApiCallback();
        MyLib.Setcallback(mtcApiCallback);

        tv.setText(MyLib.GetDemoString() + "%%%"+ LoginCtrl.LogoutApsServerCmd() );
    }

    /**
     * A native method that is implemented by the 'myndk' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
    public native String stringFromJNI1();
}
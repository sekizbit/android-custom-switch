package com.sekizbit.android_custom_switch;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class TestActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        final Activity that = this;



        SekizbitSwitch mySwitch = new SekizbitSwitch(findViewById(R.id.sekizbit_switch));
        mySwitch.setOnChangeListener(new SekizbitSwitch.OnSelectedChangeListener() {
            @Override
            public void OnSelectedChange(SekizbitSwitch sender) {
                if(sender.getCheckedIndex() ==0 )
                {
                    Toast.makeText(that,"Left Button Selected",Toast.LENGTH_SHORT).show();
                }
                else if(sender.getCheckedIndex() ==1 )
                {
                    Toast.makeText(that,"Right Button Selected",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

}

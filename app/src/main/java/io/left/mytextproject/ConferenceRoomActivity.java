package io.left.mytextproject;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.AnalogClock;

/**
 * Created by sohag on 12/13/16.
 */

public class ConferenceRoomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conference_room);

        AnalogClock analog = (AnalogClock) findViewById(R.id.analog_clock);
        //analog clock

    }
}

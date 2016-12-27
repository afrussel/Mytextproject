package io.left.mytextproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button introScreen, signUpForm, logInForm, pictureForm, conferenceRoom, conferenceInfo, scheduleButton, viewPagerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        introScreen = (Button) findViewById(R.id.button_introScreen);

        introScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"introScreen Click", Toast.LENGTH_LONG).show();

                Intent i= new Intent(MainActivity.this,IntroScreenActivity.class);
                startActivity(i);

            }
        });


        // Signup form

        signUpForm = (Button) findViewById(R.id.button_signUp);

        signUpForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"button_signUp Click", Toast.LENGTH_LONG).show();

                Intent i= new Intent(MainActivity.this,SignUpActivity.class);
                startActivity(i);

            }
        });

        // Login form

        logInForm = (Button) findViewById(R.id.button_logIn);

        logInForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"button_logIn Click", Toast.LENGTH_LONG).show();

                Intent i= new Intent(MainActivity.this,LogInActivity.class);
                startActivity(i);

            }
        });

        // Picture form

        pictureForm = (Button) findViewById(R.id.button_picture);

        pictureForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"button_picture Click", Toast.LENGTH_LONG).show();

                Intent i= new Intent(MainActivity.this,PictureActivity.class);
                startActivity(i);

            }
        });

        // Conference Room

        conferenceRoom = (Button) findViewById(R.id.button_conference);

        conferenceRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"conferenceRoom Click", Toast.LENGTH_LONG).show();

                Intent i= new Intent(MainActivity.this,ConferenceRoomActivity.class);
                startActivity(i);

            }
        });

        // Conference info

        conferenceInfo = (Button) findViewById(R.id.button_conference_info);

        conferenceInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"conferenceInfo Click", Toast.LENGTH_LONG).show();

                Intent i= new Intent(MainActivity.this,ConferenceInfoActivity.class);
                startActivity(i);

            }
        });

        // schedule info

        scheduleButton = (Button) findViewById(R.id.button_schedule);

        scheduleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"conferenceInfo Click", Toast.LENGTH_LONG).show();

                Intent i= new Intent(MainActivity.this,ScheduleActivity.class);
                startActivity(i);

            }
        });





    }
}

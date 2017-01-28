package com.life.educaching.Route2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.life.educaching.Model.InformationPictureActivity;
import com.life.educaching.Model.Station_Finished_Activity;
import com.life.educaching.R;

/**
 * Created by theresia on 22.01.17.
 */

public class Route2_station4_TaskMultipleActivity extends AppCompatActivity {


    Button buttonNext;
    Button buttonBack;
    private RadioGroup radioGroup;
    private RadioButton radioButton;
    private Button btnDisplay;
    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    public static String input;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_route2_station4_task_multiple);
        addListenerOnButton();
        setTextHeader();

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        preferences = this.getSharedPreferences("prefsDatei1", MODE_PRIVATE);
        editor = preferences.edit();


    }

    public void setTextHeader() {
        TextView myAwesomeTextView = (TextView) findViewById(R.id.text_head);
        myAwesomeTextView.setText("Station 4");
    }




    public void addListenerOnButton() {

        final Context context = this;
        buttonNext = (Button) findViewById(R.id.button_next);
        buttonBack = (Button) findViewById(R.id.button_back);
        buttonNext.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                int selectedId = radioGroup.getCheckedRadioButtonId();

                radioButton = (RadioButton) findViewById(selectedId);
                input = radioButton.getText().toString();

                editor.putString("key2", input);
                editor.commit();
                startActivity(new Intent(context, Route2_station4_Finished.class));
            }
        });

        buttonBack.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                startActivity(new Intent(context, Route2_station4_InfoVideoActivity.class));
            }
        });
    }
}

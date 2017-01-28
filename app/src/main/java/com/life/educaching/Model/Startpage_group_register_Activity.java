package com.life.educaching.Model;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.life.educaching.R;

/**
 * Created by karolin on 18.12.16.
 */

public class Startpage_group_register_Activity extends AppCompatActivity {

    Button buttonNewGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startpage_group_register);
        addListenerOnButton();
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
    }

    public void addListenerOnButton() {

        final Context context = this;
        buttonNewGroup = (Button) findViewById(R.id.button_newgroup);

        buttonNewGroup.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                startActivity(new Intent(context,DecideRouteActivity.class));
            }
        });
    }

}
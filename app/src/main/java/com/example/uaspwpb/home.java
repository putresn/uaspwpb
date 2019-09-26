package com.example.uaspwpb;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home extends AppCompatActivity {

    private Button btCreateDB;
    private Button btViewData;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btCreateDB = (Button) findViewById(R.id.bt_createdata);
        btViewData = (Button) findViewById(R.id.bt_viewdata);

        btCreateDB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(FirebaseDBCreateActivity.getActIntent(home.this));
            }
        });

        btViewData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btViewData.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(home.this,FirebaseDBReadActivity.class);
                        startActivity(intent);
                    }
                });
            }
        });
    }

}

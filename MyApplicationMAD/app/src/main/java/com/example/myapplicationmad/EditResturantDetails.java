package com.example.myapplicationmad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EditResturantDetails extends AppCompatActivity {
    private Button saveResturantDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_resturant_details);

        saveResturantDetails=(Button)findViewById(R.id.save_addProduct);

        saveResturantDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(EditResturantDetails.this,ProductView.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
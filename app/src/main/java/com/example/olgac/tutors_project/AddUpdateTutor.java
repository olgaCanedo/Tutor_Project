package com.example.olgac.tutors_project;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class AddUpdateTutor extends AppCompatActivity {
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        context = this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_update_tutor);

        Button btnAddTutor = (Button) findViewById(R.id.btnAddUser);

        btnAddTutor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TutorsOperations tutorsOperations = new TutorsOperations(context);
                tutorsOperations.open();
                tutorsOperations.addTutor(new Tutor(100,"Olga","Canedo",
                        "Olga@mail.com","47851236",56,67,"Java"));
                tutorsOperations.close();
            }
        });
    }
}

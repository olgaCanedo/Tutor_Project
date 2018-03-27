package com.example.olgac.tutors_project;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class TutorsManagement extends AppCompatActivity {

    public static final String INDEX_TAB = "index_tab";
    private static final String TAG = TutorsManagement.class.getSimpleName();
    private DrawerLayout mDrawerLayout;
    private NavigationView navigationView;
    public static int posIndex;
    private static Intent positionIntent;
    private ViewPager viewPager;
    private TabLayout tabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutors_management);

        tabs = (TabLayout) findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getOrder()) {
            case 10:
                final Intent intent = new Intent(getApplicationContext(), AddUpdateTutor.class);
                startActivity(intent);
                return true;

            case 20:
                displayToast(getString(R.string.action_delete));
                return true;

            case 30:
                displayToast(getString(R.string.action_update));
                return true;

            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);
        }
    }

    public void displayToast(String message){
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onBackPressed(){
        finish();
    }
}

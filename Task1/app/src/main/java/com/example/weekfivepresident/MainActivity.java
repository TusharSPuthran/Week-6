package com.example.weekfivepresident;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.itmExit) {
            MainActivity.this.finish();
            System.exit(0);
        }
        else if( id == R.id.itmToast){
            Toast.makeText(getApplicationContext(),"Toast option clicked", Toast.LENGTH_SHORT).show();
        }
        //else if( id == R.id.itmPresident){
//            Intent presidentPage = new Intent(MainActivity.this, PresidentPage.class);
//            startActivity(presidentPage);
         else if( id == R.id.itmGallery){
            Intent galleryPage = new Intent(MainActivity.this, GalleryActivity.class);
            startActivity(galleryPage);
        }
        return true;
    }
}
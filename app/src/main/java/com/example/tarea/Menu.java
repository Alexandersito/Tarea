package com.example.tarea;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuItem;
//import android.widget.Toolbar;

import androidx.appcompat.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;

public class Menu extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    DrawerLayout mDrawerLayaout;
    NavigationView navigationView;
    Toolbar toolbar;

    ActionBarDrawerToggle toogle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //UI
        mDrawerLayaout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        toolbar = findViewById(R.id.toolbar);

        getSupportFragmentManager().beginTransaction().add(R.id.content,new HomeFragment()).commit();
        setTitle("Home");

        //Setup toolbar
        setSupportActionBar(toolbar);

        toogle = new ActionBarDrawerToggle(this,mDrawerLayaout,toolbar,R.string.drawer_open,R.string.drawer_close);
        mDrawerLayaout.addDrawerListener(toogle);
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        toogle.syncState();
    }

    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        toogle.onConfigurationChanged(newConfig);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        selectItemNav(item);
        return true;
    }

    private void selectItemNav(MenuItem item) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        switch (item.getItemId()){
            case R.id.nav_home:
                ft.replace(R.id.content,new HomeFragment()).commit();
                break;
            case R.id.nav_calculadora:
                ft.replace(R.id.content,new CalculadoraFragment()).commit();
                break;
            case R.id.nav_sonidos:
                ft.replace(R.id.content,new SonidosFragment()).commit();
                break;
            case R.id.nav_maravillas:
                ft.replace(R.id.content,new MaravillasFragment()).commit();
                break;
            case R.id.nav_nosotros:
                ft.replace(R.id.content,new NosotrosFragment()).commit();
                break;
        }
        setTitle(item.getTitle());
        mDrawerLayaout.closeDrawers();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (toogle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
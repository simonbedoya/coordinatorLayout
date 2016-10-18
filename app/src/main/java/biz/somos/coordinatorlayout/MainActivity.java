package biz.somos.coordinatorlayout;

import android.app.Activity;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;

import java.util.ArrayList;

import biz.somos.coordinatorlayout.Adapter.RecyclerAdapter;
import biz.somos.coordinatorlayout.Model.MenuItem;

public class MainActivity extends AppCompatActivity {

    protected RecyclerView recyclerView;
    protected RecyclerView.Adapter adapter;
    protected RecyclerView.LayoutManager lManager;
    protected ArrayList<MenuItem> menuItems;
    protected RecyclerAdapter recyclerAdapter;
    protected Toolbar toolbar;
    protected TabLayout tabLayout;
    protected FloatingActionButton btnFab;
    protected CollapsingToolbarLayout ctLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        toolbar = (Toolbar) findViewById(R.id.appbar);
        setSupportActionBar(toolbar);
        //getSupportActionBar().setTitle("Coordinator");

        ctLayout = (CollapsingToolbarLayout) findViewById(R.id.ctLayout);
        ctLayout.setTitle("Mi aplicación");
        /*tabLayout = (TabLayout) findViewById(R.id.appbartabs);
        tabLayout.setTabMode(TabLayout.MODE_FIXED);
        tabLayout.addTab(tabLayout.newTab().setText("Tab 1"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab 2"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab 3"));*/

        btnFab = (FloatingActionButton) findViewById(R.id.btnFab);
        btnFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Esto es una prueba",Snackbar.LENGTH_SHORT).show();
            }
        });


        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        menuItems = new ArrayList<>();

        for (int i=0; i < 50; i++){
            menuItems.add(new MenuItem("Nombre " + Integer.toString(i),"Musica"));
        }

        recyclerAdapter = new RecyclerAdapter(menuItems);

        lManager = new LinearLayoutManager(this);

        adapter = recyclerAdapter;
        recyclerView.setLayoutManager(lManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }
}

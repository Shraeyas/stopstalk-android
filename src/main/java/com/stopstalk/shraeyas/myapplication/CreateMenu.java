package com.stopstalk.shraeyas.myapplication;

import android.app.Activity;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;

/**
 * Created by Shraeyas on 14-06-2017.
 */

public class CreateMenu extends AppCompatActivity
{
    public CreateMenu(Activity activity)
    {
        NavigationView navigationView = (NavigationView) activity.findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener((NavigationView.OnNavigationItemSelectedListener) activity);

        Menu menu = navigationView.getMenu();

        menu.add(0, 1, 0, "Login").setIcon(R.drawable.ic_email);
        menu.add(0, 2, 0, "LeaderBoard").setIcon(R.drawable.ic_leaderboard);
        menu.add(0, 3, 0, "Profile Page Demo").setIcon(R.drawable.ic_profile);

        menu.addSubMenu("Communicate");
        menu.add(1, 4, 1, "Share").setIcon(R.drawable.ic_menu_share);
        menu.add(1, 5, 1, "Send").setIcon(R.drawable.ic_menu_send);
    }
}

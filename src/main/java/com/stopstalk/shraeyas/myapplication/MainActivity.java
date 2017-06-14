package com.stopstalk.shraeyas.myapplication;

import android.support.design.widget.Snackbar;
import android.view.View;

public class MainActivity extends BaseActivity
{

    public void login(View view)
    {
        Login create_login = new Login(this);
    }

    public void cc(View view)
    {
        Snackbar.make(view, "CodeChef Accuracy", Snackbar.LENGTH_LONG).setAction("Action", null).show();
    }


    public void cf(View view)
    {
        Snackbar.make(view, "Codeforces Accuracy", Snackbar.LENGTH_LONG).setAction("Action", null).show();
    }


    public void he(View view)
    {
        Snackbar.make(view, "Hackerearth Accuracy", Snackbar.LENGTH_LONG).setAction("Action", null).show();
    }

    public void hr(View view)
    {
        Snackbar.make(view,  "HackerRank Accuracy", Snackbar.LENGTH_LONG).setAction("Action", null).show();
    }


    public void uo(View view)
    {
        Snackbar.make(view, "UVa online Accuracy", Snackbar.LENGTH_LONG).setAction("Action", null).show();
    }


    public void so(View view)
    {
        Snackbar.make(view, "SPOJ Accuracy", Snackbar.LENGTH_LONG).setAction("Action", null).show();
    }


}
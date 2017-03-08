package com.uabc.lsc.a01128619.practica4;

import android.app.Activity;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by comp03A on 3/8/17.
 */

public class AdaptadorListView extends BaseAdapter {
    public ArrayList<HashMap<String, String>> list;
    Activity activity;
    TextView txtFirst;
    TextView txtSecond;
    TextView txtThird;
}

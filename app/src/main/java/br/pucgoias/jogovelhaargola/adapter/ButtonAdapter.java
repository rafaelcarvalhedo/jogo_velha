package br.pucgoias.jogovelhaargola.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.RelativeLayout;

import br.pucgoias.jogovelhaargola.R;

public class ButtonAdapter extends BaseAdapter {
    private Context mContext;

    private final int SLOTS_COUNT = 9;
    // Gets the context so it can be used later
    public ButtonAdapter(Context c) {
        mContext = c;
    }

    // Total number of things contained within the adapter
    public int getCount() {
        return SLOTS_COUNT;
    }

    // Require for structure, not really used in my code.
    public Object getItem(int position) {
        return null;
    }

    // Require for structure, not really used in my code. Can
    // be used to get the id of an item in the adapter for
    // manual control.
    public long getItemId(int position) {
        return position;
    }

    public View getView(int position,
                        View convertView, ViewGroup parent) {
        RelativeLayout relativeLayout ;

        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            relativeLayout = new RelativeLayout(mContext);
//            relativeLayout.setGravity(Gravity.CENTER);
//            relativeLayout.setVerticalGravity(Gravity.CENTER_VERTICAL);
//            relativeLayout.setHorizontalGravity(Gravity.CENTER_HORIZONTAL);
//            GridView.LayoutParams layoutParams = new GridView.LayoutParams(177, 177);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(177,177);
            layoutParams.addRule(RelativeLayout.CENTER_IN_PARENT, RelativeLayout.TRUE);
            relativeLayout.setLayoutParams(layoutParams);
//            relativeLayout.getLayoutParams().height = 177;
//            relativeLayout.getLayoutParams().width = 177;
            addCircle(position,relativeLayout,10);
            addCircle(position,relativeLayout, 50);
            addCircle(position,relativeLayout, 100);
        } else {
            relativeLayout = (RelativeLayout) convertView;
        }



        return relativeLayout;
    }

    private void addCircle(int postion,RelativeLayout relativeLayout,int size) {
        Button btn = new Button(mContext);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(size,size);
        layoutParams.addRule(RelativeLayout.CENTER_IN_PARENT, RelativeLayout.TRUE);
        layoutParams.addRule(RelativeLayout.CENTER_HORIZONTAL, RelativeLayout.TRUE);
        btn.setLayoutParams(layoutParams);
        // filenames is an array of strings
        btn.setBackgroundResource(R.drawable.circle_shape);
//        btn.setGravity(Gravity.CENTER);
        btn.setPadding(8, 8, 8, 8);


        relativeLayout.addView(btn);
    }
}
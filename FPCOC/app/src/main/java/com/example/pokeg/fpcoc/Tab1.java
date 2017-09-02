package com.example.pokeg.fpcoc;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by pokeg on 9/1/2017.
 */

public class Tab1 extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab1welcome, container, false);

        // making hyperlink to FPCOC website
        TextView tv_Website = (TextView)rootView.findViewById(R.id.tv_Website);
        tv_Website.setClickable(true);
        tv_Website.setMovementMethod(LinkMovementMethod.getInstance());
        String text = "<a href='http://www.thefpcoc.com'> Visit us at theFPCOC.com </a>";
        tv_Website.setText(Html.fromHtml(text));

        return rootView;
    }



}

package com.waxvas.poster;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.vk.sdk.VKSdk;


public class AccountsFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //just change the fragment_dashboard
        //with the fragment you want to inflate
        //like if the class is HomeFragment it should have R.layout.home_fragment
        //if it is DashboardFragment it should have R.layout.fragment_dashboard

        View view = inflater.inflate(R.layout.fragment_accounts, null);

        Button loginVK = (Button) view.findViewById(R.id.buttonVK);
        loginVK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               VKSdk.login(getActivity());
            }
        });

        return view;
    }
}

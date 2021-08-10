package com.rd.asynchttpclient.AsyncHttpClient.fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.rd.asynchttpclient.R;

import butterknife.BindView; // import butterknife to graddle for binding the view of fragment
import butterknife.ButterKnife;


public class LoginFragment extends Fragment {
    @BindView(R.id.username)
    EditText username;
    @BindView(R.id.password)
    EditText password;
    @BindView(R.id.loginBtn)
    Button loginBtn;

    @BindView(R.id.signUp)
    TextView signUp;

    public static LoginFragment newInstance(){
        LoginFragment fragment = new LoginFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView( LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_signin, container, false);
        ButterKnife.bind(this,view);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initComponents();
    }

    private void initComponents(){
        loginBtn.setOnClickListener(v -> {
            Toast.makeText(getContext(), "Success", Toast.LENGTH_LONG).show();
        });

        signUp.setOnClickListener(v -> {
            RegisterFragment registerFragment  = RegisterFragment.newInstance();
          getFragmentManager().beginTransaction().replace(R.id.content_view, registerFragment).commit();
        });
    }
}

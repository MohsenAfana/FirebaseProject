package com.mohsenafana.firebaseproject;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RegistrationActivity extends AppCompatActivity {

    @BindView(R.id.nameET)
    TextInputLayout nameET;
    @BindView(R.id.passwordET)
    TextInputLayout passwordET;
    @BindView(R.id.SignUP)
    MaterialButton SignUP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.SignUP)
    public void onViewClicked() {
        String name= nameET.getEditText().toString().trim();
        String password=passwordET.getEditText().toString().trim();
        if (TextUtils.isEmpty(name)){
            nameET.setError("Name Required..");
            return;
        }
        if (TextUtils.isEmpty(password)){
            passwordET.setError("password Required..");
            return;
        }


    }
}

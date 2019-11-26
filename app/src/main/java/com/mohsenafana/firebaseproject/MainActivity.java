package com.mohsenafana.firebaseproject;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.nameET)
    TextInputLayout nameET;
    @BindView(R.id.passwordET)
    TextInputLayout passwordET;
    @BindView(R.id.sign_In_button)
    MaterialButton signInButton;
    @BindView(R.id.sign_Up_button)
    MaterialButton signUpButton;
    @BindView(R.id.sign_In_facebook)
    MaterialButton signInFacebook;
    @BindView(R.id.sign_In_twitter)
    MaterialButton signInTwitter;
    @BindView(R.id.sign_In_gmail)
    MaterialButton signInGmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.sign_Up_button)
    public void onSignUpButtonClicked() {
        startActivity(new Intent(this,RegistrationActivity.class));
    }

    @OnClick(R.id.sign_In_facebook)
    public void onSignInFacebookClicked() {
    }

    @OnClick(R.id.sign_In_twitter)
    public void onSignInTwitterClicked() {
    }

    @OnClick(R.id.sign_In_gmail)
    public void onSignInGmailClicked() {
    }
}

package com.example.coffeeshop;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EmailFragment extends Fragment {

    EditText editTextSubject, editTextContent, editTextToEmail;
    Button button;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_email, container, false);

        // Initialize your views here
        button = rootView.findViewById(R.id.btnSend);
        editTextSubject = rootView.findViewById(R.id.subject);
        editTextContent = rootView.findViewById(R.id.content);
        editTextToEmail = rootView.findViewById(R.id.to_email);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String subject, content, to_email;
                subject = editTextSubject.getText().toString();
                content = editTextContent.getText().toString();
                to_email = editTextToEmail.getText().toString();

                if (subject.isEmpty() || content.isEmpty() || to_email.isEmpty()) {
                    Toast.makeText(getContext(), "All fields are required", Toast.LENGTH_SHORT).show();
                } else {
                    sendEmail(subject, content, to_email);
                }
            }
        });
        return rootView;
    }


    public void sendEmail(String subject, String content, String to_email){
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{to_email});
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        intent.putExtra(Intent.EXTRA_TEXT, content);
        intent.setType("message/rfc822");
        startActivity(Intent.createChooser(intent,"Choose email client:"));

    }
}
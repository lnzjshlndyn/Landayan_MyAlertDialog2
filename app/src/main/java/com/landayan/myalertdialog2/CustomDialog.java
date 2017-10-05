package com.landayan.myalertdialog2;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by JOSH on 10/5/2017.
 */

public class CustomDialog extends DialogFragment {
    LayoutInflater inflater;
    View view;
    EditText etUsername, etPassword;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        inflater = getActivity().getLayoutInflater();
        view = inflater.inflate(R.layout.login_dialog,null);

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setView(view);
        builder.setPositiveButton("Login", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                etUsername = view.findViewById(R.id.etUsername);
                etPassword = view.findViewById(R.id.etPassword);
                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();
                String msg = "Username is " + username + ", Password is " + password;
                Toast.makeText(getActivity(), msg, Toast.LENGTH_SHORT).show();
            }
        });

        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });

        Dialog dialog = builder.create();
        return builder.create();
    }


}

package com.example.myapplication;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

import com.example.myapplication.databinding.DialogLayoutBinding;

/**
 * Created by Abhinav Singh on 16,June,2020
 */
public class CustomDialog extends AppCompatDialogFragment {
    private DialogLayoutBinding binding;
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        binding = DialogLayoutBinding.inflate(LayoutInflater.from(getContext()));
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setView(binding.getRoot());

        binding.dialogTextView.setText("I am Dialog's TextView");

        return builder.create();
    }
}

package com.example.android.droidcafeinput;

import android.app.DatePickerDialog;

import androidx.fragment.app.DialogFragment;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.DatePicker;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


import java.util.Calendar;

public class DatePickerFragment extends DialogFragment
        implements DatePickerDialog.OnDateSetListener  {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        // Utiliser la date actuelle comme date par défaut dans le sélecteur.
        final Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);

// Créer une nouvelle instance de DatePickerDialog et la retourner.
        return new DatePickerDialog(getActivity(), this, year, month, day);

    }

    @Override
    public void onDateSet(DatePicker datePicker,
                          int year, int month, int day) {
        OrderActivity activity = (OrderActivity) getActivity();
        activity.processDatePickerResult(year, month, day);

    }
}



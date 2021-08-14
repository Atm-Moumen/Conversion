package com.example.conversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class money extends AppCompatActivity {

    TextView resultat;
    EditText montant;
    Float nbr;
    int choix = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.money);
        resultat = (TextView)findViewById(R.id.resultat_);
        montant = (EditText)findViewById(R.id.montant_);
    }
    public  void auClic(View view)
    {
        nbr = Float.parseFloat(montant.getText().toString());
        if(choix == 1)
        {
            nbr = nbr * 2000f;
        }
        else{
            nbr = nbr * 0.5020f;
        }
        String message = String.valueOf(nbr) ;

        resultat.setText(message);
    }
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.btn1:
                if (checked)
                    choix = 1;
                break;
            case R.id.btn2:
                if (checked)
                    choix = 2;
                break;
        }
    }
}
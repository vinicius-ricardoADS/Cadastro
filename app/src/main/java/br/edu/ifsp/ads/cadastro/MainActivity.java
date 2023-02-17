package br.edu.ifsp.ads.cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText nameTx;

    private EditText phoneTx;

    private EditText emailTx;

    private CheckBox emailCk;

    private RadioGroup radioGroupSx;

    private EditText cityTx;

    private Spinner spinnerUf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameTx = findViewById(R.id.inputNome);
        phoneTx = findViewById(R.id.inputTelefone);
        emailTx = findViewById(R.id.inputEmail);
        cityTx = findViewById(R.id.inputCidade);
        emailCk = findViewById(R.id.checkBox);
        spinnerUf = findViewById(R.id.ufSp);

        RadioGroup group = (RadioGroup) findViewById(R.id.sexo);

        Button save = findViewById(R.id.button2); // botão de salvar

        Button clear = findViewById(R.id.button); // botão de limpar

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                emailCk.setChecked(false);
                nameTx.setText("");
                phoneTx.setText("");
                cityTx.setText("");
                emailTx.setText("");
            }
        });

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Formulario form;
                RadioButton button = (RadioButton) group.findViewById(R.id.radioButtonM);
                if (button.isActivated()) {
                    form = new Formulario(nameTx.getText().toString(), phoneTx.getText().toString(), emailTx.getText().toString(),
                            button.getText().toString(), cityTx.getText().toString(), spinnerUf.getSelectedItem().toString());
                } else {
                    button = (RadioButton) group.findViewById(R.id.radioButtonF);
                    form = new Formulario(nameTx.getText().toString(), phoneTx.getText().toString(), emailTx.getText().toString(),
                            button.getText().toString(), cityTx.getText().toString(), spinnerUf.getSelectedItem().toString());
                }
                Toast.makeText(getApplicationContext(), form.toString(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}

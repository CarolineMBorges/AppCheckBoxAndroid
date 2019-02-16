package checkbox.cursoandroid.com.checkbox;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private CheckBox checkBoxCao;
    private CheckBox checkBoxGato;
    private CheckBox checkBoxPapagaio;

    private Button botaoMostrar;
    private TextView textExibicao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBoxCao = findViewById(R.id.checkBoxCaoId);
        checkBoxGato = findViewById(R.id.checkBoxGatoId);
        checkBoxPapagaio = findViewById(R.id.checkBoxPapagaioId);

        botaoMostrar = findViewById(R.id.botaoMostrarId);
        textExibicao = findViewById(R.id.textoExibicaoId);

        botaoMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String itensSelecionados = "";

                itensSelecionados = "Item: " + checkBoxCao.getText() + " Status: " + checkBoxCao.isChecked() + "\n" ;
                itensSelecionados += "Item: " + checkBoxGato.getText() + " Status: " + checkBoxGato.isChecked() + "\n" ;
                itensSelecionados += "Item: " + checkBoxPapagaio.getText() + " Status: " + checkBoxPapagaio.isChecked();


                textExibicao.setText(itensSelecionados);
            }
        });
    }
}

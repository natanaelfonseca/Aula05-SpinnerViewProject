package br.com.treinamento;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity implements AdapterView.OnItemSelectedListener {

    private String[] mStrings = new String[]{ "Joao", "Maria", "Jose", "Henrique", "Carlos", "Hernani"  };

    private Spinner mSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main);

        mSpinner = (Spinner) findViewById( R.id.spinner );

        ArrayAdapter<String> adapter = new ArrayAdapter<String>( this, android.R.layout.simple_spinner_item,mStrings );
        mSpinner.setAdapter( adapter );
        mSpinner.setOnItemSelectedListener( this );

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        int index = adapterView.getSelectedItemPosition();
        Toast.makeText( getBaseContext(), "Selecionado o item " + index, Toast.LENGTH_SHORT );
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {}

}

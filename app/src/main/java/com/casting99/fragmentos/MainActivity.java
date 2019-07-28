package com.casting99.fragmentos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, Fragmento1.OnFragmentInteractionListener, Fragmento2.OnFragmentInteractionListener {

    Button btnFr1, btnFr2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragmento1 frag1 = new Fragmento1();

        getSupportFragmentManager().beginTransaction().add(R.id.container, frag1);

        btnFr1 = (Button)findViewById(R.id.btnFrag1);
        btnFr2 = (Button)findViewById(R.id.btnFrag2);

        btnFr1.setOnClickListener(this);
        btnFr2.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.btnFrag1:

                Fragmento1 mfrag1 = new Fragmento1();
                FragmentTransaction transition1 = getSupportFragmentManager().beginTransaction();
                transition1.replace(R.id.container, mfrag1);
                transition1.commit();
                break;

            case R.id.btnFrag2:

                Fragmento2 frag2 = new Fragmento2();
                FragmentTransaction transition2 = getSupportFragmentManager().beginTransaction();
                transition2.replace(R.id.container, frag2);
                transition2.commit();
                break;

        }

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}

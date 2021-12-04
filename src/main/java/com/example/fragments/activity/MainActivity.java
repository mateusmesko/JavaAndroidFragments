package com.example.fragments.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.example.fragments.R;
import com.example.fragments.fragment.ContatosFragment;
import com.example.fragments.fragment.ConversaFragment;

public class MainActivity extends AppCompatActivity {

    private Button buttonConversa, buttonContato;
    private ConversaFragment conversaFragment;
    private ContatosFragment contatosFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //remover sombra
        getSupportActionBar().setElevation(0);

        buttonContato= findViewById(R.id.buttonContatos);
        buttonConversa=findViewById(R.id.buttonConversas);
        conversaFragment=new ConversaFragment();

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameConteudo,conversaFragment);
        transaction.commit();

        buttonContato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                contatosFragment = new ContatosFragment();

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo,contatosFragment);
                transaction.commit();
            }
        });

        buttonConversa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                conversaFragment=new ConversaFragment();

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo,conversaFragment);
                transaction.commit();
            }
        });
    }
}

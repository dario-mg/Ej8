package com.example.ej8;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Onboarding1Fragment extends Fragment {

    Button botonSiguiente;
    TextView textoIrAlHome;
    NavController navController;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_onboarding1, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);

        botonSiguiente = view.findViewById(R.id.botonSiguiente);
        textoIrAlHome = view.findViewById(R.id.textoIrAlHome);

        // Navegar al siguiente fragmento de onboarding
        botonSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_onboarding1Fragment_to_onboarding2Fragment);
            }
        });

        // Navegar directamente al Home con animación de desvanecimiento
        textoIrAlHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_onboarding1Fragment_to_homeFragment);
            }
        });
    }
}

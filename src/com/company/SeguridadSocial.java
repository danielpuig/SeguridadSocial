package com.company;

import java.util.List;
import java.util.ArrayList;

public class SeguridadSocial {

    private List<Persona> personasList;

    public SeguridadSocial() {

        personasList = new ArrayList<>();

    }

// Debes comprobar que no se introduzcan dos personas con el mismo DNI/Número Seguridad Social

    public void altaPersona(Persona persona) {

        for(int i = 0; i<personasList.size(); i++) {
            
        }

    }

    public void bajaPersona(String dni) {

    }

    public Persona obtenerPersonaPorDNI(String dni) {

    }

    public Persona obtenerPersonaPorNumSS(String numSS) {

    }

    public List<Persona> obtenerPersonasRangoSalarial(double min, double max){

    }

    public List<Persona> obtenerPersonasMayoresQue(int edad){

    }

    public List<Persona> obtenerTodas(){

    }

    @Override

    public String toString() {

        return "SeguridadSocial{" +

                "personasList=" + personasList +

                '}';

    }

}
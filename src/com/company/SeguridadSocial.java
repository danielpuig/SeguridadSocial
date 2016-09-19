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
        boolean valid = true;
        for(int i = 0; i<personasList.size(); i++) {
            if (persona.equals(personasList.get(i))) {
                valid = false;
                break;
            }
            else {
                valid = true;
            }
        }

        if(valid == true) {
            personasList.add(persona);
        }

    }

    public void bajaPersona(String dni) {
        boolean valid = false;
        int e = 0;
        for(int i = 0; i<personasList.size(); i++) {
            if (dni == personasList.get(i).getDni()) {
                valid = true;
                e = i;
                break;
            }
            else {
                valid = false;
            }
        }

        if(valid == true) {
            personasList.remove(e);
        }
    }

    public Persona obtenerPersonaPorDNI(String dni) {
        boolean valid = true;
        int e = 0;
        for(int i = 0; i<personasList.size(); i++) {
            if (dni == personasList.get(i).getDni()) {
                valid = true;
                e = i;
                break;
            }
            else {
                valid = false;
            }
        }

        if(valid == true) {
            return personasList.get(e);
        }
        else {
            return null;
        }
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
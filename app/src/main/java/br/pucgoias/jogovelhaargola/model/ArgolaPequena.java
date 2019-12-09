package br.pucgoias.jogovelhaargola.model;

public class ArgolaPequena implements Argola {

    @Override
    public int getNivelArgola() {
        return NivelArgola.PEQUENA.getNivel();
    }
}

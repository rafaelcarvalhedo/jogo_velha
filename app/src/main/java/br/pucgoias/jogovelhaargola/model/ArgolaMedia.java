package br.pucgoias.jogovelhaargola.model;

public class ArgolaMedia implements Argola {
    @Override
    public int getNivelArgola() {
        return NivelArgola.MEDIA.getNivel();
    }
}

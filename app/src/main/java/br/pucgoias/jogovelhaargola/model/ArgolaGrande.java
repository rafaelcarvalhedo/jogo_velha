package br.pucgoias.jogovelhaargola.model;

public class ArgolaGrande implements Argola {
    @Override
    public int getNivelArgola() {
        return NivelArgola.GRANDE.getNivel();
    }
}

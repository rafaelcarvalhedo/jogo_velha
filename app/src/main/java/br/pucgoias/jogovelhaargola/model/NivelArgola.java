package br.pucgoias.jogovelhaargola.model;

public enum NivelArgola {

    PEQUENA(1),
    MEDIA(2),
    GRANDE(3);

    private int nivel;

    NivelArgola(int nivel) {
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }
}

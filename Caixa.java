//PROVA
package net.mauro;
//Comentari en lka mateixa linia....
//hola
public class Caixa {
//prova de comentari
    boolean oberta;
    int amplada;
    int altura;
    String material;

    //crear constructor de la caixa
    public Caixa(){
        oberta = true;
        material = "Cartró";

    }
    public Caixa(boolean estaoberta){
        oberta = estaoberta;


    }



    public Caixa(boolean b, String string) {
        // TODO Auto-generated constructor stub
        oberta = b;
        material = string;
    }
    public int getAmplada() {
        return amplada;
    }

    public void setAmplada(int amplada) {
        this.amplada = amplada;
    }

    public boolean isOberta(){
        return  oberta;
    }

    public void obre(){
        oberta = true;
    }

    public void tanca(){
        oberta = false;
    }
    public boolean compara(Caixa nova){
        return this.amplada == nova.getAmplada();
    }



}

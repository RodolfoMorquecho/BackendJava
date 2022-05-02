package practicaComic;

import imonsh.Screen;

public class Comic {
    public static void main(String[] args) {

        showHistorieta();
    }

    public static void showHistorieta(){
        //Creamos un objeto del tipo Screen para la pantalla que mostrara las imagenes y lo configuramos segun las medidas
        Screen sComic = new Screen("Sensatez y Censura");
        sComic.setVisible(true);
        sComic.setBounds(500, 15, 515, 800);

        //Creamos un hilo(pages), y se pasara los parametros del objeto anterior(sComic) al contructor de -
        // la clase PaginasAlgoritmo para que se imprima una imagen cada 6 seg aprox.
        Thread pages = new Thread(new PaginasAlgoritmo(sComic));
        pages.start();


        //Creamos un objeto de tipo Screen para la pantalla que mostrara los dialogos
        Screen sDialogos = new Screen("Sensatez y Censura");
        sDialogos.setVisible(true);
        sDialogos.setBounds(1000, 15, 515, 800);

        //Creamos un objeto de nuestra clase "TextoHistorieta" para acceder a sus metodos implementados
        TextoHistorieta texto = new TextoHistorieta();

        //Segunda forma de crear un hilo
        //Implementamos el metodo 'run' de la interface Runnable, en el cual indicaremos el orden y tiempos de los dialogos
        Runnable text = new Runnable() {
            @Override
            public void run() {
                try {
                    texto.pagPortada(sDialogos);
                    Thread.sleep(5710);
                    texto.pagUno(sDialogos);
                    Thread.sleep(5710);
                    texto.pagDos(sDialogos);
                    Thread.sleep(5710);
                    texto.pagTres(sDialogos);
                    Thread.sleep(5710);
                    texto.pagCuatro(sDialogos);
                    Thread.sleep(5710);
                    texto.pagCinco(sDialogos);
                    Thread.sleep(5710);
                    texto.pagSeis(sDialogos);
                    Thread.sleep(5710);
                    texto.pagSiete(sDialogos);
                    Thread.sleep(5710);
                    texto.pagOcho(sDialogos);
                    Thread.sleep(5710);
                    texto.pagNueve(sDialogos);
                    Thread.sleep(5710);
                    texto.pagDiez(sDialogos);
                    Thread.sleep(5710);
                    texto.pagOnce(sDialogos);
                    Thread.sleep(5710);
                    texto.pagDoce(sDialogos);
                    Thread.sleep(5710);
                    texto.pagTrece(sDialogos);
                    Thread.sleep(5710);
                    texto.pagCatorce(sDialogos);
                    Thread.sleep(5710);
                    texto.pagQuince(sDialogos);
                    Thread.sleep(5710);
                    texto.pagDieciseis(sDialogos);
                    Thread.sleep(5710);
                    texto.pagDiecisiete(sDialogos);
                    Thread.sleep(5710);
                    texto.pagDieciocho(sDialogos);
                    Thread.sleep(5710);
                    texto.pagDiecinueve(sDialogos);
                    Thread.sleep(5710);
                    texto.pagVeinte(sDialogos);
                    Thread.sleep(5710);
                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        };

        //Creamos un hilo(textos) con la informacion del metodo run que contiene la interface Runnable "text"
        Thread textos = new Thread(text);
        textos.start();
    }
}

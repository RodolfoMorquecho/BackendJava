package practicaMultiverse;

import imonsh.Screen;

public class SpiderVerse {
    public static void main(String[] args) throws InterruptedException{
        TestPersonajes();
    }

    private static void TestPersonajes() throws InterruptedException{
        //Creamos un objeto de tipo "Screen" para trabajar con la interface grafica
        Screen screen = new Screen();

        //         Construccion del Objeto
        //Creamos un objeto de tipo "AnyaCorazon" al cual le asignamos valores a los campos
        AnyaCorazon anya = new AnyaCorazon(
                "Anya Corazon",
                "Spider-Girl",
                "Femenino",
                "Amazing Fantasy #1",
                "Tierra 616"
        );

        //Implementamos la interface Runnable de manera anonima
        //Le indicamos que ejecute todas las habilidades dentro de ella(metodos)
        Runnable poderesAn = new Runnable() {
            @Override
            public void run() {
                try {
                    //AnyaCorazon
                    anya.espirituCazador(screen);
                    Thread.sleep(3000);
                    anya.caparazon(screen);
                    Thread.sleep(3000);
                    anya.camuflajeSombrio(screen);
                    Thread.sleep(3000);

                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        };
        Thread poderesAnya = new Thread(poderesAn);
        poderesAnya.start();
        poderesAnya.join(9000);

        //Personaje: Cindy Moon
        CindyMoon cindy = new CindyMoon(
                "Cindy Moon",
                "Silk",
                "Femenino",
                "Amazing Spider-Man Vol. 3 #1",
                "Tierra 616"
        );

        Runnable poderesCi = new Runnable() {
            @Override
            public void run() {
                try {
                    cindy.memoriaEidetica(screen);
                    Thread.sleep(3000);
                    cindy.garrasRetractiles(screen);
                    Thread.sleep(3000);
                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        };

        Thread poderesCindy = new Thread(poderesCi);
        poderesCindy.start();
        poderesCindy.join(6000);

        MiguelOhara migue = new MiguelOhara(
                "Miguel O'hara",
                "Spider-Man 2099",
                "Masculino",
                "Amazing Spider-Man Vol 1 #365",
                "Tierra 928"
        );

        Runnable poderesMi = new Runnable() {
            @Override
            public void run() {
                try {
                    migue.senueloAcelerado(screen);
                    Thread.sleep(3000);
                    migue.fuerzaSobrehumana(screen);
                    Thread.sleep(3000);
                    migue.curacionAcelerada(screen);
                    Thread.sleep(3000);
                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        };

        Thread poderesMiguel = new Thread(poderesMi);
        poderesMiguel.start();
    }


}

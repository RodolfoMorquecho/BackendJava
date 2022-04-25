package practicaMona;

public class Sentrytocat extends Octocat{
    public Sentrytocat(){
        setNombre("Sentrytocat");
        setAspecto("Casco con lampara, traje contra fuego, botas negras, manguera de agua");
        setId(141);
    }

    @Override
    public void mision() {
        System.out.println("Objetivo: Apagar cualquier incendio que aqueje a la ciudad");
    }
}

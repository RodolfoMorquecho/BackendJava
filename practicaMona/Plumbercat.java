package practicaMona;

public class Plumbercat extends Octocat{
    public Plumbercat(){
        setNombre("Plumbercat");
        setAspecto("Gorra roja con una M, overol de mezclilla azul, guantes blancos, bigote curvo");
        setId(58);
    }

    @Override
    public void mision() {
        System.out.println("Objetivo: Rescatar a una princesa de un dragon y limpiar tuberias ocasionalmente");
    }
}

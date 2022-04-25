package practicaMona;

public class Grinchtocat extends Octocat{
    public Grinchtocat(){
        setNombre("Grinchtocat");
        setAspecto("Traje de santa claus, pelaje verde pasto, ojos amarillentos");
        setId(109);
    }

    @Override
    public void mision() {
        System.out.println("Objetivo: Robarse la navidad con la complicidad de su perrito");
    }
}
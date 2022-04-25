package practicaMona;

public class Constructocat extends Octocat{
    public Constructocat(){
        setNombre("Constructocat");
        setAspecto("Casco de seguridad amarillo, llave inglesa para cualquier desajuste");
        setId(30);
    }

    @Override
    public void mision() {
        System.out.println("Objetivo: Contruir los puentes mas seguros de la ciudad");
    }
}

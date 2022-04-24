package practicaHarry;

public class camaraSecreta {
    public static void main(String[] args) {
        ronWeasley();
        albusDumbledore();
        severusSnape();
        siriusBlack();
        newtScamander();
    }

    //Trabajaremos este caso mediante constructor
    private static void ronWeasley(){
        Personaje ron = new Personaje("Gryffindor", "Masculino", "Ron Weasley", "Acromantula", "Jack Russel Terrier");
        System.out.println(ron.showMessage());
        System.out.println("****************************");
    }
    //Trabajaremos este caso mediante setters
    private static void albusDumbledore(){
        Personaje albus = new Personaje();
        albus.setCasa("Gryffindor");
        albus.setGenero("Masculino");
        albus.setNombre("Albus Dumbledore");
        albus.setBoggart("Su hermana Ariana");
        albus.setPatronus("Fenix");
        System.out.println(albus.showMessage());
        System.out.println("****************************");
    }
    //Trabajaremos este caso mediante getters y parametros
    private static void severusSnape(){
        Personaje severus = new Personaje("Slytherin", "Masculino", "Severus Snape", "Ver a Lili muerta", "Cierva");
        System.out.println("Casa: "+severus.getCasa());
        System.out.println("Genero: "+severus.getGenero());
        System.out.println("Nombre: "+severus.getNombre());
        System.out.println("Boggart: "+severus.getBoggart());
        System.out.println("Patronus: "+severus.getPatronus());
        System.out.println("****************************");
    }
    //Trabajaremos este caso mediante setters y getters
    private static void siriusBlack(){
        Personaje sirius = new Personaje();
        sirius.setCasa("Gryffindor");
        sirius.setGenero("Masculino");
        sirius.setNombre("Sirius Black");
        sirius.setBoggart("Dementores");
        sirius.setPatronus("Perro Negro");
        System.out.println("Casa: "+sirius.getCasa());
        System.out.println("Genero: "+sirius.getGenero());
        System.out.println("Nombre: "+sirius.getNombre());
        System.out.println("Boggart: "+sirius.getBoggart());
        System.out.println("Patronus: "+sirius.getPatronus());
        System.out.println("****************************");
    }
    private static void newtScamander(){
        Personaje newt = new Personaje("Hufflepuff", "Masculino", "Newt Scamander", "Extincion de especies animales", "Kelpie");
        System.out.println(newt.showMessage());
        System.out.println("****************************");
    }
}

package practicaMona;

public class TestOctacats {
    public static void main(String[] args) {
        octocat();
        grinchtocat();
        plumbercat();
        sentrytocat();
        homercat();
        constructocat();
    }

    static void octocat(){
        Octocat octoc = new Octocat();
        System.out.println(octoc.showMessage());
        octoc.mision();
        System.out.println("++++++++++++++++++++++++++++");
    }

    static void grinchtocat(){
        Grinchtocat grincho = new Grinchtocat();
        System.out.println(grincho.showMessage());
        grincho.mision();
        System.out.println("++++++++++++++++++++++++++++");
    }

    static void plumbercat(){
        Plumbercat plumberc = new Plumbercat();
        System.out.println(plumberc.showMessage());
        plumberc.mision();
        System.out.println("++++++++++++++++++++++++++++");
    }

    static void sentrytocat(){
        Sentrytocat sentry = new Sentrytocat();
        System.out.println(sentry.showMessage());
        sentry.mision();
        System.out.println("++++++++++++++++++++++++++++");
    }

    static void homercat(){
        Octocat homerc = new Octocat();
        homerc.setNombre("Homercat");
        homerc.setAspecto("Tez Amarillenta, poco pelo, camisa blanca, pantalon azul");
        homerc.setId(80);
        System.out.println(homerc.showMessage());
        homerc.mision("Objetivo: Tratar de no volar una planta nuclear");
        System.out.println("++++++++++++++++++++++++++++");
    }

    static void constructocat(){
        Constructocat conoct = new Constructocat();
        System.out.println(conoct.showMessage());
        conoct.mision();
        System.out.println("++++++++++++++++++++++++++++");
    }
}

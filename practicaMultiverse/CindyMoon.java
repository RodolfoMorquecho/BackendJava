package practicaMultiverse;

import imonsh.Screen;

import java.awt.*;

public class CindyMoon extends Spiderman implements CindyHabilidades{
    public CindyMoon(String nombre, String alias, String genero, String aparicion1, String tierraOrigen){
        super(nombre, alias, genero, aparicion1, tierraOrigen);
    }

    @Override
    public void memoriaEidetica(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out(showMessage(), "Comic Sans MS",18, Color.BLUE);
        s.showImage("C://Users//1044467//IdeaProjects//DemoLaunchX//src//practicaMultiverse//assets//memoriaEid.jpg");
        s.out("\n\nMemoria Eidetica: Silk puede recordar cualquier cosa que hayan visto u oído, incluso aunque " +
                "lo haya percibido una sola vez y de forma fugaz. " +
                "Esta habilidad la posee desde que era una niña.", "Comic Sans MS",20, Color.red);
        s.setBounds(500,40,1000,750);
    }

    @Override
    public void garrasRetractiles(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out(showMessage(),"Comic Sans MS",18, Color.BLUE);
        s.showImage("C://Users//1044467//IdeaProjects//DemoLaunchX//src//practicaMultiverse//assets//garrasRet.jpg");
        s.out("\n\nGarras Retractiles: Durante un enfrentamiento con un robot en las alcantarillas, Silk revelo " +
                "tener garras retráctiles en los dedos, las cuales son lo suficientemente duras y afiladas " +
                "como para cortar metales y derrotar a la máquina.", "Comic Sans MS",20, Color.red);
        s.setBounds(500,40,1000,750);
    }
}

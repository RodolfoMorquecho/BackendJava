package practicaMultiverse;

import imonsh.Screen;

import java.awt.*;

public class MiguelOhara extends Spiderman implements MiguelHabilidades{
    public MiguelOhara(String nombre, String alias, String genero, String aparicion1, String tierraOrigen){
        super(nombre, alias, genero, aparicion1, tierraOrigen);
    }

    @Override
    public void senueloAcelerado(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out(showMessage(), "Comic Sans MS",18, Color.BLUE);
        s.showImage("C://Users//1044467//IdeaProjects//DemoLaunchX//src//practicaMultiverse//assets//senueloAce.jpg");
        s.out("\n\nSenuelo Acelerado: Esta habilidad le permite a Miguel moverse tan rápido que puede dejar atrás una imagen " +
                "residual de su cuerpo para que los enemigos la ataquen " +
                "y así evadir el daño causado.", "Comic Sans MS",20, Color.red);
        s.setBounds(500,40,1000,750);
    }

    @Override
    public void fuerzaSobrehumana(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out(showMessage(), "Comic Sans MS",18, Color.BLUE);
        s.showImage("C://Users//1044467//IdeaProjects//DemoLaunchX//src//practicaMultiverse//assets//fuerzaSob.jpg");
        s.out("\n\nFuerza Sobrehumana: Miguel posee la fuerza proporcional de una araña. En su máximo, posee suficiente fuerza sobrehumana " +
                "para levantar hasta 10 toneladas. ", "Comic Sans MS",20, Color.red);
        s.setBounds(500,40,1000,750);
    }

    @Override
    public void curacionAcelerada(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out(showMessage(), "Comic Sans MS",18, Color.BLUE);
        s.showImage("C://Users//1044467//IdeaProjects//DemoLaunchX//src//practicaMultiverse//assets//curacionAce.jpg");
        s.out("\n\nCuracion Acelerada: Su resistencia y fuerzas físicas superhumanas también le dan un factor de curación " +
                "muy rápido, pudiendo sanar heridas en horas o días " +
                "lo que a un humano normal le tomaría semanas.", "Comic Sans MS",20, Color.red);
        s.setBounds(500,40,1000,750);
    }
}

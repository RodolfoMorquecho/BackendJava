package practicaMultiverse;

import imonsh.Colors;
import imonsh.Screen;

import java.awt.*;

public class AnyaCorazon extends Spiderman implements AnyaHabilidades{
    //Constructor que nos proporciona el extends de Spiderman
    //Nos sirve para poder probar nuestra clase AnyaCorazon
    public AnyaCorazon(String nombre, String alias, String genero, String aparicion1, String tierraOrigen){
        super(nombre,alias,genero,aparicion1,tierraOrigen);
    }

    @Override
    public void espirituCazador(Screen s) {
        s.setVisible(true);
        s.out(showMessage(), "Comic Sans MS",18, Color.BLUE);
        s.showImage("C://Users//1044467//IdeaProjects//DemoLaunchX//src//practicaMultiverse//assets//espirituCaz.jpg");
        s.out("\n\nEspiritu Cazador: Este espíritu mejoraba sus habilidades y la ponía en " +
                "un estado similar al de un Berserker.", "Comic Sans MS",20, Color.red);
        s.setBounds(500,40,1000,750);
    }

    @Override
    public void caparazon(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out(showMessage(), "Comic Sans MS",18, Color.BLUE);
        s.showImage("C://Users//1044467//IdeaProjects//DemoLaunchX//src//practicaMultiverse//assets//caparazon.jpg");
        s.out("\n\nCaparazon:  Anya podía invocar un exoesqueleto azul en forma de araña alrededor de su cuerpo que" +
                " emanaba del tatuaje en su brazo derecho, " +
                "este mejoraba sus habilidades y la protegía de daños.", "Comic Sans MS",20, Color.red);
        s.setBounds(500,40,1000,750);
    }

    @Override
    public void camuflajeSombrio(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out(showMessage(), "Comic Sans MS",18, Color.BLUE);
        s.showImage("C://Users//1044467//IdeaProjects//DemoLaunchX//src//practicaMultiverse//assets//camuflaje.jpg");
        s.out("\n\nCamuflaje Sombrio: Anya es capaz de esconderse en las sombras y desplazarse sin ser detectada" +
                " por la mayoría de la gente.", "Comic Sans MS",20, Color.red);
        s.setBounds(500,40,1000,750);
    }
}

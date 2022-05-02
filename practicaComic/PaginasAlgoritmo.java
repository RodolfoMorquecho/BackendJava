package practicaComic;

import imonsh.Screen;

public class PaginasAlgoritmo implements Runnable{
    Screen screen;
    String img;

    public PaginasAlgoritmo(Screen screen){
        this.screen = screen;
    }

    @Override
    public void run() {
        for (int i=1; i<=21; i++){
            img = "C://Users//1044467//IdeaProjects//DemoLaunchX//src//practicaComic//assetsComic//"+i+".png";
            screen.cls();
            screen.showImage(img);
            try {
                Thread.sleep(5710);
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }
}

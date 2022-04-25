package practicaMona;

// Clase padre(Super clase)
public class Octocat {
    private String especie = "Pulpigato";
    private String nombre = "Octocat";
    private String aspecto = "Sin outfit";
    private int id = 001;

    //Constructor por omision
    public Octocat(){}

    //Getters
    public String getEspecie(){ return especie;  }
    public String getNombre(){  return nombre;  }
    public String getAspecto(){  return aspecto;  }
    public int getId(){  return id;  }

    //Setters
    public boolean setEspecie(String especie){
        if(!especie.isEmpty()){
            this.especie = especie;
            return true;
        }else
            return false;
    }
    public boolean setNombre(String nombre){
        if(!nombre.isEmpty()){
            this.nombre = nombre;
            return true;
        }else
            return false;
    }
    public boolean setAspecto(String aspecto){
        if(!aspecto.isEmpty()){
            this.aspecto = aspecto;
            return true;
        }else
            return false;
    }
    public boolean setId(int id){
        if(id > 0){
            this.id = id;
            return true;
        }else
            return false;
    }

    //Metodo
    public void mision(){
        System.out.println("Objetivo: Crear la comunidad mas grande y unida de programadores\"");
    }
    //Sobrecarga y validacion de metodo "mision"
    public boolean mision(String descripcion){
        if(!descripcion.isEmpty()){
            System.out.println(descripcion);
            return true;
        }else
            return false;
    }

    public String showMessage(){
        return "Especie: "+especie+
                "\nNombre: "+nombre+
                "\nId: "+id+
                "\nAspecto: "+aspecto;
    }
}

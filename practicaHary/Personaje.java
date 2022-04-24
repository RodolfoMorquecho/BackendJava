package practicaHary;

//Modelado de personaje del mundo Harry Potter
//Tendremos las 2 opciiones (getters|setters y constructor)

public class Personaje {
    private String casa;
    private String genero;
    private String nombre;
    private String boggart;
    private String patronus;

    //Constructor por omisión
    public Personaje(){}

    //Constructor para el caso donde necesitamos todos los campos
    public Personaje(String casa, String genero, String nombre, String boggart, String patronus){
        this.casa = casa;
        this. genero = genero;
        this.nombre = nombre;
        this.boggart = boggart;
        this.patronus = patronus;
    }

    //Getters
    public String getCasa(){  return casa;  }
    public String getGenero(){  return genero;  }
    public String getNombre(){  return nombre;  }
    public String getBoggart(){  return boggart;  }
    public String getPatronus(){  return patronus;  }

    //Setters
    public boolean setCasa(String casa){
        if(!casa.isEmpty()){
            this.casa = casa;
            return true;
        }else
            return false;
    }
    public boolean setGenero(String genero){
        if(!genero.isEmpty()){
            this.genero = genero;
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
    public boolean setBoggart(String boggart){
        if(!boggart.isEmpty()){
            this.boggart = boggart;
            return true;
        }else
            return false;
    }
    public boolean setPatronus(String patronus){
        if(!patronus.isEmpty()){
            this.patronus = patronus;
            return true;
        }else
            return false;
    }

    //Metodo de control que nos permite comprender como funcionara o lo que sucedio arriba
    public String showMessage(){
        return "Casa: "+casa+"\n"+
                "Genero: "+genero+"\n"+
                "Nombre: "+nombre+"\n"+
                "Boggart: "+boggart+"\n"+
                "Patronus: "+patronus;
    }
}




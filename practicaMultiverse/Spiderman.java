package practicaMultiverse;

public class Spiderman {
    private String nombre;
    private String alias;
    private String genero;
    private String aparicion1;
    private String tierraOrigen;

    //Constructor por omision
    public Spiderman(){
    }

    //Constructor para caso de usar todas las propiedades
    public Spiderman(String nombre, String alias, String genero, String aparicion1, String tierraOrigen){
        this.nombre = nombre;
        this.alias = alias;
        this.genero = genero;
        this. aparicion1 = aparicion1;
        this.tierraOrigen = tierraOrigen;
    }

    //Getters
    public String getNombre(){  return nombre;  }
    public String getAlias(){  return alias;  }
    public String getGenero(){  return genero;  }
    public String getAparicion1(){  return aparicion1;  }
    public String getTierraOrigen(){  return tierraOrigen;  }

    //Setters
    public boolean setNombre(String nombre){
        if(!nombre.isEmpty()){
            this.nombre = nombre;
            return true;
        }else
            return false;
    }
    public boolean setAlias(String alias){
        if(!alias.isEmpty()){
            this.alias = alias;
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
    public boolean setAparicion1(String aparicion1){
        if(!aparicion1.isEmpty()){
            this.aparicion1 = aparicion1;
            return true;
        }else
            return false;
    }
    public boolean setTierraOrigen(String tierraOrigen){
        if(!tierraOrigen.isEmpty()){
            this.tierraOrigen = tierraOrigen;
            return true;
        }else
            return false;
    }

    //Muestra los datos de la clase
    public String showMessage(){
        return "Nombre: "+nombre+"\t\t\t"+
                "Alias: "+alias+"\t\t\t\t"+
                "Genero: "+genero+"\n"+
                "\tPrimera aparicion: "+aparicion1+
                "\t\tTierra de origen: "+tierraOrigen+"\n\n"+
                "       ";
    }


}
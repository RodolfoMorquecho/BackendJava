package practicaLineUp;

public class LineUp {
    private String nameBand;
    private String nameSongs;
    private int numbStage;
    private int numbSongs;
    private double timeShow;

    public LineUp(){ }

    public LineUp(String nameBand, String nameSongs, int numbStage, int numbSongs, int timeShow){
        this.nameBand = nameBand;
        this.nameSongs = nameSongs;
        this.numbStage = numbStage;
        this.numbSongs = numbSongs;
        this.timeShow = timeShow;
    }


    public String getNameBand(){  return nameBand;  }
    public String getNameSongs(){  return nameSongs;  }
    public int getNumbStage(){  return numbStage;  }
    public int getNumbSongs(){  return  numbSongs;  }
    public double getTimeShow(){  return timeShow;  }


    public boolean setNameBand(String nameBand){
        if(!nameBand.isEmpty()){
            this.nameBand = nameBand;
            return true;
        }else
            return false;
    }
    public boolean setNameSongs(String nameSongs){
        if(!nameSongs.isEmpty()){
            this.nameSongs = nameSongs;
            return true;
        }else
            return false;
    }
    public boolean setNumbStage(int numbStage){
        if(numbStage > 0){
            this.numbStage = numbStage;
            return true;
        }else
            return false;
    }
    public boolean setNumbSongs(int numbSongs){
        if(numbSongs > 0){
            this.numbSongs = numbSongs;
            return true;
        }else
            return false;
    }
    public boolean setTimaShow(double timeShow){
        if(timeShow > 0){
            this.timeShow = timeShow;
            return true;
        }else
            return false;
    }

    public String showMessage(){
        return "Name Band: "+nameBand+"\n"+
                "Name Songs: "+nameSongs+"\n"+
                "Numb Stage: "+numbStage+"\n"+
                "Numb Songs: "+numbSongs+"\n"+
                "Time Show: "+timeShow;
    }

}

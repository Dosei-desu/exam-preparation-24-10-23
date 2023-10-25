package øvelse9;

public class Bil {
    private int weight;
    private Trailer trailer;

    public Bil(int weight){
        this.weight = weight;
    }

    public boolean attachTrailer(Trailer trailer){
        if(this.weight + trailer.getWeight() < 3500){
            this.trailer = trailer;
            return true;
        }
        return false;
    }

    public int getTotalWeight(){
        if(trailer != null){
            return this.weight+ trailer.getWeight();
        }
        return this.weight;
    }
}

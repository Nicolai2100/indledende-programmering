package uge9;

public class Grund {
    protected int areal;
    protected int kvadratmeterpris;
    protected int byggeret;

    public Grund(int areal, int kvadratmeterpris, int byggeret) {
        this.areal = areal;
        this.kvadratmeterpris = kvadratmeterpris;
        this.byggeret = byggeret;
    }

    public int vurdering(){

        int vurdering = (areal * kvadratmeterpris) + byggeret;

        return vurdering;
    }
    public String toString(){
        String result = "Areal: "+ areal + ", kvadratmeterpris: " + kvadratmeterpris + " , byggeret: " + byggeret;

        return result;
    }
}
class ForurenetGrund extends Grund {
    private int fradrag;

    public ForurenetGrund(int areal, int kvadratmeterpris, int byggeret, int fradrag) {
        super(areal, kvadratmeterpris, byggeret);
        this.fradrag = fradrag;
    }
    @Override
    public int vurdering() {
        int nyVurdering = (kvadratmeterpris * areal)+byggeret-fradrag;
        return nyVurdering;
    }

    public void sætFradrag(int fradrag){
        this.fradrag = fradrag;
    }

    @Override
    public String toString() {
        return super.toString() + ", fradrag: " +fradrag;
    }

    public static void main(String[] args) {

        Grund grund = new ForurenetGrund(500, 500, 400000, 100000);
        System.out.println(grund.vurdering());
        ((ForurenetGrund)grund).sætFradrag(150000);
        System.out.println(grund.vurdering());

    }
//expected 500000
    }




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

}
class ForurenetGrund extends Grund {
    private int fradrag;

    public ForurenetGrund(int areal, int kvadratmeterpris, int byggeret, int fradrag) {
        super(areal, kvadratmeterpris, byggeret);
        this.fradrag = fradrag;
    }
    @Override
    public int vurdering() {
        int vurdering = super.vurdering();
        int nyVurdering = (vurdering - this.fradrag);
        return nyVurdering;
    }

    public void sætFradrag(int fradrag){
        this.fradrag = this.fradrag -fradrag;
    }

    public static void main(String[] args) {

        Grund grund = new ForurenetGrund(500, 500, 400000, 100000);
        System.out.println(grund.vurdering());
        ((ForurenetGrund)grund).sætFradrag(150000);
        System.out.println(grund.vurdering());

    }
//expected 500000
    }




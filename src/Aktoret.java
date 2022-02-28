public class Aktoret {
    /**cdo aktor ka nje emer mb roli mosha  */
    /**konstruktor me dhe pa parametra
     * getters and setters
     * to string
     */
   String emeiiPlote ;
   String roli ;
   int mosha ;

    public Aktoret(String emeiiPlote, String roli, int mosha) {
        this.emeiiPlote = emeiiPlote;
        this.roli = roli;
        this.mosha = mosha;
    }

    public String getEmeiiPlote() {
        return emeiiPlote;
    }

    public void setEmeiiPlote(String emeiiPlote) {
        this.emeiiPlote = emeiiPlote;
    }

    public String getRoli() {
        return roli;
    }

    public void setRoli(String roli) {
        this.roli = roli;
    }

    public int getMosha() {
        return mosha;
    }

    public void setMosha(int mosha) {
        this.mosha = mosha;
    }

    @Override
    public String toString() {
        return "Aktoret{" +
                "emeiiPlote='" + emeiiPlote + '\'' +
                ", roli='" + roli + '\'' +
                ", mosha=" + mosha +
                '}';
    }
}

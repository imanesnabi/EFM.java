public class Agent extends Employe{
    private double primeResponsabilite;
    public double getPrimeResponsabilite(){
         return primeResponsabilite;
    }

    public void setPrimeResponsabilite(double primeResponsabilite) {
        this.primeResponsabilite = primeResponsabilite;
    }


    public Agent(String nom, int dateNaissance, int dateEmbauche, double salaireBase, double primeResponsabilite){
        super (nom, dateNaissance, dateEmbauche, salaireBase);
        this.primeResponsabilite = primeResponsabilite;
    }

    public double SalaireAPayer(double salaireBase)
    {
        return (salaireBase+primeResponsabilite)*(1-IR.getIR(salaireBase*12));
    }
}



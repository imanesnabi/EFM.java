public class Employe {
    private int mtle;
    private String nom;
    private int dateNaissance;
    private double salaireBase;
    private int dateEmbauche;
    private static int count;


    public int getMtle() {
        return mtle;
    }

    public void setMtle(int mtle) {
        this.mtle = mtle;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(int dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public double getSalaireBase() {
        return salaireBase;
    }

    public void setSalaireBase(double salaireBase) {
        this.salaireBase = salaireBase;
    }

    public int getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(int dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }

    public Employe(String nom, int dateNaissance, int dateEmbauche, double salaireBase){
        count++;
        mtle = count;
        this.nom = "";
        this.dateNaissance =0;
        this.dateEmbauche =0;
        this.salaireBase =0;


    }

    @Override
    public String toString() {
        return "Employe{" +
                " -mtle=" + mtle +'\n'+
                " - nom='" + nom + '\n' +
                "- dateNaissance=" + dateNaissance +'\n'+
                "- salaireBase=" + salaireBase +'\n'+
                "- dateEmbauche=" + dateEmbauche +'\n'+
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Employe employe))
            return false;
        return getMtle() == employe.getMtle();
    }


}

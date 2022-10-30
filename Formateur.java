public class Formateur extends  Employe{
    private int heureSup;
    private static double remunerationHSup;
    private int NbreHS;

    public int getHeureSup() {
        return heureSup;
    }

    public void setHeureSup(int heureSup) {
        this.heureSup = heureSup;
    }

    public static double getRemunerationHSup() {
        return remunerationHSup;
    }

    public static void setRemunerationHSup(double remunerationHSup) {
        Formateur.remunerationHSup = remunerationHSup;
    }

    public Formateur(String nom , int dateNaissance, int dateEmbauche, double salaireBase){
        super(nom, dateNaissance, dateEmbauche, salaireBase);
        heureSup=0;
        remunerationHSup=0;
    }

    @Override
    public String toString() {
        return "Formateur :" +
                "heureSup="+ heureSup ;

    }

    public  double  salaireAPayer(int tauxIR) {
        return (getSalaireBase() + (remunerationHSup * NbreHS)) * (1 - tauxIR);
    }
}

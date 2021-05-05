package interfaces;

public class TestObjetGeometrique {
    public static void main(String[] args) {
        ObjetGeometrique[] tabInterface = new ObjetGeometrique[2];
        tabInterface[0] = new Cercle(5.0);
        tabInterface[1] = new Rectangle(25.0, 20.0);
        for (ObjetGeometrique objetGeometrique : tabInterface) {
            System.out.println("Le perimetre de la figure est " + objetGeometrique.perimetre());
            System.out.println("La surface de la figure est " + objetGeometrique.surface());
        }
    }
}

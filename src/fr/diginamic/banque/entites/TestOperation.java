package fr.diginamic.banque.entites;

public class TestOperation {
    public static void main(String[] args) {
        double montantGoblaOperation = 0.0;
        Operation[] tabOperations = {
                new Credit("21/04/2021", 26.0),
                new Credit("30/04/2021", 42.6),
                new Debit("21/04/2021", 18),
                new Debit("30/04/2021", 100)
        };
        for (Operation operation : tabOperations) {
            System.out.println(operation + " type opération => " + operation.getType());
            montantGoblaOperation = montantGoblaOperation + operation.montantOperation * (operation.getType()=="CREDIT" ? 1 : -1);
        }
        System.out.println("Montant global des opérations : " + montantGoblaOperation);
    }
}

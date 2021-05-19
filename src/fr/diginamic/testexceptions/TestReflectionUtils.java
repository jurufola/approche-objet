package fr.diginamic.testexceptions;

import sets.Pays;

public class TestReflectionUtils {
    public static void main(String[] args) {
        Pays mali = new Pays("Mali", 20_000_000, 879.01);
        try {
            ReflectionUtils.afficherAttributs(null);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ReflectionException e) {
            e.printStackTrace();
            e.getMessage();
        }
        finally {
            System.out.println("Le programme continue");
        }
    }
}

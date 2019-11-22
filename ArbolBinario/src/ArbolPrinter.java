
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArbolPrinter<T extends Comparable<T>> {

    public void printNodo(Nodo<T> root) {
        int maxLevel = maxLevel(root);

        printNodoInternal(Collections.singletonList(root), 1, maxLevel);
    }

    private void printNodoInternal(List<Nodo<T>> Nodos, int level, int maxLevel) {
        if (Nodos.isEmpty() || isAllElementsNull(Nodos))
            return;

        int floor = maxLevel - level;
        int endgeLines = (int) Math.pow(2, (Math.max(floor - 1, 0)));
        int firstSpaces = (int) Math.pow(2, (floor)) - 1;
        int betweenSpaces = (int) Math.pow(2, (floor + 1)) - 1;

        ArbolPrinter.printWhitespaces(firstSpaces);

        List<Nodo<T>> newNodos = new ArrayList<Nodo<T>>();
        for (Nodo<T> Nodo : Nodos) {
            if (Nodo != null) {
                System.out.print(Nodo.getElemento());
                newNodos.add(Nodo.getIzquierdo());
                newNodos.add(Nodo.getDerecho());
            } else {
                newNodos.add(null);
                newNodos.add(null);
                System.out.print(" ");
            }

            ArbolPrinter.printWhitespaces(betweenSpaces);
        }
        System.out.println("");

        for (int i = 1; i <= endgeLines; i++) {
            for (int j = 0; j < Nodos.size(); j++) {
                ArbolPrinter.printWhitespaces(firstSpaces - i);
                if (Nodos.get(j) == null) {
                    ArbolPrinter.printWhitespaces(endgeLines + endgeLines + i + 1);
                    continue;
                }

                if (Nodos.get(j).getIzquierdo() != null)
                    System.out.print("/");
                else
                    ArbolPrinter.printWhitespaces(1);

                ArbolPrinter.printWhitespaces(i + i - 1);

                if (Nodos.get(j).getDerecho() != null)
                    System.out.print("\\");
                else
                    ArbolPrinter.printWhitespaces(1);

                ArbolPrinter.printWhitespaces(endgeLines + endgeLines - i);
            }

            System.out.println("");
        }

        printNodoInternal(newNodos, level + 1, maxLevel);
    }

    private static void printWhitespaces(int count) {
        for (int i = 0; i < count; i++)
            System.out.print(" ");
    }

    private int maxLevel(Nodo<T> Nodo) {
        if (Nodo == null)
            return 0;

        return Math.max(maxLevel(Nodo.getIzquierdo()), maxLevel(Nodo.getDerecho())) + 1;
    }

    private boolean isAllElementsNull(List<Nodo<T>> list) {
        for (Object object : list) {
            if (object != null)
                return false;
        }

        return true;
    }
}



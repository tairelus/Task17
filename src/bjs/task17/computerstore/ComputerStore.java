package bjs.task17.computerstore;

import java.util.ArrayList;
import java.util.ListIterator;

import bjs.task17.computers.*;

/**
 * Created by YM on 27.11.2015.
 */

/**
 * Presents computer store
 */
public class ComputerStore {

    private DesktopComputersCatalog desktopComputers;

    /**
     * Provides storage for the computer objects
     */
    protected class DesktopComputersCatalog extends ArrayList<Desktop> {
       //Add user defined functions if necessary, e.g. some search
    }

    /**
     * Helper, print Desktop object in the console
     */
    protected void printDesktop(Desktop desktop) {
        System.out.print(desktop.toString());
        System.out.println("--------------------------------------------\n");
    }

    /**
     * Current constructor
     */
    public ComputerStore() {
        desktopComputers = new DesktopComputersCatalog();
    }

    /**
     * Adds Desktop to the collection
     * @param desktop
     */
    public void addDesktop(Desktop desktop) {
        desktopComputers.add(desktop);
    }

    /**
     * Gets Desktop object by index
     * @param index
     * @return
     */
    public Desktop getDesktop(int index) {
        return desktopComputers.get(index);
    }

    /**
     * Prints Desktop collection by index
     */
    public void printDesktopComputersIndex() {
        for (int i = 0; i < desktopComputers.size(); i++) {
            printDesktop(getDesktop(i));
        }
    }

    /**
     * Prints Desktop collection by ListIterator
     */
    public void printDesktopComputersIterator() {
        ListIterator<Desktop> desktopIterator = desktopComputers.listIterator();

        while (desktopIterator.hasNext()) {
            printDesktop(desktopIterator.next());
        }
    }

    /**
     * Prints Desktop collection with  "for-each" cycle
     */
    public void printDesktopComputersForEach() {
        for (Desktop desktop: desktopComputers) {
            printDesktop(desktop);
        }
    }
}

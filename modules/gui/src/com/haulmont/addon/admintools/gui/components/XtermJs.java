package com.haulmont.addon.admintools.gui.components;

import com.haulmont.cuba.gui.components.Component;

/**
 * Interface to provide an adapter for the Xterm JS terminal
 */
public interface XtermJs extends Component {
    String NAME = "xterm-js";

    /**
     * Print the {@code text} on the terminal
     */
    void write(String text);

    /**
     * Print the {@code text} on the terminal and then terminate the line.
     */
    void writeln(String text);

    /**
     * fit the terminal to the preferred size
     */
    void fit();

    void setDataListener(DataListener listener);

    DataListener getDataListener();

    void setRowsCountListener(RowsCountListener listener);

    RowsCountListener getRowsCountListener();

    /**
     * Interface which listen manual commands {@code data} for the terminal
     */
    interface DataListener {
        void data(String data);
    }

    /**
     * Interface which listen rows count changes {@code data} for the terminal
     */
    interface RowsCountListener {
        void changeRowsCount(int rows);
    }
}
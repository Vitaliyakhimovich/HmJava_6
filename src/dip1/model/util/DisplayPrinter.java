package dip1.model.util;

import dip1.model.ReportItem;

import java.util.Collection;

public class DisplayPrinter implements ReportManager {
    public void output(Collection<ReportItem> items) {
        System.err.println("OUTPUT YO DISPLAY");
        for (ReportItem item : items) {
            System.out.format("DISPLAY %s - %f \n\r", item.getDescription(), item.getAmount());
        }
    }
}

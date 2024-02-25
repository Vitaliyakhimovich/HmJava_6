package dip1.model.util;

import dip1.model.ReportItem;

import java.util.Collection;

public interface ReportManager {
    public void output(Collection<ReportItem> items);
}

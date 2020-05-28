package org.jenkinsci.plugins.workflow.support.steps;

import hudson.model.InvisibleAction;
import hudson.model.Run;
import org.kohsuke.stapler.export.Exported;
import org.kohsuke.stapler.export.ExportedBean;

@ExportedBean
public class StageMeasurementAction extends InvisibleAction {

    private String stageName;
    private Long startTimestamp;
    private Long completeTimestamp;
    private String result;

    public StageMeasurementAction(String stageName, Long startTimestamp, Long completeTimestamp, String result) {
        this.stageName = stageName;
        this.startTimestamp = startTimestamp;
        this.completeTimestamp = completeTimestamp;
        this.result = result;
    }

    @Exported(visibility = 3)
    public String getStageName() {
        return stageName;
    }

    @Exported(visibility = 3)
    public Long getStartTimestamp() {
        return startTimestamp;
    }

    @Exported(visibility = 3)
    public Long getCompleteTimestamp() {
        return completeTimestamp;
    }

    @Exported(visibility = 3)
    public Long getDuration() {
        return completeTimestamp - startTimestamp;
    }

    @Exported(visibility = 3)
    public String getResult() {
        return result;
    }
}

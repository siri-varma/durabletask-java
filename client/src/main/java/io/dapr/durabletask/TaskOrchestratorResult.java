package io.dapr.durabletask;

import io.dapr.durabletask.implementation.protobuf.OrchestratorService;

import java.util.Collection;
import java.util.Collections;

final class TaskOrchestratorResult {

    private final Collection<OrchestratorService.OrchestratorAction> actions;

    private final String customStatus;

    public TaskOrchestratorResult(Collection<OrchestratorService.OrchestratorAction> actions, String customStatus) {
        this.actions = Collections.unmodifiableCollection(actions);;
        this.customStatus = customStatus;
    }

    public Collection<OrchestratorService.OrchestratorAction> getActions() {
        return this.actions;
    }

    public String getCustomStatus() {
        return this.customStatus;
    }
}

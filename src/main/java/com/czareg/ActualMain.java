package com.czareg;

import com.czareg.beans.WorkerA;
import com.czareg.beans.WorkerB;
import org.springframework.stereotype.Component;

@Component
public class ActualMain {
    private WorkerA workerA;
    private WorkerB workerB;

    public ActualMain(WorkerA workerA, WorkerB workerB) {
        this.workerA = workerA;
        this.workerB = workerB;
    }

    public void main() {
        System.out.println("Starting main");
        workerA.work();
        workerB.work();
        System.out.println("Finished main");
    }
}

package com.BookMyServant.ui.model.response;

import java.util.Iterator;

import com.BookMyServant.entity.WorkerEntity;

public class Workerresponse {

	private Iterator<WorkerEntity> workers;

	public Iterator<WorkerEntity> getWorkers() {
		return workers;
	}

	public void setWorkers(Iterator<WorkerEntity> workers) {
		this.workers = workers;
	}
	
}

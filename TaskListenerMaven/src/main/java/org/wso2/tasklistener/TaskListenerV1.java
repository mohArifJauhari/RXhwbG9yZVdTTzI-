package org.wso2.tasklistener;

import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.TaskListener;

public class TaskListenerV1 implements TaskListener {

	public void notify(DelegateTask delegateTask) {
		delegateTask.setDescription("First Task Listenner");
	}
}

package com.example.activiti.listen;





import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.TaskListener;

import java.util.ArrayList;



/**
 *
 * 任务监听器，实现TaskListener接口
 *
 * */
public class TaskListeners implements TaskListener {

	@Override
	public void notify(DelegateTask delegateTask) {
		ArrayList<String> list = new ArrayList<>();
//		list.add("user1");
//		list.add("user2");
//		list.add("user");
//		delegateTask.addCandidateUsers(list);
		list.add("user1__2");
		list.add("user2__2");
		list.add("user3__2");
		delegateTask.setVariable("num",2);
		delegateTask.setVariable("users",list);
	}


}
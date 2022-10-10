package com.citiustech.mrr;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class WorkflowItemServiceTask
		implements
			java.io.Serializable,
			org.kie.api.runtime.process.WorkItemHandler {

	static final long serialVersionUID = 1L;

	private static final String WORKFLOW_HISTORY_PROCEDURE_NAME = "{call Usp_InsertWorkflowItemInprogress(?,?,?,?,?,?,?,?)}";
	// Usp_InsertWorkflowItemInprogress is used to populate items to
	// Workflowitem in progress table.

	public WorkflowItemServiceTask() {
	}

	@Override
	public void executeWorkItem(org.kie.api.runtime.process.WorkItem workItem,
			org.kie.api.runtime.process.WorkItemManager manager) {
		// extract parameters
		java.util.Map<String, Object> results = new java.util.HashMap<String, Object>();
		com.citiustech.mrr.WorkflowItem workflowItem = (com.citiustech.mrr.WorkflowItem) workItem
				.getParameter("workflowItem");

		try (java.sql.Connection conn = com.citiustech.mrr.MRRConnectionUtil
				.getConnection()) {
			try (java.sql.CallableStatement clbStmt = conn
					.prepareCall(WORKFLOW_HISTORY_PROCEDURE_NAME)) {

				workflowItemHistory(clbStmt, workflowItem);
				workflowItem.setExceptionFlag(false);
				conn.commit();
				results.put("workflowItem", workflowItem);
				manager.completeWorkItem(workItem.getId(), results);
			} catch (java.sql.SQLException ex) {
				System.out
						.println("[Inside:WorkflowItemServiceTask:Expression] [ERROR:SQL query execution failed.] "
								+ ex);
				try {
					conn.rollback();
					System.err
							.println("[Inside:WorkflowItemServiceTask:Expression] [WARN:SQL query transaction has been rolled back for "
									+ workflowItem.getWorkflowIndicator()
									+ " ] ");
					throw new com.citiustech.mrr.WorkflowException(
							"SQL query transaction has been rolled back for "
									+ workflowItem.getWorkflowIndicator());
				} catch (java.sql.SQLException e) {
					System.err
							.println("[Inside:WorkflowItemServiceTask:Expression] [ERROR:There was an error while making a rollback.] "
									+ e);
				}
			}
		} catch (java.sql.SQLException ex) {
			System.out
					.println("[Inside:WorkflowItemServiceTask:Expression] [ERROR:SQL connection failed.] "
							+ ex);
		}
	}

	@Override
	public void abortWorkItem(org.kie.api.runtime.process.WorkItem workItem,
			org.kie.api.runtime.process.WorkItemManager manager) {
		// Do nothing, notifications cannot be aborted
		System.out
				.println("[Inside:WorkflowItemServiceTask:Expression] [WARN:Aborting WorkflowItemServiceTask.]");
		java.util.Map<String, Object> results = new java.util.HashMap<String, Object>();
		com.citiustech.mrr.WorkflowItem workflowItem = (com.citiustech.mrr.WorkflowItem) workItem
				.getParameter("workflowItem");
		workflowItem.setExceptionFlag(true);
		results.put("workflowItem", workflowItem);
		manager.completeWorkItem(workItem.getId(), results);
		// manager.abortWorkItem(workItem.getId());
	}

	private void booleanNullChecker(java.sql.PreparedStatement stmt, int index,
			java.lang.Boolean value) throws java.sql.SQLException {
		if (value != null) {
			stmt.setBoolean(index, value);
		} else {
			stmt.setInt(index, 0);
		}
	}

	private void longNullChecker(java.sql.PreparedStatement stmt, int index,
			java.lang.Long value) throws java.sql.SQLException {
		if (value != null) {
			stmt.setInt(index, value.intValue());
		} else {
			stmt.setNull(index, java.sql.Types.INTEGER);
		}
	}

	private void workflowItemHistory(java.sql.CallableStatement clbStmt,
			com.citiustech.mrr.WorkflowItem workflowItem)
			throws java.sql.SQLException {

		System.out
				.println("[Inside:WorkflowItemServiceTask:Expression] [INFO]: [ Workflow_Item ID : "
						+ workflowItem.getWorkflowItemId()
						+ " ] [ Process Instance Id : "
						+ workflowItem.getProcessInstanceId()
						+ " ] [ WorkflowItem Status Code : "
						+ workflowItem.getStatusCode()
						+ " ] [ OvereadCount : "
						+ workflowItem.getOverreadCount()
						+ " ] [ workflowIndicator : "
						+ workflowItem.getWorkflowIndicator()
						+ " ] [ New assignedTo username : "
						+ workflowItem.getAssignedTo()
						+ " ] [ Reviewed By : "
						+ workflowItem.getReviewBy()
						+ " ] [ Mandatory Review Flag : "
						+ workflowItem.getMandatoryReviewFlag() + " ]");

		clbStmt.setInt(1, workflowItem.getWorkflowItemId().intValue());
		clbStmt.setString(2, workflowItem.getStatusCode());
		clbStmt.setInt(3, workflowItem.getOverreadCount());
		clbStmt.setString(4, workflowItem.getWorkflowIndicator());
		clbStmt.setString(5, workflowItem.getAssignedTo());
		clbStmt.setString(6, workflowItem.getReviewBy());
		longNullChecker(clbStmt, 7, workflowItem.getProcessInstanceId());
		booleanNullChecker(clbStmt, 8, workflowItem.getMandatoryReviewFlag());
		System.out
				.println("[Inside:WorkflowItemServiceTask:Expression] [INFO: Calling SP "
						+ WORKFLOW_HISTORY_PROCEDURE_NAME
						+ " to insert data to WI_Inprogress Table]");

		clbStmt.execute();
		System.out
				.println("[Inside:WorkflowItemServiceTask:Expression] [INFO:procedure call  successfull]");
	}

}

{"id":"d30f183f-7a05-41d2-b76f-d710f2d8ce32","name":"AbsTaskForm-taskform.frm","model":{"taskName":"AbsTaskForm","processId":"CPMMChase.CMMMainPro","name":"task","properties":[{"name":"cmm","typeInfo":{"type":"OBJECT","className":"com.citiustech.mrr.CMM1","multiple":false}},{"name":"cpmm","typeInfo":{"type":"OBJECT","className":"com.citiustech.mrr.CPMM1","multiple":false}}],"formModelType":"org.kie.workbench.common.forms.jbpm.model.authoring.task.TaskFormModel"},"fields":[{"nestedForm":"d29c570a-deb1-4ccc-b0b9-9cd5574008ca","id":"cmm","name":"cmm","label":"Cmm","required":false,"readOnly":false,"validateOnChange":true,"binding":"cmm","standaloneClassName":"com.citiustech.mrr.CMM1","code":"SubForm","serializedFieldClassName":"org.kie.workbench.common.forms.fields.shared.fieldTypes.relations.subForm.definition.SubFormFieldDefinition"},{"nestedForm":"29485e43-a68f-4f49-9059-7ce8440a66da","id":"cpmm","name":"cpmm","label":"Cpmm","required":false,"readOnly":false,"validateOnChange":true,"binding":"cpmm","standaloneClassName":"com.citiustech.mrr.CPMM1","code":"SubForm","serializedFieldClassName":"org.kie.workbench.common.forms.fields.shared.fieldTypes.relations.subForm.definition.SubFormFieldDefinition"}],"layoutTemplate":{"version":2,"name":"AbsTaskForm-taskform.frm","style":"FLUID","layoutProperties":{},"rows":[{"height":"12","layoutColumns":[{"span":"12","height":"12","rows":[],"layoutComponents":[{"dragTypeName":"org.kie.workbench.common.forms.editor.client.editor.rendering.EditorFieldLayoutComponent","properties":{"field_id":"cmm","form_id":"d30f183f-7a05-41d2-b76f-d710f2d8ce32"}}]}]},{"height":"12","layoutColumns":[{"span":"12","height":"12","rows":[],"layoutComponents":[{"dragTypeName":"org.kie.workbench.common.forms.editor.client.editor.rendering.EditorFieldLayoutComponent","properties":{"field_id":"cpmm","form_id":"d30f183f-7a05-41d2-b76f-d710f2d8ce32"}}]}]}]}}
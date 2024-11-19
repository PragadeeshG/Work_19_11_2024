create table if not exists augumentation_learning_chart(
data_learning_code Integer not null,
augumentation_learning_id Integer null,
augumentation_learning_budget_indicator varchar(255) null,
augumentation_learning_sheet varchar(255) null,
augumentation_learning_control_flag varchar(255) null,
augumentation_learning_desc varchar(255) null,
augumentation_learning_short_desc varchar(255) null,
augumentation_learning_type varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint augumentation_learning_chart_pk primary key(data_learning_code));
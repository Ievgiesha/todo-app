create table task_groups
(
    id          Integer primary key auto_increment,
    description varchar(200) not null,
    done         bit
);
alter table tasks add column task_group_id int null;
alter table tasks
add foreign key (task_group_id) references task_groups (id);
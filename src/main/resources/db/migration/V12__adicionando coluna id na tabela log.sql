alter table log drop column accountid;

alter table log add column accountid  bigint;

alter table log add column id serial primary key;
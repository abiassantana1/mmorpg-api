create table character_buff (
	character_id int,
	buff_id int,
	constraint pk_cb primary key(character_id,buff_id),
	foreign key (character_id) references character (id),
	foreign key (buff_id) references buff (id)
);
create table character_skill (
	character_id int,
	skill_id int,
	constraint pk_cs primary key(character_id,skill_id),
	foreign key (character_id) references character (id),
	foreign key (skill_id) references skill (id)
);
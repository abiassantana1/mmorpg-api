create table character_equip (
	character_id int,
	equip_id int,
	constraint pk_ce primary key(character_id,equip_id),
	foreign key (character_id) references character (id),
	foreign key (equip_id) references equip (id)
);
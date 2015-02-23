create table item_location_mapping (id bigint not null auto_increment, comments varchar(255), createdTime datetime, lastUpdateTime datetime, lastUpdatedBy varchar(255), version integer, itemId bigint not null, itemLocationId bigint not null, primary key (id)) ENGINE=InnoDB
alter table item_location_mapping add index FKAB8FE9F0F33A1A6D (itemLocationId), add constraint FKAB8FE9F0F33A1A6D foreign key (itemLocationId) references item_location (id)
alter table item_location_mapping add index FKAB8FE9F060411823 (itemId), add constraint FKAB8FE9F060411823 foreign key (itemId) references user (id)

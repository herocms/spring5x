-- 插入数据语句

-- 增加USERENTITY表数据
insert into USERENTITY(id,username,age) values (1,'小明',18);
insert into USERENTITY(id,username,age) values (2,'小刘',20);
insert into USERENTITY(id,username,age) values (3,'小王',20);

-- student学生表数据准备
insert into STUDENT(stuid,stuname,stuage,email) values (1,'学生1',18,'abc@qq.com');
insert into STUDENT(stuid,stuname,stuage,email) values (2,'学生2',20,'abc@qq.com');
insert into STUDENT(stuid,stuname,stuage,email) values (3,'学生3',20,'abc@qq.com');

COMMIT;
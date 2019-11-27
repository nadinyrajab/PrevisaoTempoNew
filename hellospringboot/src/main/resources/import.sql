
	insert into previsoes (min, max, ar, tex, dat, hora) values (31.0, 11.0, 663.0, 'chuva','24/9/2019', 01.42);
	insert into dias (semana) values ('Segunda');
	
	insert into cidades (latitude, longitude) values (111.25, 33.11 );
	update previsoes set dia = 1 where id = 1;
	
	update previsoes set cidades = 1 where id = 1;
	update dias set previsao = 1 where id = 1;
	update cidades set previsao = 1 where id = 1;
	
	insert into previsoes (min, max, ar, tex, dat, hora, latitude, longitude) values ( 5.0, 13.0, 50.0, 'chuvas fortes','19/3/2019', 44.25, 11.25, 16.11);
	insert into dias (semana) values ('Quinta');
	
	update previsoes set dia = 2 where id = 2;
	update dias set previsao = 2 where id = 2;
	
	insert into previsoes (min, max, ar, tex, dat, hora, latitude, longitude) values (18.0, 31.0, 63.0, 'pouca chuva','13/10/2019', 16.15, 55.15, 06.21);
	insert into dias (semana) values ('Domingo');
	
    update previsoes set dia = 3 where id = 3;
	update dias set previsao = 3 where id = 3;


insert into usuario (id, login, senha) values (1, 'admin', 'admin');



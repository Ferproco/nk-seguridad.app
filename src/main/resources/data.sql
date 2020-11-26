INSERT INTO public.negocio(codnegocio, contribuyente, direccion, email, imagen, mascaracontable, nombre, status, telefono, telefono2, web) VALUES ('406080195', 'Si', 'Carrera 58B # 58 P-22', '', '', '', 'Nk-System Consultores', 'ACTIVO', '', '', '');
insert into tipoimpuesto(nombretipoimpuesto,codnegocio,status) values('IVA',1,'ACTIVO');
insert into tipoimpuesto(nombretipoimpuesto,codnegocio,status) values('RTICA',1,'ACTIVO');
insert into tipocontacto(nombre) values('Cliente');
insert into tipocontacto(nombre) values('Proveedor');
INSERT INTO formapago(codnegocio, dias, nombre, status) VALUES (1, 0, 'Contado', 'ACTIVO');
INSERT INTO vendedor(cobrador, codigo, codnegocio, codusuario, codzona, correoe, direccionfiscal, interno, montometa, nombre, porcfclexp, porcfclimp, porclclimp, status) VALUES ('', '0', 1, '01', 1, '', '', '', 0, 'NINGUNO', 0, 0, 0, 'ACTIVO');
INSERT INTO zonas(codnegocio, nomzona, status) VALUES (1, 'NINGUNA', 'ACTIVO');
insert into tipocontribuyente(nombre) values('REGIMEN SIMPLE');
insert into tipocontribuyente(nombre) values('GRAN CONTRIBUYENTE');
insert into tipocontribuyente(nombre) values('RESPONSABLE DE IVA');
insert into tipocontribuyente(nombre) values('NO RESPONSABLE DE IVA');
insert into tipoidentificacion(codigo,nombre) values('11','RC-Registro Civil de Nacimiento');
insert into tipoidentificacion(codigo,nombre) values('12','Tarjeta de Identidad');
insert into tipoidentificacion(codigo,nombre) values('13','CE - Cedula de Ciudadania'); 
insert into tipoidentificacion(codigo,nombre) values('21',' TE - Tarjeta de Extranjeria');
insert into tipoidentificacion(codigo,nombre) values('22','CE - Cedula de Extranjeria');
insert into tipoidentificacion(codigo,nombre) values('31','NIT - Numero de Identificacion');
insert into tipoidentificacion(codigo,nombre) values('41','PP - Pasaporte');
insert into tipoidentificacion(codigo,nombre) values('42','DIE - Documentode identificacion Extranjero');
insert into unidadmedida(abrevunidadmedida,codnegocio,nomunidadmedida,status) values ('NOA',1,'NO APLICA','ACTIVO');
insert into unidadmedida(abrevunidadmedida,codnegocio,nomunidadmedida,status) values ('UND',1,'UNIDAD','ACTIVO');
insert into unidadmedida(abrevunidadmedida,codnegocio,nomunidadmedida,status) values ('SER',1,'SERVICIO','ACTIVO');
insert into unidadmedida(abrevunidadmedida,codnegocio,nomunidadmedida,status) values ('PZA',1,'PIEZA','ACTIVO');
insert into unidadmedida(abrevunidadmedida,codnegocio,nomunidadmedida,status) values ('CAJ',1,'CAJA','ACTIVO');
insert into unidadmedida(abrevunidadmedida,codnegocio,nomunidadmedida,status) values ('PAQ',1,'PAQUETE','ACTIVO');

insert into unidadmedida(abrevunidadmedida,codnegocio,nomunidadmedida,status) values ('CMT',1,'CENTIMETRO','ACTIVO');
insert into unidadmedida(abrevunidadmedida,codnegocio,nomunidadmedida,status) values ('MTR',1,'METRO','ACTIVO');
insert into unidadmedida(abrevunidadmedida,codnegocio,nomunidadmedida,status) values ('GAL',1,'GALON','ACTIVO');
insert into unidadmedida(abrevunidadmedida,codnegocio,nomunidadmedida,status) values ('LTR',1,'LITRO','ACTIVO');
insert into unidadmedida(abrevunidadmedida,codnegocio,nomunidadmedida,status) values ('HRA',1,'HORA','ACTIVO');
insert into unidadmedida(abrevunidadmedida,codnegocio,nomunidadmedida,status) values ('MIN',1,'MINUTO','ACTIVO');
insert into unidadmedida(abrevunidadmedida,codnegocio,nomunidadmedida,status) values ('DIA',1,'DIA','ACTIVO');

insert into pais(codigo, nombre, status) values('013','Afganistan', 'ACTIVO');
insert into pais(codigo, nombre, status) values('017','Albania', 'ACTIVO');
insert into pais(codigo, nombre, status) values('023','Alemania', 'ACTIVO');
insert into pais(codigo, nombre, status) values('037','Andorra', 'ACTIVO');
insert into pais(codigo, nombre, status) values('040','Angola', 'ACTIVO');
insert into pais(codigo, nombre, status) values('041','Anguilla', 'ACTIVO');
insert into pais(codigo, nombre, status) values('043','Antigua Y Barbuda', 'ACTIVO');
insert into pais(codigo, nombre, status) values('047','Antillas Holandesas', 'ACTIVO');
insert into pais(codigo, nombre, status) values('053','Arabia Saudita', 'ACTIVO');
insert into pais(codigo, nombre, status) values('059','Argelia', 'ACTIVO');
insert into pais(codigo, nombre, status) values('063','Argentina', 'ACTIVO');
insert into pais(codigo, nombre, status) values('026','Armenia', 'ACTIVO');
insert into pais(codigo, nombre, status) values('027','Aruba', 'ACTIVO');
insert into pais(codigo, nombre, status) values('069','Australia', 'ACTIVO');
insert into pais(codigo, nombre, status) values('072','Austria', 'ACTIVO');
insert into pais(codigo, nombre, status) values('074','Azerbaijan', 'ACTIVO');
insert into pais(codigo, nombre, status) values('077','Bahamas', 'ACTIVO');
insert into pais(codigo, nombre, status) values('080','Bahrein', 'ACTIVO');
insert into pais(codigo, nombre, status) values('081','Bangladesh', 'ACTIVO');
insert into pais(codigo, nombre, status) values('083','Barbados', 'ACTIVO');
insert into pais(codigo, nombre, status) values('087','Belgica', 'ACTIVO');
insert into pais(codigo, nombre, status) values('088','Belice', 'ACTIVO');
insert into pais(codigo, nombre, status) values('091','Belorus', 'ACTIVO');
insert into pais(codigo, nombre, status) values('229','Benin', 'ACTIVO');
insert into pais(codigo, nombre, status) values('090','Bermudas', 'ACTIVO');
insert into pais(codigo, nombre, status) values('093','Birmania (Myanmar)', 'ACTIVO');
insert into pais(codigo, nombre, status) values('097','Bolivia', 'ACTIVO');
insert into pais(codigo, nombre, status) values('029','Bosnia-Herzegovina', 'ACTIVO');
insert into pais(codigo, nombre, status) values('101','Botswana', 'ACTIVO');
insert into pais(codigo, nombre, status) values('105','Brasil', 'ACTIVO');
insert into pais(codigo, nombre, status) values('108','Brunei Darussalam', 'ACTIVO');
insert into pais(codigo, nombre, status) values('111','Bulgaria', 'ACTIVO');
insert into pais(codigo, nombre, status) values('031','Burkina Fasso', 'ACTIVO');
insert into pais(codigo, nombre, status) values('115','Burundi', 'ACTIVO');
insert into pais(codigo, nombre, status) values('119','Butan', 'ACTIVO');
insert into pais(codigo, nombre, status) values('127','Cabo Verde', 'ACTIVO');
insert into pais(codigo, nombre, status) values('137','Caiman, Islas', 'ACTIVO');
insert into pais(codigo, nombre, status) values('145','Camerun, Republica U', 'ACTIVO');
insert into pais(codigo, nombre, status) values('149','Canada', 'ACTIVO');
insert into pais(codigo, nombre, status) values('155','Canal(Normandas),Isl', 'ACTIVO');
insert into pais(codigo, nombre, status) values('157','Canton Enderbury,Isl', 'ACTIVO');
insert into pais(codigo, nombre, status) values('203','Chad', 'ACTIVO');
insert into pais(codigo, nombre, status) values('211','Chile', 'ACTIVO');
insert into pais(codigo, nombre, status) values('215','China', 'ACTIVO');
insert into pais(codigo, nombre, status) values('221','Chipre', 'ACTIVO');
insert into pais(codigo, nombre, status) values('159','Ciudad Del Vaticano', 'ACTIVO');
insert into pais(codigo, nombre, status) values('165','Cocos (Keeling), Isl', 'ACTIVO');
insert into pais(codigo, nombre, status) values('169','Colombia', 'ACTIVO');
insert into pais(codigo, nombre, status) values('173','Comoras', 'ACTIVO');
insert into pais(codigo, nombre, status) values('998','Comunidad Europea', 'ACTIVO');
insert into pais(codigo, nombre, status) values('177','Congo', 'ACTIVO');
insert into pais(codigo, nombre, status) values('183','Cook, Islas', 'ACTIVO');
insert into pais(codigo, nombre, status) values('187','Corea Del Norte,Repu', 'ACTIVO');
insert into pais(codigo, nombre, status) values('190','Corea Del Sur, Repub', 'ACTIVO');
insert into pais(codigo, nombre, status) values('193','Costa De Marfil', 'ACTIVO');
insert into pais(codigo, nombre, status) values('196','Costa Rica', 'ACTIVO');
insert into pais(codigo, nombre, status) values('198','Croacia', 'ACTIVO');
insert into pais(codigo, nombre, status) values('199','Cuba', 'ACTIVO');
insert into pais(codigo, nombre, status) values('789','Curacao', 'ACTIVO');
insert into pais(codigo, nombre, status) values('232','Dinamarca', 'ACTIVO');
insert into pais(codigo, nombre, status) values('783','Djibouti', 'ACTIVO');
insert into pais(codigo, nombre, status) values('235','Dominica', 'ACTIVO');
insert into pais(codigo, nombre, status) values('239','Ecuador', 'ACTIVO');
insert into pais(codigo, nombre, status) values('240','Egipto', 'ACTIVO');
insert into pais(codigo, nombre, status) values('242','El Salvador', 'ACTIVO');
insert into pais(codigo, nombre, status) values('244','Emiratos Arabes Unid', 'ACTIVO');
insert into pais(codigo, nombre, status) values('243','Eritrea', 'ACTIVO');
insert into pais(codigo, nombre, status) values('246','Eslovaquia', 'ACTIVO');
insert into pais(codigo, nombre, status) values('247','Eslovenia', 'ACTIVO');
insert into pais(codigo, nombre, status) values('245','España', 'ACTIVO');
insert into pais(codigo, nombre, status) values('249','Estados Unidos', 'ACTIVO');
insert into pais(codigo, nombre, status) values('251','Estonia', 'ACTIVO');
insert into pais(codigo, nombre, status) values('253','Etiopia', 'ACTIVO');
insert into pais(codigo, nombre, status) values('259','Feroe, Islas', 'ACTIVO');
insert into pais(codigo, nombre, status) values('870','Fiji', 'ACTIVO');
insert into pais(codigo, nombre, status) values('267','Filipinas', 'ACTIVO');
insert into pais(codigo, nombre, status) values('271','Finlandia', 'ACTIVO');
insert into pais(codigo, nombre, status) values('275','Francia', 'ACTIVO');
insert into pais(codigo, nombre, status) values('281','Gabon', 'ACTIVO');
insert into pais(codigo, nombre, status) values('285','Gambia', 'ACTIVO');
insert into pais(codigo, nombre, status) values('286','Gaza Y Jerico', 'ACTIVO');
insert into pais(codigo, nombre, status) values('287','Georgia', 'ACTIVO');
insert into pais(codigo, nombre, status) values('289','Ghana', 'ACTIVO');
insert into pais(codigo, nombre, status) values('293','Gibraltar', 'ACTIVO');
insert into pais(codigo, nombre, status) values('297','Granada', 'ACTIVO');
insert into pais(codigo, nombre, status) values('301','Grecia', 'ACTIVO');
insert into pais(codigo, nombre, status) values('305','Groenlandia', 'ACTIVO');
insert into pais(codigo, nombre, status) values('309','Guadalupe', 'ACTIVO');
insert into pais(codigo, nombre, status) values('313','Guam', 'ACTIVO');
insert into pais(codigo, nombre, status) values('317','Guatemala', 'ACTIVO');
insert into pais(codigo, nombre, status) values('325','Guayana Francesa', 'ACTIVO');
insert into pais(codigo, nombre, status) values('329','Guinea', 'ACTIVO');
insert into pais(codigo, nombre, status) values('334','Guinea - Bissau', 'ACTIVO');
insert into pais(codigo, nombre, status) values('331','Guinea Ecuatorial', 'ACTIVO');
insert into pais(codigo, nombre, status) values('337','Guyana', 'ACTIVO');
insert into pais(codigo, nombre, status) values('341','Haiti', 'ACTIVO');
insert into pais(codigo, nombre, status) values('345','Honduras', 'ACTIVO');
insert into pais(codigo, nombre, status) values('351','Hong Kong', 'ACTIVO');
insert into pais(codigo, nombre, status) values('355','Hungria', 'ACTIVO');
insert into pais(codigo, nombre, status) values('361','India', 'ACTIVO');
insert into pais(codigo, nombre, status) values('365','Indonesia', 'ACTIVO');
insert into pais(codigo, nombre, status) values('369','Irak', 'ACTIVO');
insert into pais(codigo, nombre, status) values('372','Iran, Republica Isla', 'ACTIVO');
insert into pais(codigo, nombre, status) values('375','Irlanda (Eire)', 'ACTIVO');
insert into pais(codigo, nombre, status) values('033','Isla De Man', 'ACTIVO');
insert into pais(codigo, nombre, status) values('379','Islandia', 'ACTIVO');
insert into pais(codigo, nombre, status) values('566','Islas Menores De Estados Unidos', 'ACTIVO');
insert into pais(codigo, nombre, status) values('383','Israel', 'ACTIVO');
insert into pais(codigo, nombre, status) values('386','Italia', 'ACTIVO');
insert into pais(codigo, nombre, status) values('391','Jamaica', 'ACTIVO');
insert into pais(codigo, nombre, status) values('399','Japon', 'ACTIVO');
insert into pais(codigo, nombre, status) values('395','Johnston,Isla', 'ACTIVO');
insert into pais(codigo, nombre, status) values('403','Jordania', 'ACTIVO');
insert into pais(codigo, nombre, status) values('141','Kampuchea (Camboya)', 'ACTIVO');
insert into pais(codigo, nombre, status) values('406','Kazajstan', 'ACTIVO');
insert into pais(codigo, nombre, status) values('410','Kenya', 'ACTIVO');
insert into pais(codigo, nombre, status) values('412','Kirguizistan', 'ACTIVO');
insert into pais(codigo, nombre, status) values('411','Kiribati', 'ACTIVO');
insert into pais(codigo, nombre, status) values('413','Kuwait', 'ACTIVO');
insert into pais(codigo, nombre, status) values('420','Laos,Republica Popul', 'ACTIVO');
insert into pais(codigo, nombre, status) values('426','Lesotho', 'ACTIVO');
insert into pais(codigo, nombre, status) values('429','Letonia', 'ACTIVO');
insert into pais(codigo, nombre, status) values('431','Libano', 'ACTIVO');
insert into pais(codigo, nombre, status) values('434','Liberia', 'ACTIVO');
insert into pais(codigo, nombre, status) values('438','Libia(Incluye Fezzan', 'ACTIVO');
insert into pais(codigo, nombre, status) values('440','Liechtenstein', 'ACTIVO');
insert into pais(codigo, nombre, status) values('443','Lituania', 'ACTIVO');
insert into pais(codigo, nombre, status) values('445','Luxemburgo', 'ACTIVO');
insert into pais(codigo, nombre, status) values('447','Macao', 'ACTIVO');
insert into pais(codigo, nombre, status) values('448','Macedonia', 'ACTIVO');
insert into pais(codigo, nombre, status) values('450','Madagascar', 'ACTIVO');
insert into pais(codigo, nombre, status) values('455','Malasia', 'ACTIVO');
insert into pais(codigo, nombre, status) values('458','Malawi', 'ACTIVO');
insert into pais(codigo, nombre, status) values('461','Maldivas', 'ACTIVO');
insert into pais(codigo, nombre, status) values('464','Mali', 'ACTIVO');
insert into pais(codigo, nombre, status) values('467','Malta', 'ACTIVO');
insert into pais(codigo, nombre, status) values('469','Marianas Del Norte,I', 'ACTIVO');
insert into pais(codigo, nombre, status) values('474','Marruecos', 'ACTIVO');
insert into pais(codigo, nombre, status) values('472','Marshall, Islas', 'ACTIVO');
insert into pais(codigo, nombre, status) values('477','Martinica', 'ACTIVO');
insert into pais(codigo, nombre, status) values('485','Mauricio', 'ACTIVO');
insert into pais(codigo, nombre, status) values('488','Mauritania', 'ACTIVO');
insert into pais(codigo, nombre, status) values('493','Mexico', 'ACTIVO');
insert into pais(codigo, nombre, status) values('494','Micronesia,Estados F', 'ACTIVO');
insert into pais(codigo, nombre, status) values('495','Midway, Islas', 'ACTIVO');
insert into pais(codigo, nombre, status) values('496','Moldavia', 'ACTIVO');
insert into pais(codigo, nombre, status) values('498','Monaco', 'ACTIVO');
insert into pais(codigo, nombre, status) values('497','Mongolia', 'ACTIVO');
insert into pais(codigo, nombre, status) values('501','Monserrat, Isla', 'ACTIVO');
insert into pais(codigo, nombre, status) values('502','Montenegro', 'ACTIVO');
insert into pais(codigo, nombre, status) values('505','Mozambique', 'ACTIVO');
insert into pais(codigo, nombre, status) values('507','Namibia', 'ACTIVO');
insert into pais(codigo, nombre, status) values('508','Nauru', 'ACTIVO');
insert into pais(codigo, nombre, status) values('511','Navidad (Christmas)', 'ACTIVO');
insert into pais(codigo, nombre, status) values('517','Nepal', 'ACTIVO');
insert into pais(codigo, nombre, status) values('521','Nicaragua', 'ACTIVO');
insert into pais(codigo, nombre, status) values('525','Niger', 'ACTIVO');
insert into pais(codigo, nombre, status) values('528','Nigeria', 'ACTIVO');
insert into pais(codigo, nombre, status) values('531','Niue, Isla', 'ACTIVO');
insert into pais(codigo, nombre, status) values('001','Nive Isla', 'ACTIVO');
insert into pais(codigo, nombre, status) values('999','No Declarados', 'ACTIVO');
insert into pais(codigo, nombre, status) values('535','Norfolk, Isla', 'ACTIVO');
insert into pais(codigo, nombre, status) values('538','Noruega', 'ACTIVO');
insert into pais(codigo, nombre, status) values('542','Nueva Caledonia', 'ACTIVO');
insert into pais(codigo, nombre, status) values('548','Nueva Zelandia', 'ACTIVO');
insert into pais(codigo, nombre, status) values('556','Oman', 'ACTIVO');
insert into pais(codigo, nombre, status) values('573','Paises Bajos(Holanda', 'ACTIVO');
insert into pais(codigo, nombre, status) values('576','Pakistan', 'ACTIVO');
insert into pais(codigo, nombre, status) values('578','Palau, Islas', 'ACTIVO');
insert into pais(codigo, nombre, status) values('579','Palestina', 'ACTIVO');
insert into pais(codigo, nombre, status) values('580','Panama', 'ACTIVO');
insert into pais(codigo, nombre, status) values('545','Papuasia Nuev Guinea', 'ACTIVO');
insert into pais(codigo, nombre, status) values('586','Paraguay', 'ACTIVO');
insert into pais(codigo, nombre, status) values('589','Peru', 'ACTIVO');
insert into pais(codigo, nombre, status) values('593','Pitcairn, Isla', 'ACTIVO');
insert into pais(codigo, nombre, status) values('599','Polinesia Francesa', 'ACTIVO');
insert into pais(codigo, nombre, status) values('603','Polonia', 'ACTIVO');
insert into pais(codigo, nombre, status) values('607','Portugal', 'ACTIVO');
insert into pais(codigo, nombre, status) values('611','Puerto Rico', 'ACTIVO');
insert into pais(codigo, nombre, status) values('618','Qatar', 'ACTIVO');
insert into pais(codigo, nombre, status) values('628','Reino Unido', 'ACTIVO');
insert into pais(codigo, nombre, status) values('640','Republica Centroafri', 'ACTIVO');
insert into pais(codigo, nombre, status) values('644','Republica Checa', 'ACTIVO');
insert into pais(codigo, nombre, status) values('888','Republica Democratica Del Congo', 'ACTIVO');
insert into pais(codigo, nombre, status) values('647','Republica Dominicana', 'ACTIVO');
insert into pais(codigo, nombre, status) values('660','Reunion', 'ACTIVO');
insert into pais(codigo, nombre, status) values('670','Rumania', 'ACTIVO');
insert into pais(codigo, nombre, status) values('676','Rusia', 'ACTIVO');
insert into pais(codigo, nombre, status) values('675','Rwanda', 'ACTIVO');
insert into pais(codigo, nombre, status) values('685','Sahara Occidental', 'ACTIVO');
insert into pais(codigo, nombre, status) values('677','Salomsn, Islas', 'ACTIVO');
insert into pais(codigo, nombre, status) values('687','Samoa', 'ACTIVO');
insert into pais(codigo, nombre, status) values('690','Samoa Norteamericana', 'ACTIVO');
insert into pais(codigo, nombre, status) values('695','San Cristobal Y Nieves', 'ACTIVO');
insert into pais(codigo, nombre, status) values('697','San Marino', 'ACTIVO');
insert into pais(codigo, nombre, status) values('700','San Pedro Y Miguelon', 'ACTIVO');
insert into pais(codigo, nombre, status) values('705','San Vicente Y Las Gr', 'ACTIVO');
insert into pais(codigo, nombre, status) values('710','Santa Elena', 'ACTIVO');
insert into pais(codigo, nombre, status) values('715','Santa Lucia', 'ACTIVO');
insert into pais(codigo, nombre, status) values('720','Santo Tome Y Princip', 'ACTIVO');
insert into pais(codigo, nombre, status) values('728','Senegal', 'ACTIVO');
insert into pais(codigo, nombre, status) values('032','Serbia', 'ACTIVO');
insert into pais(codigo, nombre, status) values('731','Seychelles', 'ACTIVO');
insert into pais(codigo, nombre, status) values('735','Sierra Leona', 'ACTIVO');
insert into pais(codigo, nombre, status) values('741','Singapur', 'ACTIVO');
insert into pais(codigo, nombre, status) values('744','Siria,Republica Arab', 'ACTIVO');
insert into pais(codigo, nombre, status) values('748','Somalia', 'ACTIVO');
insert into pais(codigo, nombre, status) values('750','Sri Lanka', 'ACTIVO');
insert into pais(codigo, nombre, status) values('756','Sudafrica,Republica', 'ACTIVO');
insert into pais(codigo, nombre, status) values('759','Sudan', 'ACTIVO');
insert into pais(codigo, nombre, status) values('764','Suecia', 'ACTIVO');
insert into pais(codigo, nombre, status) values('767','Suiza', 'ACTIVO');
insert into pais(codigo, nombre, status) values('770','Surinam', 'ACTIVO');
insert into pais(codigo, nombre, status) values('773','Swazilandia', 'ACTIVO');
insert into pais(codigo, nombre, status) values('774','Tadjikistan', 'ACTIVO');
insert into pais(codigo, nombre, status) values('776','Tailandia', 'ACTIVO');
insert into pais(codigo, nombre, status) values('218','Taiwan (Formosa)', 'ACTIVO');
insert into pais(codigo, nombre, status) values('780','Tanzania,Republica U', 'ACTIVO');
insert into pais(codigo, nombre, status) values('786','Terri Antartico Brit', 'ACTIVO');
insert into pais(codigo, nombre, status) values('787','Territori Britanico', 'ACTIVO');
insert into pais(codigo, nombre, status) values('788','Timor Del Este', 'ACTIVO');
insert into pais(codigo, nombre, status) values('800','Togo', 'ACTIVO');
insert into pais(codigo, nombre, status) values('805','Tokelau', 'ACTIVO');
insert into pais(codigo, nombre, status) values('810','Tonga', 'ACTIVO');
insert into pais(codigo, nombre, status) values('815','Trinidad Y Tobago', 'ACTIVO');
insert into pais(codigo, nombre, status) values('820','Tunicia', 'ACTIVO');
insert into pais(codigo, nombre, status) values('823','Turcas Y Caicos,Isla', 'ACTIVO');
insert into pais(codigo, nombre, status) values('825','Turkmenistan', 'ACTIVO');
insert into pais(codigo, nombre, status) values('827','Turquia', 'ACTIVO');
insert into pais(codigo, nombre, status) values('828','Tuvalu', 'ACTIVO');
insert into pais(codigo, nombre, status) values('830','Ucrania', 'ACTIVO');
insert into pais(codigo, nombre, status) values('833','Uganda', 'ACTIVO');
insert into pais(codigo, nombre, status) values('845','Uruguay', 'ACTIVO');
insert into pais(codigo, nombre, status) values('847','Uzbekistan', 'ACTIVO');
insert into pais(codigo, nombre, status) values('551','Vanuatu', 'ACTIVO');
insert into pais(codigo, nombre, status) values('850','Venezuela', 'ACTIVO');
insert into pais(codigo, nombre, status) values('855','Vietnam', 'ACTIVO');
insert into pais(codigo, nombre, status) values('863','Virgenes,Islas(Brita', 'ACTIVO');
insert into pais(codigo, nombre, status) values('866','Virgenes,Islas(Norte', 'ACTIVO');
insert into pais(codigo, nombre, status) values('875','Wallis Y Fortuna,Isl', 'ACTIVO');
insert into pais(codigo, nombre, status) values('880','Yemen', 'ACTIVO');
insert into pais(codigo, nombre, status) values('885','Yugoslavia', 'ACTIVO');
insert into pais(codigo, nombre, status) values('890','Zambia', 'ACTIVO');
insert into pais(codigo, nombre, status) values('665','Zimbabwe', 'ACTIVO');
insert into pais(codigo, nombre, status) values('895','Zona Canal De Panama', 'ACTIVO');
insert into pais(codigo, nombre, status) values('897','Zona Neutral(Palesta', 'ACTIVO');

insert into departamento(codigo,codpais,nombre, status) values('05',48,'Antioquia', 'ACTIVO');
insert into departamento(codigo,codpais,nombre, status) values('08',48,'Atlantico', 'ACTIVO');
insert into departamento(codigo,codpais,nombre, status) values('11',48,'Bogota D.C', 'ACTIVO');
insert into departamento(codigo,codpais,nombre, status) values('13',48,'Bolivar', 'ACTIVO');
insert into departamento(codigo,codpais,nombre, status) values('15',48,'Boyaca', 'ACTIVO');
insert into departamento(codigo,codpais,nombre, status) values('17',48,'Caldas', 'ACTIVO');
insert into departamento(codigo,codpais,nombre, status) values('18',48,'Caqueta', 'ACTIVO');
insert into departamento(codigo,codpais,nombre, status) values('19',48,'Cauca', 'ACTIVO');
insert into departamento(codigo,codpais,nombre, status) values('20',48,'Cesar', 'ACTIVO');
insert into departamento(codigo,codpais,nombre, status) values('23',48,'Cordoba', 'ACTIVO');
insert into departamento(codigo,codpais,nombre, status) values('25',48,'Cundinamarca', 'ACTIVO');
insert into departamento(codigo,codpais,nombre, status) values('27',48,'Choco', 'ACTIVO');
insert into departamento(codigo,codpais,nombre, status) values('41',48,'Huila', 'ACTIVO');
insert into departamento(codigo,codpais,nombre, status) values('44',48,'La Guajira', 'ACTIVO');
insert into departamento(codigo,codpais,nombre, status) values('47',48,'Magdalena', 'ACTIVO');
insert into departamento(codigo,codpais,nombre, status) values('50',48,'Meta', 'ACTIVO');
insert into departamento(codigo,codpais,nombre, status) values('52',48,'Narino', 'ACTIVO');
insert into departamento(codigo,codpais,nombre, status) values('54',48,'Norte de Santander', 'ACTIVO');
insert into departamento(codigo,codpais,nombre, status) values('63',48,'Quindio', 'ACTIVO');
insert into departamento(codigo,codpais,nombre, status) values('66',48,'Risaralda', 'ACTIVO');
insert into departamento(codigo,codpais,nombre, status) values('68',48,'Santander', 'ACTIVO');
insert into departamento(codigo,codpais,nombre, status) values('70',48,'Sucre', 'ACTIVO');
insert into departamento(codigo,codpais,nombre, status) values('73',48,'Tolima', 'ACTIVO');
insert into departamento(codigo,codpais,nombre, status) values('76',48,'Valle del Cauca', 'ACTIVO');
insert into departamento(codigo,codpais,nombre, status) values('81',48,'Arauca', 'ACTIVO');
insert into departamento(codigo,codpais,nombre, status) values('85',48,'Casanare', 'ACTIVO');
insert into departamento(codigo,codpais,nombre, status) values('86',48,'PutuMayo', 'ACTIVO');
insert into departamento(codigo,codpais,nombre, status) values('88',48,'San Andres', 'ACTIVO');
insert into departamento(codigo,codpais,nombre, status) values('91',48,'Amazonas', 'ACTIVO');
insert into departamento(codigo,codpais,nombre, status) values('94',48,'Guainia', 'ACTIVO');
insert into departamento(codigo,codpais,nombre, status) values('95',48,'Guaviare', 'ACTIVO');
insert into departamento(codigo,codpais,nombre, status) values('97',48,'Vaupes', 'ACTIVO');
insert into departamento(codigo,codpais,nombre, status) values('99',48,'Vichada', 'ACTIVO');
insert into departamento(codigo,codpais,nombre, status) values('05',236,'Barquisimeto', 'ACTIVO');
insert into departamento(codigo,codpais,nombre, status) values('05',236,'Guanare', 'ACTIVO');
insert into municipio(codigo,codciudad,coddepartamento,nombre, status) values('001','05001',1,'Medellin', 'ACTIVO');
insert into municipio(codigo,codciudad,coddepartamento,nombre, status) values('002','05002',1,'Abejorral', 'ACTIVO');
insert into municipio(codigo,codciudad,coddepartamento,nombre, status) values('004','05004',1,'Abriaqui', 'ACTIVO');
insert into municipio(codigo,codciudad,coddepartamento,nombre, status) values('021','05021',1,'Alejandria', 'ACTIVO');

insert into municipio(codigo,codciudad,coddepartamento,nombre, status) values('030','05030',1,'Amaga', 'ACTIVO');
insert into municipio(codigo,codciudad,coddepartamento,nombre, status) values('031','05031',1,'Amalfi', 'ACTIVO');
insert into municipio(codigo,codciudad,coddepartamento,nombre, status) values('034','05034',1,'Andes', 'ACTIVO');
insert into municipio(codigo,codciudad,coddepartamento,nombre, status) values('036','05036',1,'Angelopolis', 'ACTIVO');
insert into municipio(codigo,codciudad,coddepartamento,nombre, status) values('038','05038',1,'Angostura', 'ACTIVO');
insert into municipio(codigo,codciudad,coddepartamento,nombre, status) values('040','05040',1,'Anori', 'ACTIVO');
insert into municipio(codigo,codciudad,coddepartamento,nombre, status) values('040','05040',1,'Anori', 'ACTIVO');
insert into municipio(codigo,codciudad,coddepartamento,nombre, status) values('042','05042',1,'Santafe de Antioquia', 'ACTIVO');
insert into municipio(codigo,codciudad,coddepartamento,nombre, status) values('044','05044',1,'Anza', 'ACTIVO');
insert into municipio(codigo,codciudad,coddepartamento,nombre, status) values('045','05045',1,'Apartado', 'ACTIVO');
insert into municipio(codigo,codciudad,coddepartamento,nombre, status) values('051','05051',1,'Arboletes', 'ACTIVO');
insert into municipio(codigo,codciudad,coddepartamento,nombre, status) values('055','05055',1,'Argelia', 'ACTIVO');
insert into municipio(codigo,codciudad,coddepartamento,nombre, status) values('059','05059',1,'Armenia', 'ACTIVO');
insert into municipio(codigo,codciudad,coddepartamento,nombre, status) values('079','05079',1,'Barbosa', 'ACTIVO');
insert into municipio(codigo,codciudad,coddepartamento,nombre, status) values('086','05086',1,'Belmira', 'ACTIVO');
insert into municipio(codigo,codciudad,coddepartamento,nombre, status) values('088','05088',1,'Bello', 'ACTIVO');
insert into municipio(codigo,codciudad,coddepartamento,nombre, status) values('091','05091',1,'Betania', 'ACTIVO');
insert into municipio(codigo,codciudad,coddepartamento,nombre, status) values('093','05093',1,'Betulia', 'ACTIVO');
insert into municipio(codigo,codciudad,coddepartamento,nombre, status) values('101','05101',1,'Ciudad Bolivar', 'ACTIVO');
insert into municipio(codigo,codciudad,coddepartamento,nombre, status) values('107','05107',1,'Briceno', 'ACTIVO');
insert into municipio(codigo,codciudad,coddepartamento,nombre, status) values('113','05113',1,'Buritica', 'ACTIVO');
insert into municipio(codigo,codciudad,coddepartamento,nombre, status) values('120','05120',1,'Caceres', 'ACTIVO');
insert into municipio(codigo,codciudad,coddepartamento,nombre, status) values('125','05125',1,'Caicedo', 'ACTIVO');
insert into municipio(codigo,codciudad,coddepartamento,nombre, status) values('129','05129',1,'Caldas', 'ACTIVO');
insert into municipio(codigo,codciudad,coddepartamento,nombre, status) values('134','05134',1,'Campamento', 'ACTIVO');
insert into municipio(codigo,codciudad,coddepartamento,nombre, status) values('138','05138',1,'Canasgordas', 'ACTIVO');
insert into municipio(codigo,codciudad,coddepartamento,nombre, status) values('142','05142',1,'Caracoli', 'ACTIVO');

insert into municipio(codigo,codciudad,coddepartamento,nombre, status) values('145','05145',1,'Caramanta', 'ACTIVO');
insert into municipio(codigo,codciudad,coddepartamento,nombre, status) values('147','05147',1,'Carepa', 'ACTIVO');
insert into municipio(codigo,codciudad,coddepartamento,nombre, status) values('148','05148',1,'El Carmen de Viboral', 'ACTIVO');
insert into municipio(codigo,codciudad,coddepartamento,nombre, status) values('150','05150',1,'Carolina', 'ACTIVO');
insert into municipio(codigo,codciudad,coddepartamento,nombre, status) values('154','05154',1,'Caucasia', 'ACTIVO');
insert into municipio(codigo,codciudad,coddepartamento,nombre, status) values('172','05172',1,'Chigorodo', 'ACTIVO');
insert into municipio(codigo,codciudad,coddepartamento,nombre, status) values('190','05190',1,'Cisneros', 'ACTIVO');
insert into municipio(codigo,codciudad,coddepartamento,nombre, status) values('197','05197',1,'Cocorna', 'ACTIVO');
insert into municipio(codigo,codciudad,coddepartamento,nombre, status) values('206','05206',1,'Concepcion', 'ACTIVO');
insert into municipio(codigo,codciudad,coddepartamento,nombre, status) values('209','05209',1,'Concordia', 'ACTIVO');
insert into listaprecio(numerolista,vigentedesde,tarifa,fechasistem,status, vigente,codnegocio,codmoneda,simbolo) values('Ninguna','2020-11-19','','2020-11-19','','',1,'','')








































































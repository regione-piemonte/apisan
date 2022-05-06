CREATE TABLE apisan_fse_d_accessi_servizio (
	fse_d_accessi_servizio_id bigserial NOT NULL,
	codice_verticale varchar(50) NULL,
	codice_servizio varchar(50) NOT NULL,
	descrizione_servizio varchar(50) NOT NULL,
	CONSTRAINT apisan_fse_d_accessi_servizio_pk PRIMARY KEY (fse_d_accessi_servizio_id)
);

CREATE TABLE apisan_fse_d_applicativo_verticale (
	fse_d_applicativo_verticale_id serial NOT NULL,
	codice varchar(30) NOT NULL,
	descrizione varchar(200) NULL,
	CONSTRAINT apisan_fse_d_applicativo_verticale_pk PRIMARY KEY (fse_d_applicativo_verticale_id)
);

CREATE TABLE apisan_fse_d_categoria (
	fse_d_categoria_id serial NOT NULL,
	codice varchar NOT NULL,
	descrizione varchar(200) NULL,
	CONSTRAINT apisan_fse_d_categoria_pk PRIMARY KEY (fse_d_categoria_id)
);

CREATE TABLE apisan_fse_d_costanti (
	chiave varchar(50) NULL,
	valore varchar(200) NULL
);

CREATE TABLE apisan_fse_d_errore_presentation (
	id int4 NOT NULL,
	code bpchar(64) NOT NULL,
	status int4 NOT NULL,
	title bpchar(1024) NOT NULL,
	CONSTRAINT apisan_fse_d_errore_presentation_pkey PRIMARY KEY (id)
);

CREATE TABLE apisan_fse_d_errore_business (
	fse_d_errore_business_id bigserial NOT NULL,
	cod_err varchar(10) NOT NULL,
	fse_d_presentation_id int4 NOT NULL,
	CONSTRAINT apisan_fse_d_errore_business_pk PRIMARY KEY (fse_d_errore_business_id)
);


-- apisan_fse_d_errore_business foreign keys

ALTER TABLE apisan_fse_d_errore_business ADD CONSTRAINT apisan_fse_d_errore_business_apisan_fse_d_errore_presentation FOREIGN KEY (fse_d_presentation_id) REFERENCES apisan_fse_d_errore_presentation(id);


CREATE TABLE apisan_fse_d_tipo_documento (
	fse_d_tipo_documento_id serial NOT NULL,
	codice varchar(30) NOT NULL,
	descrizione varchar(200) NULL,
	CONSTRAINT apisan_fse_d_tipo_documento_pk PRIMARY KEY (fse_d_tipo_documento_id)
);

CREATE TABLE apisan_fse_d_tipo_episodio (
	fse_d_tipo_episodio_id serial NOT NULL,
	codice varchar(30) NOT NULL,
	descrizione varchar(200) NULL,
	CONSTRAINT apisan_fse_d_tipo_episodio_pk PRIMARY KEY (fse_d_tipo_episodio_id)
);

CREATE TABLE apisan_fse_r_categoria_tipodoc (
	fse_r_categoria_tipodoc_id serial NOT NULL,
	fse_categoria_id int4 NOT NULL,
	fse_tipo_documento_id int4 NOT NULL,
	fse_applicativo_verticale_id int4 NOT NULL,
	validita_inizio timestamp NULL,
	validita_fine timestamp NULL,
	CONSTRAINT apisan_fse_r_categoria_tipodoc_pk PRIMARY KEY (fse_r_categoria_tipodoc_id)
);


-- apisan_fse_r_categoria_tipodoc foreign keys

ALTER TABLE apisan_fse_r_categoria_tipodoc ADD CONSTRAINT apisan_fse_r_categoria_tipodoc_fk FOREIGN KEY (fse_categoria_id) REFERENCES apisan_fse_d_categoria(fse_d_categoria_id);
ALTER TABLE apisan_fse_r_categoria_tipodoc ADD CONSTRAINT apisan_fse_r_categoria_tipodoc_fk_1 FOREIGN KEY (fse_tipo_documento_id) REFERENCES apisan_fse_d_tipo_documento(fse_d_tipo_documento_id);
ALTER TABLE apisan_fse_r_categoria_tipodoc ADD CONSTRAINT apisan_fse_r_categoria_tipodoc_fk_2 FOREIGN KEY (fse_applicativo_verticale_id) REFERENCES apisan_fse_d_applicativo_verticale(fse_d_applicativo_verticale_id);


CREATE TABLE apisan_fse_t_log_chiamate (
	fse_t_log_chiamate_id bigserial NOT NULL,
	x_request_id varchar(200) NULL,
	cf_chiamante varchar(16) NULL,
	x_codice_servizio varchar(50) NULL,
	ip_chiamante varchar(200) NULL,
	cf_richiedente varchar(16) NULL,
	componente varchar(20) NULL,
	esito_chiamata int4 NULL,
	request_payload bytea NULL,
	response_payload bytea NULL,
	request_date timestamp NULL,
	response_date timestamp NULL,
	millis_response int8 NULL,
	metodo varchar(20) NULL,
	request_uri varchar(200) NULL,
	CONSTRAINT apisan_fse_t_log_chiamate_pk PRIMARY KEY (fse_t_log_chiamate_id)
);
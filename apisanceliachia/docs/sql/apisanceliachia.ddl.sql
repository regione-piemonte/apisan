
CREATE TABLE apisan_celiachia_t_log_chiamate (
	celiachia_chiamate_id bigserial NOT NULL,
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
	CONSTRAINT apisan_celiachia_t_log_chiamate_pk PRIMARY KEY (celiachia_chiamate_id)
);



CREATE TABLE apisan_celiachia_d_errore_presentation (
	id int4 NOT NULL,
	code varchar(30) NOT NULL,
	status int4 NOT NULL,
	title varchar(100) NOT NULL,
	CONSTRAINT apisan_celiachia_d_errore_presentation_pkey PRIMARY KEY (id)
);


CREATE TABLE apisan_celiachia_d_errore_business (
	celiachia_d_errore_business_id bigserial NOT NULL,
	cod_err varchar(10) NOT NULL,
	celiachia_d_presentation_id int4 NOT NULL,
	desc_err varchar NULL,
	CONSTRAINT apisan_celiachia_d_errore_business_pk PRIMARY KEY (celiachia_d_errore_business_id)
);



ALTER TABLE apisan_celiachia_d_errore_business ADD CONSTRAINT apisan_celiachia_d_errore_business_apisan_celiachia_d_errore_pr FOREIGN KEY (celiachia_d_presentation_id) REFERENCES apisan_celiachia_d_errore_presentation(id);
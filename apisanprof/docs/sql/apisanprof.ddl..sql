CREATE TABLE apisan_prof_t_log_chiamate (
	prof_chiamate_id bigserial NOT NULL,
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
	request_uri varchar(400) NULL,
	CONSTRAINT apisan_prof_t_log_chiamate_pk PRIMARY KEY (prof_chiamate_id)
);
CREATE TABLE apisan_prof_d_configurazione (
	codice varchar(30) NOT NULL,
	valore int4 NOT NULL,
	CONSTRAINT apisan_apisan_prof_d_configurazione_pk PRIMARY KEY (codice)
);